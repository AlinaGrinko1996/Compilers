package boris.tserinher.TypeCheckVisitor;

import boris.tserinher.MiniJavaGrammarBaseVisitor;
import boris.tserinher.MiniJavaGrammarParser.AndExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.ArrayAssignStatementsContext;
import boris.tserinher.MiniJavaGrammarParser.ArrayExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.AssignmentStatementContext;
import boris.tserinher.MiniJavaGrammarParser.BoolTypeExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.BooleanTypeContext;
import boris.tserinher.MiniJavaGrammarParser.BreakeStatementContext;
import boris.tserinher.MiniJavaGrammarParser.CharExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.CharTypeContext;
import boris.tserinher.MiniJavaGrammarParser.ClassBodyContext;
import boris.tserinher.MiniJavaGrammarParser.ClassDeclarationContext;
import boris.tserinher.MiniJavaGrammarParser.CodeBlockStatementContext;
import boris.tserinher.MiniJavaGrammarParser.ContinueStatementContext;
import boris.tserinher.MiniJavaGrammarParser.DivExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.DoWhileStatementContext;
import boris.tserinher.MiniJavaGrammarParser.EqualExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.FieldContext;
import boris.tserinher.MiniJavaGrammarParser.IdentifierTypeContext;
import boris.tserinher.MiniJavaGrammarParser.IfStatmentContext;
import boris.tserinher.MiniJavaGrammarParser.IntArrayTypeContext;
import boris.tserinher.MiniJavaGrammarParser.IntTypeContext;
import boris.tserinher.MiniJavaGrammarParser.LessExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.MainClassContext;
import boris.tserinher.MiniJavaGrammarParser.MainMethodBodyContext;
import boris.tserinher.MiniJavaGrammarParser.MainMethodContext;
import boris.tserinher.MiniJavaGrammarParser.MethodBodyContext;
import boris.tserinher.MiniJavaGrammarParser.MethodCallExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.MethodContext;
import boris.tserinher.MiniJavaGrammarParser.MethodInvocationContext;
import boris.tserinher.MiniJavaGrammarParser.MinusExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.MultExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.NewArrayExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.NewObjectExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.NotExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.NullExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.OrExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.ParameterContext;
import boris.tserinher.MiniJavaGrammarParser.ParametersListContext;
import boris.tserinher.MiniJavaGrammarParser.PlusExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.PrePlusMinusExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.PrintStatementContext;
import boris.tserinher.MiniJavaGrammarParser.ProgramContext;
import boris.tserinher.MiniJavaGrammarParser.RBExprContext;
import boris.tserinher.MiniJavaGrammarParser.ReturnStatementContext;
import boris.tserinher.MiniJavaGrammarParser.RoundBracketxpressionContext;
import boris.tserinher.MiniJavaGrammarParser.StartContext;
import boris.tserinher.MiniJavaGrammarParser.StatementContext;
import boris.tserinher.MiniJavaGrammarParser.StringExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.StringTypeContext;
import boris.tserinher.MiniJavaGrammarParser.ThosExpressionContext;
import boris.tserinher.MiniJavaGrammarParser.TypeContext;
import boris.tserinher.MiniJavaGrammarParser.VariableDeclarationStatementContext;
import boris.tserinher.MiniJavaGrammarParser.WhileStatementContext;
import boris.tserinher.Records.Record;
import boris.tserinher.SymbolTable.SymbolTable;

public class TypeCheckVisitor extends MiniJavaGrammarBaseVisitor<Record> {
	
	private SymbolTable symbolTable;

    /* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitArrayAssignStatements(boris.tserinher.MiniJavaGrammarParser.ArrayAssignStatementsContext)
	 */
	@Override
	public Record visitArrayAssignStatements(ArrayAssignStatementsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArrayAssignStatements(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitLessExpression(boris.tserinher.MiniJavaGrammarParser.LessExpressionContext)
	 */
	@Override
	public Record visitLessExpression(LessExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLessExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNotExpression(boris.tserinher.MiniJavaGrammarParser.NotExpressionContext)
	 */
	@Override
	public Record visitNotExpression(NotExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitProgram(boris.tserinher.MiniJavaGrammarParser.ProgramContext)
	 */
	@Override
	public Record visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgram(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitType(boris.tserinher.MiniJavaGrammarParser.TypeContext)
	 */
	@Override
	public Record visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNewObjectExpression(boris.tserinher.MiniJavaGrammarParser.NewObjectExpressionContext)
	 */
	@Override
	public Record visitNewObjectExpression(NewObjectExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNewObjectExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStringExpression(boris.tserinher.MiniJavaGrammarParser.StringExpressionContext)
	 */
	@Override
	public Record visitStringExpression(StringExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNullExpression(boris.tserinher.MiniJavaGrammarParser.NullExpressionContext)
	 */
	@Override
	public Record visitNullExpression(NullExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNullExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitRoundBracketxpression(boris.tserinher.MiniJavaGrammarParser.RoundBracketxpressionContext)
	 */
	@Override
	public Record visitRoundBracketxpression(RoundBracketxpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRoundBracketxpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitDoWhileStatement(boris.tserinher.MiniJavaGrammarParser.DoWhileStatementContext)
	 */
	@Override
	public Record visitDoWhileStatement(DoWhileStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDoWhileStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNewArrayExpression(boris.tserinher.MiniJavaGrammarParser.NewArrayExpressionContext)
	 */
	@Override
	public Record visitNewArrayExpression(NewArrayExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNewArrayExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitEqualExpression(boris.tserinher.MiniJavaGrammarParser.EqualExpressionContext)
	 */
	@Override
	public Record visitEqualExpression(EqualExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEqualExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitCharType(boris.tserinher.MiniJavaGrammarParser.CharTypeContext)
	 */
	@Override
	public Record visitCharType(CharTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCharType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBooleanType(boris.tserinher.MiniJavaGrammarParser.BooleanTypeContext)
	 */
	@Override
	public Record visitBooleanType(BooleanTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleanType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMethod(boris.tserinher.MiniJavaGrammarParser.MethodContext)
	 */
	@Override
	public Record visitMethod(MethodContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethod(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitArrayExpression(boris.tserinher.MiniJavaGrammarParser.ArrayExpressionContext)
	 */
	@Override
	public Record visitArrayExpression(ArrayExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArrayExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitPrintStatement(boris.tserinher.MiniJavaGrammarParser.PrintStatementContext)
	 */
	@Override
	public Record visitPrintStatement(PrintStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrintStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitField(boris.tserinher.MiniJavaGrammarParser.FieldContext)
	 */
	@Override
	public Record visitField(FieldContext ctx) {
		// TODO Auto-generated method stub
		return super.visitField(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBreakeStatement(boris.tserinher.MiniJavaGrammarParser.BreakeStatementContext)
	 */
	@Override
	public Record visitBreakeStatement(BreakeStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBreakeStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBoolTypeExpression(boris.tserinher.MiniJavaGrammarParser.BoolTypeExpressionContext)
	 */
	@Override
	public Record visitBoolTypeExpression(BoolTypeExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBoolTypeExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitParametersList(boris.tserinher.MiniJavaGrammarParser.ParametersListContext)
	 */
	@Override
	public Record visitParametersList(ParametersListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParametersList(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIfStatment(boris.tserinher.MiniJavaGrammarParser.IfStatmentContext)
	 */
	@Override
	public Record visitIfStatment(IfStatmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfStatment(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMethodBody(boris.tserinher.MiniJavaGrammarParser.MethodBodyContext)
	 */
	@Override
	public Record visitMethodBody(MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodBody(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMinusExpression(boris.tserinher.MiniJavaGrammarParser.MinusExpressionContext)
	 */
	@Override
	public Record visitMinusExpression(MinusExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMinusExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitAssignmentStatement(boris.tserinher.MiniJavaGrammarParser.AssignmentStatementContext)
	 */
	@Override
	public Record visitAssignmentStatement(AssignmentStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignmentStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMethodCallExpression(boris.tserinher.MiniJavaGrammarParser.MethodCallExpressionContext)
	 */
	@Override
	public Record visitMethodCallExpression(MethodCallExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodCallExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitCodeBlockStatement(boris.tserinher.MiniJavaGrammarParser.CodeBlockStatementContext)
	 */
	@Override
	public Record visitCodeBlockStatement(CodeBlockStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCodeBlockStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitDivExpression(boris.tserinher.MiniJavaGrammarParser.DivExpressionContext)
	 */
	@Override
	public Record visitDivExpression(DivExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDivExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitReturnStatement(boris.tserinher.MiniJavaGrammarParser.ReturnStatementContext)
	 */
	@Override
	public Record visitReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIdentifierType(boris.tserinher.MiniJavaGrammarParser.IdentifierTypeContext)
	 */
	@Override
	public Record visitIdentifierType(IdentifierTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdentifierType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitClassDeclaration(boris.tserinher.MiniJavaGrammarParser.ClassDeclarationContext)
	 */
	@Override
	public Record visitClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClassDeclaration(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitAndExpression(boris.tserinher.MiniJavaGrammarParser.AndExpressionContext)
	 */
	@Override
	public Record visitAndExpression(AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAndExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitParameter(boris.tserinher.MiniJavaGrammarParser.ParameterContext)
	 */
	@Override
	public Record visitParameter(ParameterContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParameter(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStringType(boris.tserinher.MiniJavaGrammarParser.StringTypeContext)
	 */
	@Override
	public Record visitStringType(StringTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStatement(boris.tserinher.MiniJavaGrammarParser.StatementContext)
	 */
	@Override
	public Record visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitVariableDeclarationStatement(boris.tserinher.MiniJavaGrammarParser.VariableDeclarationStatementContext)
	 */
	@Override
	public Record visitVariableDeclarationStatement(
			VariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableDeclarationStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitClassBody(boris.tserinher.MiniJavaGrammarParser.ClassBodyContext)
	 */
	@Override
	public Record visitClassBody(ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClassBody(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMultExpression(boris.tserinher.MiniJavaGrammarParser.MultExpressionContext)
	 */
	@Override
	public Record visitMultExpression(MultExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMultExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitThosExpression(boris.tserinher.MiniJavaGrammarParser.ThosExpressionContext)
	 */
	@Override
	public Record visitThosExpression(ThosExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitThosExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMainMethodBody(boris.tserinher.MiniJavaGrammarParser.MainMethodBodyContext)
	 */
	@Override
	public Record visitMainMethodBody(MainMethodBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMainMethodBody(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMainMethod(boris.tserinher.MiniJavaGrammarParser.MainMethodContext)
	 */
	@Override
	public Record visitMainMethod(MainMethodContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMainMethod(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitPrePlusMinusExpression(boris.tserinher.MiniJavaGrammarParser.PrePlusMinusExpressionContext)
	 */
	@Override
	public Record visitPrePlusMinusExpression(PrePlusMinusExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrePlusMinusExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMethodInvocation(boris.tserinher.MiniJavaGrammarParser.MethodInvocationContext)
	 */
	@Override
	public Record visitMethodInvocation(MethodInvocationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodInvocation(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIntType(boris.tserinher.MiniJavaGrammarParser.IntTypeContext)
	 */
	@Override
	public Record visitIntType(IntTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStart(boris.tserinher.MiniJavaGrammarParser.StartContext)
	 */
	@Override
	public Record visitStart(StartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStart(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIntArrayType(boris.tserinher.MiniJavaGrammarParser.IntArrayTypeContext)
	 */
	@Override
	public Record visitIntArrayType(IntArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntArrayType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitRBExpr(boris.tserinher.MiniJavaGrammarParser.RBExprContext)
	 */
	@Override
	public Record visitRBExpr(RBExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRBExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitWhileStatement(boris.tserinher.MiniJavaGrammarParser.WhileStatementContext)
	 */
	@Override
	public Record visitWhileStatement(WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWhileStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitOrExpression(boris.tserinher.MiniJavaGrammarParser.OrExpressionContext)
	 */
	@Override
	public Record visitOrExpression(OrExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOrExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitContinueStatement(boris.tserinher.MiniJavaGrammarParser.ContinueStatementContext)
	 */
	@Override
	public Record visitContinueStatement(ContinueStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinueStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitCharExpression(boris.tserinher.MiniJavaGrammarParser.CharExpressionContext)
	 */
	@Override
	public Record visitCharExpression(CharExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCharExpression(ctx);
	}

	public TypeCheckVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	@Override
	public Record visitPlusExpression(PlusExpressionContext ctx) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~1~~~~~~~~~~~~~~~~~~");
		System.out.println(ctx.children);
		return super.visitPlusExpression(ctx);
	}

	@Override
	public Record visitMainClass(MainClassContext ctx) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~2~~~~~~~~~~~~~~~~~~");
		System.out.println(ctx.children);
		return null;
	}
	
	
	
}
