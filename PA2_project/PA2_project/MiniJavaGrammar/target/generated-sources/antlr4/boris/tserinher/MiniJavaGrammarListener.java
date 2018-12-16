// Generated from MiniJavaGrammar.g4 by ANTLR 4.4
    // Define output package. Replace jlnmsi with your lnu user (e.g. ab222cd)
    package boris.tserinher;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatements}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatements(@NotNull MiniJavaGrammarParser.ArrayAssignStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatements}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatements(@NotNull MiniJavaGrammarParser.ArrayAssignStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpression(@NotNull MiniJavaGrammarParser.LessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpression(@NotNull MiniJavaGrammarParser.LessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(@NotNull MiniJavaGrammarParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(@NotNull MiniJavaGrammarParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectExpression(@NotNull MiniJavaGrammarParser.NewObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectExpression(@NotNull MiniJavaGrammarParser.NewObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull MiniJavaGrammarParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull MiniJavaGrammarParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(@NotNull MiniJavaGrammarParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(@NotNull MiniJavaGrammarParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundBracketxpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRoundBracketxpression(@NotNull MiniJavaGrammarParser.RoundBracketxpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundBracketxpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRoundBracketxpression(@NotNull MiniJavaGrammarParser.RoundBracketxpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull MiniJavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull MiniJavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayExpression(@NotNull MiniJavaGrammarParser.NewArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayExpression(@NotNull MiniJavaGrammarParser.NewArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(@NotNull MiniJavaGrammarParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(@NotNull MiniJavaGrammarParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#charType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(@NotNull MiniJavaGrammarParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#charType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(@NotNull MiniJavaGrammarParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull MiniJavaGrammarParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull MiniJavaGrammarParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull MiniJavaGrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull MiniJavaGrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(@NotNull MiniJavaGrammarParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(@NotNull MiniJavaGrammarParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull MiniJavaGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull MiniJavaGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#breakeStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakeStatement(@NotNull MiniJavaGrammarParser.BreakeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#breakeStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakeStatement(@NotNull MiniJavaGrammarParser.BreakeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTypeExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolTypeExpression(@NotNull MiniJavaGrammarParser.BoolTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTypeExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolTypeExpression(@NotNull MiniJavaGrammarParser.BoolTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(@NotNull MiniJavaGrammarParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(@NotNull MiniJavaGrammarParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(@NotNull MiniJavaGrammarParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(@NotNull MiniJavaGrammarParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull MiniJavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull MiniJavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull MiniJavaGrammarParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull MiniJavaGrammarParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull MiniJavaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull MiniJavaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull MiniJavaGrammarParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull MiniJavaGrammarParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#codeBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockStatement(@NotNull MiniJavaGrammarParser.CodeBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#codeBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockStatement(@NotNull MiniJavaGrammarParser.CodeBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull MiniJavaGrammarParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull MiniJavaGrammarParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MiniJavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MiniJavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#identifierType}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(@NotNull MiniJavaGrammarParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#identifierType}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(@NotNull MiniJavaGrammarParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull MiniJavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull MiniJavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MiniJavaGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MiniJavaGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(@NotNull MiniJavaGrammarParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(@NotNull MiniJavaGrammarParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(@NotNull MiniJavaGrammarParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(@NotNull MiniJavaGrammarParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull MiniJavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull MiniJavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(@NotNull MiniJavaGrammarParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(@NotNull MiniJavaGrammarParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thosExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThosExpression(@NotNull MiniJavaGrammarParser.ThosExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thosExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThosExpression(@NotNull MiniJavaGrammarParser.ThosExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainMethodBody}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodBody(@NotNull MiniJavaGrammarParser.MainMethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainMethodBody}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodBody(@NotNull MiniJavaGrammarParser.MainMethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(@NotNull MiniJavaGrammarParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(@NotNull MiniJavaGrammarParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(@NotNull MiniJavaGrammarParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(@NotNull MiniJavaGrammarParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prePlusMinusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrePlusMinusExpression(@NotNull MiniJavaGrammarParser.PrePlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prePlusMinusExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrePlusMinusExpression(@NotNull MiniJavaGrammarParser.PrePlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull MiniJavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull MiniJavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull MiniJavaGrammarParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull MiniJavaGrammarParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull MiniJavaGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull MiniJavaGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(@NotNull MiniJavaGrammarParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(@NotNull MiniJavaGrammarParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#rBExpr}.
	 * @param ctx the parse tree
	 */
	void enterRBExpr(@NotNull MiniJavaGrammarParser.RBExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#rBExpr}.
	 * @param ctx the parse tree
	 */
	void exitRBExpr(@NotNull MiniJavaGrammarParser.RBExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull MiniJavaGrammarParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull MiniJavaGrammarParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull MiniJavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull MiniJavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpression(@NotNull MiniJavaGrammarParser.CharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpression(@NotNull MiniJavaGrammarParser.CharExpressionContext ctx);
}