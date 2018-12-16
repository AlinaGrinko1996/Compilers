// Generated from MiniJavaGrammar.g4 by ANTLR 4.4
    // Define output package. Replace jlnmsi with your lnu user (e.g. ab222cd)
    package boris.tserinher;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStatements(@NotNull MiniJavaGrammarParser.ArrayAssignStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpression(@NotNull MiniJavaGrammarParser.LessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(@NotNull MiniJavaGrammarParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectExpression(@NotNull MiniJavaGrammarParser.NewObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull MiniJavaGrammarParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(@NotNull MiniJavaGrammarParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundBracketxpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundBracketxpression(@NotNull MiniJavaGrammarParser.RoundBracketxpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(@NotNull MiniJavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayExpression(@NotNull MiniJavaGrammarParser.NewArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(@NotNull MiniJavaGrammarParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#charType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(@NotNull MiniJavaGrammarParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull MiniJavaGrammarParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull MiniJavaGrammarParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(@NotNull MiniJavaGrammarParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull MiniJavaGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#breakeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakeStatement(@NotNull MiniJavaGrammarParser.BreakeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTypeExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTypeExpression(@NotNull MiniJavaGrammarParser.BoolTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(@NotNull MiniJavaGrammarParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(@NotNull MiniJavaGrammarParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull MiniJavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(@NotNull MiniJavaGrammarParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(@NotNull MiniJavaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(@NotNull MiniJavaGrammarParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#codeBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlockStatement(@NotNull MiniJavaGrammarParser.CodeBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull MiniJavaGrammarParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull MiniJavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#identifierType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(@NotNull MiniJavaGrammarParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull MiniJavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull MiniJavaGrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#stringType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(@NotNull MiniJavaGrammarParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(@NotNull MiniJavaGrammarParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull MiniJavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(@NotNull MiniJavaGrammarParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thosExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThosExpression(@NotNull MiniJavaGrammarParser.ThosExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainMethodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodBody(@NotNull MiniJavaGrammarParser.MainMethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull MiniJavaGrammarParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(@NotNull MiniJavaGrammarParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prePlusMinusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrePlusMinusExpression(@NotNull MiniJavaGrammarParser.PrePlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(@NotNull MiniJavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull MiniJavaGrammarParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull MiniJavaGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#intArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayType(@NotNull MiniJavaGrammarParser.IntArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#rBExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRBExpr(@NotNull MiniJavaGrammarParser.RBExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(@NotNull MiniJavaGrammarParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull MiniJavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpression(@NotNull MiniJavaGrammarParser.CharExpressionContext ctx);
}