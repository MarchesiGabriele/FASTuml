package compiler_package;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

import compiler_package.UmlParser.ClassDefinitionRuleContext;
import compiler_package.UmlParser.EnumCodeRuleContext;
import compiler_package.UmlParser.EnumDefinitionRuleContext;
import compiler_package.UmlParser.RelationCodeRuleContext;

public class UmlJavaVisitor extends UmlBaseVisitor<String> {
    private String currentClass;
    private Map<String, String> classInheritanceMap = new HashMap<>(); // Mappa per le relazioni di ereditarietà
    private StringBuilder relationsInfo = new StringBuilder(); // Per memorizzare le relazioni dettagliate

    @Override
    public String visitStart(UmlParser.StartContext ctx) {
        StringBuilder javaCode = new StringBuilder();

        // Memorizza le relazioni prima di visitare le classi
        if (ctx.relationsDefinitionRule() != null) {
            visit(ctx.relationsDefinitionRule());
        }

        // Visita tutte le classi definite
        for (ClassDefinitionRuleContext classDef : ctx.classDefinitionRule()) {
            javaCode.append(visit(classDef)).append("\n");
        }
        
        // Visita tutte le definizioni degli enum
        for (EnumDefinitionRuleContext enumDef : ctx.enumDefinitionRule()) {
            javaCode.append(visit(enumDef)).append("\n");
        }

        // Aggiungi informazioni sulle relazioni alla fine del codice generato
        javaCode.append(relationsInfo);

        return javaCode.toString();
    }

    @Override
    public String visitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx) {
        String className = ctx.c.getText();
        currentClass = className;
        String classKeyword = ctx.ABSTRACT() != null ? "abstract class" : "class";
        

        // Aggiungi "extends" se la classe ha una superclass
        String extendsClause = "";
        if (classInheritanceMap.containsKey(className)) {
            extendsClause = " extends " + classInheritanceMap.get(className);
        }

        StringBuilder classCode = new StringBuilder();
        classCode.append(classKeyword).append(" ").append(className).append(extendsClause).append(" {\n");

        // Genera il codice per il corpo della classe
        classCode.append(visit(ctx.classCodeRule())).append("}\n");

        return classCode.toString();
    }

    @Override
    public String visitClassCodeRule(UmlParser.ClassCodeRuleContext ctx) {
        StringBuilder code = new StringBuilder();

        // Itera sugli attributi e operazioni
        for (ParseTree child : ctx.children) {
            if (child instanceof UmlParser.AttributeDeclarationRuleContext) {
                code.append(visit((UmlParser.AttributeDeclarationRuleContext) child)).append("\n");
            } else if (child instanceof UmlParser.OperationDeclarationRuleContext) {
                code.append("\n").append(visit((UmlParser.OperationDeclarationRuleContext) child));
            }
        }

        return code.toString();
    }
    
    @Override
    public String visitEnumDefinitionRule(EnumDefinitionRuleContext ctx) {
        String enumName = ctx.n.getText();  // Nome dell'enum
        StringBuilder enumCode = new StringBuilder();
        enumCode.append("public enum ").append(enumName).append(" {\n");

        // Visita il corpo dell'enum per raccogliere i valori definiti
        enumCode.append(visit(ctx.enumCodeRule())).append("\n");

        enumCode.append("}");

        return enumCode.toString();
    }

    @Override
    public String visitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx) {
        for (RelationCodeRuleContext relation : ctx.relationCodeRule()) {
            visit(relation);
        }
        return "";
    }

    @Override
    public String visitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx) {
        String class1 = ctx.nameClass1.getText();
        String class2 = ctx.nameClass2.getText();
        String relationType = ctx.relationTypeRule().getText();

        switch (relationType) {
            case "inherits":
                classInheritanceMap.put(class1, class2);
                break;
            case "shared":
                relationsInfo.append("// Shared association between ").append(class1).append(" and ").append(class2).append("\n");
                break;
            case "composed":
                relationsInfo.append("// Composition between ").append(class1).append(" and ").append(class2).append("\n");
                break;
            default:
                relationsInfo.append("// Association between ").append(class1).append(" and ").append(class2).append("\n");
                break;
        }

        return ""; // Non generiamo codice direttamente qui
    }

    @Override
    public String visitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx) {
        String visibility = visit(ctx.visibilityRule());
        String type = ctx.typeRule().getText();
        String attributeName = ctx.a.getText();

        if (ctx.arrayTypeRule() != null) {
            // Se è un tipo array, aggiungiamo "List" o "Set" a seconda del tipo
            if (ctx.arrayTypeRule().getText().equals("Set")) {
                type = "Set<" + type + ">";
            } else if (ctx.arrayTypeRule().getText().equals("List")) {
                type = "List<" + type + ">";
            }
        }

        StringBuilder attrCode = new StringBuilder();
        attrCode.append("\t").append(visibility).append(" ").append(type).append(" ").append(attributeName);

        if (ctx.d != null) {
        	if (type.startsWith("Set<")) {
                attrCode.append(" = new HashSet<>(Arrays.asList(" + ctx.d.getText() + "))");
            } else if (type.startsWith("List<")) {
                attrCode.append(" = new ArrayList<>(Arrays.asList(" + ctx.d.getText() + "))");
            } else {
                attrCode.append(" = ").append(ctx.d.getText());
            }
        } else {
            if (type.startsWith("Set<")) {
                attrCode.append(" = new HashSet<" + type.substring(4, type.length() - 1) + ">()");
            } else if (type.startsWith("List<")) {
                attrCode.append(" = new ArrayList<" + type.substring(5, type.length() - 1) + ">()");
            }
        }

        attrCode.append(";");
        return attrCode.toString();
    }

    @Override
    public String visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx) {
        String visibility = visit(ctx.visibilityRule());
        String methodName = ctx.a.getText();

        StringBuilder operationCode = new StringBuilder();
        operationCode.append("\t").append(visibility);

        if (!methodName.equals(currentClass)) {
            operationCode.append(" ").append(ctx.typeRule(0).getText());
        }

        operationCode.append(" ").append(methodName).append("(");

        // Aggiungi i parametri
        for (int i = 1; i < ctx.typeRule().size(); i++) {
            if (i > 1) operationCode.append(", ");
            operationCode.append(ctx.typeRule(i).getText()).append(" ").append(ctx.ID(i).getText());
        }

        operationCode.append(") {\n\t\t// TODO: implement\n\t}\n");
        return operationCode.toString();
    }
    
    @Override
    public String visitEnumCodeRule(EnumCodeRuleContext ctx) {
        StringBuilder enumValues = new StringBuilder();

        // Aggiungi i valori dell'enum
        for (Token value : ctx.eName) {
            enumValues.append("\t").append(value.getText()).append(",\n");
        }

        // Rimuovi l'ultima virgola e aggiungi la chiusura dell'enum
        if (enumValues.length() > 0) {
            enumValues.deleteCharAt(enumValues.length() - 2);  // Rimuovi la virgola finale
        }

        return enumValues.toString();
    }

    @Override
    public String visitVisibilityRule(UmlParser.VisibilityRuleContext ctx) {
        if (ctx.PUBLIC() != null) return "public";
        if (ctx.PROTECTED() != null) return "protected";
        if (ctx.PRIVATE() != null) return "private";
        if (ctx.PACKAGE() != null) return ""; // Package-private in Java
        return "";
    }
}
