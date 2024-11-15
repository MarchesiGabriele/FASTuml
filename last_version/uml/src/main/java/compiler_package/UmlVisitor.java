// Generated from Uml.g4 by ANTLR 4.13.2

    package compiler_package;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UmlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(UmlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#classDefinitionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinitionRule(UmlParser.ClassDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#enumDefinitionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinitionRule(UmlParser.EnumDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#relationsDefinitionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationsDefinitionRule(UmlParser.RelationsDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#classCodeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCodeRule(UmlParser.ClassCodeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#enumCodeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumCodeRule(UmlParser.EnumCodeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#relationCodeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCodeRule(UmlParser.RelationCodeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#attributeDeclarationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclarationRule(UmlParser.AttributeDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#visibilityRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityRule(UmlParser.VisibilityRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#arrayTypeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeRule(UmlParser.ArrayTypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#typeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRule(UmlParser.TypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#relationTypeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationTypeRule(UmlParser.RelationTypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#multiplicityRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicityRule(UmlParser.MultiplicityRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#operationDeclarationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDeclarationRule(UmlParser.OperationDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UmlParser#constructorDeclarationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationRule(UmlParser.ConstructorDeclarationRuleContext ctx);
}