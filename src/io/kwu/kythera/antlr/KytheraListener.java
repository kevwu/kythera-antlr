// Generated from /home/dejawu/kythera/Kythera.g4 by ANTLR 4.7

    package io.kwu.kythera.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KytheraParser}.
 */
public interface KytheraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KytheraParser#objRigidType}.
	 * @param ctx the parse tree
	 */
	void enterObjRigidType(KytheraParser.ObjRigidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#objRigidType}.
	 * @param ctx the parse tree
	 */
	void exitObjRigidType(KytheraParser.ObjRigidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#objTypeEntry}.
	 * @param ctx the parse tree
	 */
	void enterObjTypeEntry(KytheraParser.ObjTypeEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#objTypeEntry}.
	 * @param ctx the parse tree
	 */
	void exitObjTypeEntry(KytheraParser.ObjTypeEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnType}.
	 * @param ctx the parse tree
	 */
	void enterFnType(KytheraParser.FnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnType}.
	 * @param ctx the parse tree
	 */
	void exitFnType(KytheraParser.FnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnTypeArg}.
	 * @param ctx the parse tree
	 */
	void enterFnTypeArg(KytheraParser.FnTypeArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnTypeArg}.
	 * @param ctx the parse tree
	 */
	void exitFnTypeArg(KytheraParser.FnTypeArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnTypeReturn}.
	 * @param ctx the parse tree
	 */
	void enterFnTypeReturn(KytheraParser.FnTypeReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnTypeReturn}.
	 * @param ctx the parse tree
	 */
	void exitFnTypeReturn(KytheraParser.FnTypeReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#objLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjLiteral(KytheraParser.ObjLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#objLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjLiteral(KytheraParser.ObjLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#objLiteralEntry}.
	 * @param ctx the parse tree
	 */
	void enterObjLiteralEntry(KytheraParser.ObjLiteralEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#objLiteralEntry}.
	 * @param ctx the parse tree
	 */
	void exitObjLiteralEntry(KytheraParser.ObjLiteralEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFnLiteral(KytheraParser.FnLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFnLiteral(KytheraParser.FnLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnLiteralArg}.
	 * @param ctx the parse tree
	 */
	void enterFnLiteralArg(KytheraParser.FnLiteralArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnLiteralArg}.
	 * @param ctx the parse tree
	 */
	void exitFnLiteralArg(KytheraParser.FnLiteralArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KytheraParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KytheraParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KytheraParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KytheraParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KytheraParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KytheraParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KytheraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KytheraParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#fnCallParamList}.
	 * @param ctx the parse tree
	 */
	void enterFnCallParamList(KytheraParser.FnCallParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnCallParamList}.
	 * @param ctx the parse tree
	 */
	void exitFnCallParamList(KytheraParser.FnCallParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#expBlock}.
	 * @param ctx the parse tree
	 */
	void enterExpBlock(KytheraParser.ExpBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#expBlock}.
	 * @param ctx the parse tree
	 */
	void exitExpBlock(KytheraParser.ExpBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(KytheraParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(KytheraParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(KytheraParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(KytheraParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#nameStatement}.
	 * @param ctx the parse tree
	 */
	void enterNameStatement(KytheraParser.NameStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#nameStatement}.
	 * @param ctx the parse tree
	 */
	void exitNameStatement(KytheraParser.NameStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(KytheraParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(KytheraParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(KytheraParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(KytheraParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(KytheraParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(KytheraParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KytheraParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KytheraParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(KytheraParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(KytheraParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(KytheraParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(KytheraParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(KytheraParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(KytheraParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KytheraParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KytheraParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KytheraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KytheraParser.ProgramContext ctx);
}