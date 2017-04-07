// Generated from /home/dejawu/Documents/kythera/Kythera.g4 by ANTLR 4.6

    package io.kwu.kythera.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KytheraParser}.
 */
public interface KytheraListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link KytheraParser#fnExpression}.
	 * @param ctx the parse tree
	 */
	void enterFnExpression(KytheraParser.FnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#fnExpression}.
	 * @param ctx the parse tree
	 */
	void exitFnExpression(KytheraParser.FnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KytheraParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KytheraParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KytheraParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStatement(KytheraParser.PackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStatement(KytheraParser.PackageStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KytheraParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(KytheraParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(KytheraParser.VariableStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KytheraParser#controlFlowStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlFlowStatement(KytheraParser.ControlFlowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#controlFlowStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlFlowStatement(KytheraParser.ControlFlowStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KytheraParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(KytheraParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KytheraParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(KytheraParser.ForStatementContext ctx);
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