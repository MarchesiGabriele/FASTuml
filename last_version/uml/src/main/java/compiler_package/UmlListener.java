// Generated from Uml.g4 by ANTLR 4.13.2

    package compiler_package;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UmlParser}.
 */
public interface UmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UmlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(UmlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(UmlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#classDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#classDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#enumDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinitionRule(UmlParser.EnumDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#enumDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinitionRule(UmlParser.EnumDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#relationsDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void enterRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#relationsDefinitionRule}.
	 * @param ctx the parse tree
	 */
	void exitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#classCodeRule}.
	 * @param ctx the parse tree
	 */
	void enterClassCodeRule(UmlParser.ClassCodeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#classCodeRule}.
	 * @param ctx the parse tree
	 */
	void exitClassCodeRule(UmlParser.ClassCodeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#enumCodeRule}.
	 * @param ctx the parse tree
	 */
	void enterEnumCodeRule(UmlParser.EnumCodeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#enumCodeRule}.
	 * @param ctx the parse tree
	 */
	void exitEnumCodeRule(UmlParser.EnumCodeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#relationCodeRule}.
	 * @param ctx the parse tree
	 */
	void enterRelationCodeRule(UmlParser.RelationCodeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#relationCodeRule}.
	 * @param ctx the parse tree
	 */
	void exitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#attributeDeclarationRule}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#attributeDeclarationRule}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#visibilityRule}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityRule(UmlParser.VisibilityRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#visibilityRule}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityRule(UmlParser.VisibilityRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#arrayTypeRule}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeRule(UmlParser.ArrayTypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#arrayTypeRule}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeRule(UmlParser.ArrayTypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#typeRule}.
	 * @param ctx the parse tree
	 */
	void enterTypeRule(UmlParser.TypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#typeRule}.
	 * @param ctx the parse tree
	 */
	void exitTypeRule(UmlParser.TypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#relationTypeRule}.
	 * @param ctx the parse tree
	 */
	void enterRelationTypeRule(UmlParser.RelationTypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#relationTypeRule}.
	 * @param ctx the parse tree
	 */
	void exitRelationTypeRule(UmlParser.RelationTypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#multiplicityRule}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicityRule(UmlParser.MultiplicityRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#multiplicityRule}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicityRule(UmlParser.MultiplicityRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UmlParser#operationDeclarationRule}.
	 * @param ctx the parse tree
	 */
	void enterOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmlParser#operationDeclarationRule}.
	 * @param ctx the parse tree
	 */
	void exitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx);
}