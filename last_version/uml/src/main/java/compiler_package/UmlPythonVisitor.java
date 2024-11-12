package compiler_package;

import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;

public class UmlPythonVisitor extends UmlBaseVisitor<String> {

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

        return String.format("%s%s: %s", visibility, attrName, attrType);
    }

    @Override
    public String visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx) {
        StringBuilder method = new StringBuilder();

        String visibility = visit(ctx.visibilityRule());
        String returnType = ctx.typeRule(0).getText();
        String methodName = ctx.a.getText();

        // Parametri del metodo
        List<String> params = ctx.LP() != null 
            ? ctx.typeRule().stream().map(UmlParser.TypeRuleContext::getText).collect(Collectors.toList()) 
            : new ArrayList<>(); // Inizializza come una nuova ArrayList vuota
        params.add(0, "self");  // aggiunge `self` come primo parametro

        method.append(String.format("%sdef %s(%s) -> %s:\n    pass", visibility, methodName, String.join(", ", params), returnType));

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
