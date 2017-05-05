// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.7

    package io.kwu.kythera.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KytheraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KytheraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KytheraParser#objRigidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjRigidType(KytheraParser.ObjRigidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#objTypeEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjTypeEntry(KytheraParser.ObjTypeEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnType(KytheraParser.FnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnTypeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnTypeArg(KytheraParser.FnTypeArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnTypeReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnTypeReturn(KytheraParser.FnTypeReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#objLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteral(KytheraParser.ObjLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#objLiteralEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteralEntry(KytheraParser.ObjLiteralEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnLiteral(KytheraParser.FnLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnLiteralArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnLiteralArg(KytheraParser.FnLiteralArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KytheraParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KytheraParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(KytheraParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KytheraParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#fnCallParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnCallParamList(KytheraParser.FnCallParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#expBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBlock(KytheraParser.ExpBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(KytheraParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(KytheraParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#nameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStatement(KytheraParser.NameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(KytheraParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(KytheraParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(KytheraParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KytheraParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(KytheraParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(KytheraParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(KytheraParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(KytheraParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KytheraParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KytheraParser.ProgramContext ctx);
}