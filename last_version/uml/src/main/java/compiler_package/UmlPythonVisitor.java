package compiler_package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler_package.UmlParser.TypeRuleContext;

public class UmlPythonVisitor extends UmlBaseVisitor<String> {
	
	String currentClass;
	
    // Visita la regola di inizio (start)
    @Override
    public String visitStart(UmlParser.StartContext ctx) {
        StringBuilder result = new StringBuilder();

        // Visita tutte le definizioni di classe
        for (UmlParser.ClassDefinitionRuleContext classDefCtx : ctx.classDefinitionRule()) {
            result.append(visit(classDefCtx)).append("\n\n");
        }

        // Visita tutte le relazioni
        if (ctx.relationsDefinitionRule() != null) {
            result.append(visit(ctx.relationsDefinitionRule()));
        }
        return result.toString();
    }

    // Visita la definizione di una classe
    @Override
    public String visitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx) {
        StringBuilder result = new StringBuilder();

        // Verifica se la classe è astratta
        boolean isAbstract = ctx.ABSTRACT() != null;

        // Ottiene il nome della classe
        String className = ctx.c.getText();
        currentClass = className;
        result.append("class ").append(className);

        // Controlla se c'è una classe padre
        /*if (ctx.EXTENDS() != null) {
            result.append("(").append(ctx.EXTENDS().getText()).append(")");
        }*/

        result.append(":\n");

        // Aggiungi il corpo della classe
        result.append(visit(ctx.classCodeRule()));

        if (isAbstract) {
            result.insert(0, "from abc import ABC, abstractmethod\n\n");
            result.insert(result.indexOf("class " + className) + ("class " + className).length(), "(ABC)");
        }
        return result.toString();
    }

    // Visita il codice della classe
    @Override
    public String visitClassCodeRule(UmlParser.ClassCodeRuleContext ctx) {
        StringBuilder result = new StringBuilder();

        // Aggiungi attributi e metodi
        for (ParseTree child : ctx.children) {
        	if(visit(child) == null) continue;
            result.append("    ").append(visit(child)).append("\n");
        }
        return result.length() > 0 ? result.toString() : "    pass\n";
    }

    // Visita la dichiarazione di un attributo
    @Override
    public String visitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx) {
        String visibility = visit(ctx.visibilityRule());
        String attrType = ctx.typeRule().getText();
        String attrName = ctx.a.getText();
        attrType = attrType.equals("String") ? "str" : attrType;

        return String.format("%s%s: %s = None", visibility, attrName, attrType);
    }

    // Visita la dichiarazione di un'operazione (metodo)
    @Override
    public String visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx) {
        StringBuilder method = new StringBuilder();

        // Extract visibility, method name, and return type (which could be null)
        String visibility = visit(ctx.visibilityRule());
        String methodName = ctx.a.getText();
        String returnType = methodName.equals(currentClass) ? null : ctx.typeRule(0).getText(); // Handle null return type

        if (returnType == null) {
            methodName = "__init__";
        	//ctx.typeRule().add(0, ctx.typeRule(0));
        	//ctx.ID().add(0, ctx.ID(0));
        }
        
        if ("String".equals(returnType)) {
            returnType = "str";
        }

        // List to hold parameters
        List<String> params = new ArrayList<>(); 

        // Add parameters from typeRule and ID (skipping the first one, which is typically the return type)
        for (int i = 1; i < ctx.typeRule().size(); i++) {
            params.add(ctx.ID(i).getText() + ":" + ctx.typeRule(i).getText());
        }

        // Always add `self` as the first parameter
        params.add(0, "self");

        // Start building the method signature
        String methodSignature = String.format("def %s%s(%s)", visibility, methodName, String.join(", ", params));

        // If returnType is non-null and non-empty (not "void"), add it to the signature
        if (returnType != null && !returnType.isEmpty() && !"void".equals(returnType)) {
            methodSignature += " -> " + returnType;
        }

        // Add the method body with a placeholder "pass"
        method.append(methodSignature).append(":\n        pass");
        return method.toString();
    }

    // Visita la visibilità (pubblica, privata, ecc.)
    @Override
    public String visitVisibilityRule(UmlParser.VisibilityRuleContext ctx) {
        if (ctx.PUBLIC() != null) return ""; // Public (nessun prefisso in Python)
        if (ctx.PRIVATE() != null) return "__"; // Private
        if (ctx.PROTECTED() != null) return "_"; // Protected
        return "";
    }

    // Visita la regola delle relazioni
    @Override
    public String visitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx) {
        StringBuilder relations = new StringBuilder("# Relations\n");

        for (UmlParser.RelationCodeRuleContext relCtx : ctx.relationCodeRule()) {
            relations.append(visit(relCtx)).append("\n");
        }

        return relations.toString();
    }

    // Visita la definizione di una relazione specifica
    @Override
    public String visitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx) {
        String relationName = ctx.nameRelation.getText();
        String class1 = ctx.nameClass1.getText();
        String class2 = ctx.nameClass2.getText();

        return String.format("# %s between %s and %s", relationName, class1, class2);
    }
}
