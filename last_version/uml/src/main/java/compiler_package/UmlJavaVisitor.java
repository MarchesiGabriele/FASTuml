package compiler_package;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler_package.UmlParser.ClassDefinitionRuleContext;
import compiler_package.UmlParser.RelationCodeRuleContext;

public class UmlJavaVisitor extends UmlBaseVisitor<String> {

    @Override
    public String visitStart(UmlParser.StartContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        
        // Visita tutte le classi definite
        for (ClassDefinitionRuleContext classDef : ctx.classDefinitionRule()) {
            javaCode.append(visit(classDef)).append("\n");
        }
        
        // Visita le relazioni (opzionale)
        if (ctx.relationsDefinitionRule() != null) {
            javaCode.append(visit(ctx.relationsDefinitionRule())).append("\n");
        }

        return javaCode.toString();
    }

    @Override
    public String visitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx) {
        String className = ctx.c.getText();
        String classKeyword = ctx.ABSTRACT() != null ? "abstract class" : "class";
        
        StringBuilder classCode = new StringBuilder();
        classCode.append(classKeyword).append(" ").append(className).append(" {\n");

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
                code.append(visit((UmlParser.OperationDeclarationRuleContext) child)).append("\n");
            }
        }
        
        return code.toString();
    }

    @Override
    public String visitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx) {
        String visibility = visit(ctx.visibilityRule());
        String type = ctx.typeRule().getText();
        String attributeName = ctx.a.getText();
        
        // Array handling
        if (ctx.arrayTypeRule() != null) {
            type += "[]";
        }

        StringBuilder attrCode = new StringBuilder();
        attrCode.append(visibility).append(" ").append(type).append(" ").append(attributeName);
        
        if (ctx.d != null) {
            attrCode.append(" = ").append(ctx.d.getText());
        }
        
        attrCode.append(";");
        return attrCode.toString();
    }

    @Override
    public String visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx) {
        String visibility = visit(ctx.visibilityRule());
        String returnType = ctx.typeRule(0).getText(); // TODO FIX
        String methodName = ctx.a.getText();
        
        StringBuilder operationCode = new StringBuilder();
        operationCode.append(visibility).append(" ").append(returnType).append(" ").append(methodName).append("(");
        
        // Aggiungi i parametri
        for (int i = 1; i < ctx.typeRule().size(); i++) {
            if (i > 1) operationCode.append(", ");
            operationCode.append(ctx.typeRule(i).getText()).append(" ").append(ctx.ID(i).getText());
        }
        
        operationCode.append(") {\n    // TODO: implement\n}\n");
        return operationCode.toString();
    }

    @Override
    public String visitVisibilityRule(UmlParser.VisibilityRuleContext ctx) {
        if (ctx.PUBLIC() != null) return "public";
        if (ctx.PROTECTED() != null) return "protected";
        if (ctx.PRIVATE() != null) return "private";
        if (ctx.PACKAGE() != null) return "";  // Package-private in Java
        return "";
    }

    @Override
    public String visitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx) {
        StringBuilder relationsCode = new StringBuilder("// Relations\n");
        for (RelationCodeRuleContext relation : ctx.relationCodeRule()) {
            relationsCode.append(visit(relation)).append("\n");
        }
        return relationsCode.toString();
    }

    @Override
    public String visitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx) {
        String class1 = ctx.nameClass1.getText();
        String class2 = ctx.nameClass2.getText();
        String relationType = ctx.relationTypeRule().getText();
        String relation = "// Relation between " + class1 + " and " + class2 + ": " + relationType;
        return relation;
    }
}
