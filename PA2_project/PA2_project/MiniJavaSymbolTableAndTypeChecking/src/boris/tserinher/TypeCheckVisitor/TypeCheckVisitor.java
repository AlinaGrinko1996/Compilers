package boris.tserinher.TypeCheckVisitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

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
import boris.tserinher.MiniJavaGrammarParser.IdExpressionContext;
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
	List <String> errors;

	public TypeCheckVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
		errors = new ArrayList<>();
	}

	private void printContext(ParserRuleContext ctx) {
		System.out.println("Children: 0 -> " +ctx.getChild(0)+ 
				" 1 -> " + ctx.getChild(1)+ 
				" 2 -> " +ctx.getChild(2)+ 
				" 3 -> " + ctx.getChild(3));
		System.out.print("Records:");
		if (ctx.getChild(0) != null)
			System.out.print(" 0 -> " + visit(ctx.getChild(0)));
		if (ctx.getChild(1) != null)
			System.out.print(" 1 -> " + visit(ctx.getChild(1)));
		if (ctx.getChild(2) != null)
			System.out.print(" 2 -> " + visit(ctx.getChild(2)));
		if (ctx.getChild(3) != null)
			System.out.print(" 3 -> " + visit(ctx.getChild(3)));
		System.out.println();
		System.out.print("Strings:");
		if (ctx.getChild(0) != null)
			System.out.print(" 0 -> " + ctx.getChild(0).toString());
		if (ctx.getChild(1) != null)
			System.out.print(" 1 -> " + ctx.getChild(1).toString());
		if (ctx.getChild(2) != null)
			System.out.print(" 2 -> " + ctx.getChild(2).toString());
		if (ctx.getChild(3) != null)
			System.out.print(" 3 -> " + ctx.getChild(3).toString());
		System.out.println();
		System.out.print("GrandChildren:");
		if (ctx.getChild(0) != null)
			System.out.print(" 0 -> " + ctx.getChild(0).getChild(0));
		if (ctx.getChild(1) != null)
			System.out.print(" 1 -> " + ctx.getChild(1).getChild(0));
		if (ctx.getChild(2) != null)
			System.out.print(" 2 -> " + ctx.getChild(2).getChild(0));
		if (ctx.getChild(3) != null)
			System.out.print(" 3 -> " + ctx.getChild(3).getChild(0));
		System.out.println();
	}
	
	//arrayAssignStatements: ID'[' expression ']' '=' expression SC;
	@Override
	public Record visitArrayAssignStatements(ArrayAssignStatementsContext ctx) {
		Record arrType = visit(ctx.getChild(0));
		Record arrExpr = visit(ctx.getChild(2));
		System.out.println("Array assign checking " + arrType + " " + arrExpr);
		printContext(ctx);
		if (arrType == null || arrExpr == null
				|| arrType.getType() != "int[]"
				|| arrExpr.getType() != "int[]") {
			errors.add("Array assign error -> type incorrect");
			return null;
		}
		return null;	
	}

	//expression '<' expression
	@Override
	public Record visitLessExpression(LessExpressionContext ctx) {
		Record lessType = visit(ctx.getChild(0));
		Record lessExpr = visit(ctx.getChild(2));
		System.out.println("Less expr checking " + lessType + " " + lessExpr);
		printContext(ctx);
		if (lessType == null || lessExpr == null) {
			errors.add("Less Expression incorrect, NPE");
			return null;
		}
		if (("int".equals(lessExpr.getType()) || "char".equals(lessExpr.getType())) 
				&& lessType.getType().equals(lessExpr.getType())) {
			return new Record("less_than", "boolean");
		}
		errors.add("Less Expression incorrect, types incomparaple");
		return null;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNotExpression(boris.tserinher.MiniJavaGrammarParser.NotExpressionContext)
	 */
	@Override
	public Record visitNotExpression(NotExpressionContext ctx) {
		System.out.println("Visiting not expression");
		// TODO Auto-generated method stub
		return super.visitNotExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitProgram(boris.tserinher.MiniJavaGrammarParser.ProgramContext)
	 */
	@Override
	public Record visitProgram(ProgramContext ctx) {
		System.out.println("Visit program");
		// TODO Auto-generated method stub
		return super.visitProgram(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitType(boris.tserinher.MiniJavaGrammarParser.TypeContext)
	 */
	@Override
	public Record visitType(TypeContext ctx) {
		System.out.println("Visit type");
		// TODO Auto-generated method stub
		return super.visitType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNewObjectExpression(boris.tserinher.MiniJavaGrammarParser.NewObjectExpressionContext)
	 */
	@Override
	public Record visitNewObjectExpression(NewObjectExpressionContext ctx) {
		System.out.println("Visit new object");
		// TODO Auto-generated method stub
		return super.visitNewObjectExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStringExpression(boris.tserinher.MiniJavaGrammarParser.StringExpressionContext)
	 */
	@Override
	public Record visitStringExpression(StringExpressionContext ctx) {
		System.out.println("Visiting string expression");
		// TODO Auto-generated method stub
		return super.visitStringExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNullExpression(boris.tserinher.MiniJavaGrammarParser.NullExpressionContext)
	 */
	@Override
	public Record visitNullExpression(NullExpressionContext ctx) {
		System.out.println("Visiting null expression");
		// TODO Auto-generated method stub
		return super.visitNullExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitRoundBracketxpression(boris.tserinher.MiniJavaGrammarParser.RoundBracketxpressionContext)
	 */
	@Override
	public Record visitRoundBracketxpression(RoundBracketxpressionContext ctx) {
		System.out.println("Visiting round bracket");
		// TODO Auto-generated method stub
		return super.visitRoundBracketxpression(ctx);
	}

	//doWhileStatement: 'do' statement 'while' rBExpr SC;
	@Override
	public Record visitDoWhileStatement(DoWhileStatementContext ctx) {
		System.out.println("Visiting do while");
		// TODO Auto-generated method stub
		return super.visitDoWhileStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitNewArrayExpression(boris.tserinher.MiniJavaGrammarParser.NewArrayExpressionContext)
	 */
	@Override
	public Record visitNewArrayExpression(NewArrayExpressionContext ctx) {
		System.out.println("Visiting new array");
		// TODO Auto-generated method stub
		return super.visitNewArrayExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitEqualExpression(boris.tserinher.MiniJavaGrammarParser.EqualExpressionContext)
	 */
	@Override
	public Record visitEqualExpression(EqualExpressionContext ctx) {
		System.out.println("Visiting equal expression");
		// TODO Auto-generated method stub
		return super.visitEqualExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitCharType(boris.tserinher.MiniJavaGrammarParser.CharTypeContext)
	 */
	@Override
	public Record visitCharType(CharTypeContext ctx) {
		System.out.println("Visiting char tyre expr");
		// TODO Auto-generated method stub
		return super.visitCharType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBooleanType(boris.tserinher.MiniJavaGrammarParser.BooleanTypeContext)
	 */
	@Override
	public Record visitBooleanType(BooleanTypeContext ctx) {
		System.out.println("Visiting bool type expr");
		// TODO Auto-generated method stub
		return super.visitBooleanType(ctx);
	}

	//method : 'public'? type ID ('(' parametersList ')' | '()') '{'methodBody'}';
	@Override
	public Record visitMethod(MethodContext ctx) {
		symbolTable.enterScope();
		System.out.println("Visiting method");
		//TODO - should be finished
		int argsNum = ctx.getChildCount();
		ParseTree body = ctx.getChild(argsNum - 2); 
		
		int returnArgument = body.getChildCount() - 1;
		Record returnSt = visit(body.getChild(returnArgument));
		
		//System.out.println(body.getChild(returnArgument).getChild(1).getChild(0));
		System.out.println(returnSt);
		
		String methodType = ctx.getChild(0).getChild(0).getChild(0).toString();

		if (returnSt == null || methodType == null) {
			errors.add("Error on return statement");
			return null;
		}
		if (!returnSt.getType().equals(methodType)) {
			errors.add("Method type and return mismatch");
			return null;
		}
		Record rec = super.visitMethod(ctx);
        
		// exit scope
		symbolTable.exitScope();
		return rec;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitArrayExpression(boris.tserinher.MiniJavaGrammarParser.ArrayExpressionContext)
	 */
	@Override
	public Record visitArrayExpression(ArrayExpressionContext ctx) {
		System.out.println("Visiting array expr");
		// TODO Auto-generated method stub
		return super.visitArrayExpression(ctx);
	}

	//printStatement: 'System.out.println' rBExpr SC;
	@Override
	public Record visitPrintStatement(PrintStatementContext ctx) {
		System.out.println("Visiting print statement");
		// TODO Auto-generated method stub
		return super.visitPrintStatement(ctx);
	}

	//field : 'public'? type ID SC;
	@Override
	public Record visitField(FieldContext ctx) {
		System.out.println("Visiting field");
		// TODO Auto-generated method stub
		return super.visitField(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBreakeStatement(boris.tserinher.MiniJavaGrammarParser.BreakeStatementContext)
	 */
	@Override
	public Record visitBreakeStatement(BreakeStatementContext ctx) {
		System.out.println("Visiting break statement");
		// TODO Auto-generated method stub
		return super.visitBreakeStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitBoolTypeExpression(boris.tserinher.MiniJavaGrammarParser.BoolTypeExpressionContext)
	 */
	@Override
	public Record visitBoolTypeExpression(BoolTypeExpressionContext ctx) {
		System.out.println("Visiting bool type expr");
		// TODO Auto-generated method stub
		return super.visitBoolTypeExpression(ctx);
	}

	//parametersList : parameter(',' parameter)*;
	@Override
	public Record visitParametersList(ParametersListContext ctx) {
		System.out.println("Visiting params list");
		// TODO Auto-generated method stub
		return super.visitParametersList(ctx);
	}

	//ifStatment: 'if' rBExpr statement ('else' statement )? ;
	@Override
	public Record visitIfStatment(IfStatmentContext ctx) {
		System.out.println("Visiting if statement");
		// TODO Auto-generated method stub
		return super.visitIfStatment(ctx);
	}

	//methodBody : field* statement* returnStatement;
	@Override
	public Record visitMethodBody(MethodBodyContext ctx) {
		System.out.println("Visit method Body");
		// TODO Auto-generated method stub
		return super.visitMethodBody(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMinusExpression(boris.tserinher.MiniJavaGrammarParser.MinusExpressionContext)
	 */
	@Override
	public Record visitMinusExpression(MinusExpressionContext ctx) {
		System.out.println("Visiting minus expr");
		// TODO Auto-generated method stub
		return super.visitMinusExpression(ctx);
	}

	//assignmentStatement: type? ID '=' expression SC;
	@Override
	public Record visitAssignmentStatement(AssignmentStatementContext ctx) {
		System.out.println("Visiting assignment");
		// TODO Auto-generated method stub
		return super.visitAssignmentStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMethodCallExpression(boris.tserinher.MiniJavaGrammarParser.MethodCallExpressionContext)
	 */
	@Override
	public Record visitMethodCallExpression(MethodCallExpressionContext ctx) {
		System.out.println("Visiting method call expression");
		// TODO Auto-generated method stub
		return super.visitMethodCallExpression(ctx);
	}

	//codeBlockStatement: '{' statement* '}';
	@Override
	public Record visitCodeBlockStatement(CodeBlockStatementContext ctx) {
		System.out.println("Visiting codeblock expr");
		// TODO Auto-generated method stub
		return super.visitCodeBlockStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitDivExpression(boris.tserinher.MiniJavaGrammarParser.DivExpressionContext)
	 */
	@Override
	public Record visitDivExpression(DivExpressionContext ctx) {
		System.out.println("Visiting div expr");
		// TODO Auto-generated method stub
		return super.visitDivExpression(ctx);
	}

	//returnStatement: 'return' expression SC;
	@Override
	public Record visitReturnStatement(ReturnStatementContext ctx) {
		System.out.println("Visit return");
		printContext(ctx);
		Record returnType = visit(ctx.getChild(1));
		return returnType;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIdExpression(boris.tserinher.MiniJavaGrammarParser.IdExpressionContext)
	 */
	@Override
	public Record visitIdExpression(IdExpressionContext ctx) {
		System.out.println("Visiting Id expr");
		String id = ctx.getChild(0).toString();
		
		Record ident = symbolTable.lookup(id);
		if (ident == null) {
			errors.add("The id does NOT exist");
			return null;
		}
		return ident;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIdentifierType(boris.tserinher.MiniJavaGrammarParser.IdentifierTypeContext)
	 */
	@Override
	public Record visitIdentifierType(IdentifierTypeContext ctx) {
		System.out.println("Visit Identifier");
		String identifier = ctx.getChild(0).toString();
		Record identifierRecord = symbolTable.lookup(identifier);
		if (identifierRecord == null) {
			errors.add("The identifier [ " + identifier + " ] does NOT exist");
			return null;
		}
		return identifierRecord;
	}

	//classDeclaration : CLASS ID '{' classBody '}'; 
	@Override
	public Record visitClassDeclaration(ClassDeclarationContext ctx) {
		System.out.println("Visiting class declaration");
		symbolTable.enterScope();
		Record rec = super.visitClassDeclaration(ctx);
		symbolTable.exitScope();
		return rec;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitAndExpression(boris.tserinher.MiniJavaGrammarParser.AndExpressionContext)
	 */
	@Override
	public Record visitAndExpression(AndExpressionContext ctx) {
		System.out.println("Visiting and expr");
		// TODO Auto-generated method stub
		return super.visitAndExpression(ctx);
	}

	//parameter : type ID;
	@Override
	public Record visitParameter(ParameterContext ctx) {
		System.out.println("Visiting param");
		// TODO Auto-generated method stub
		return super.visitParameter(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStringType(boris.tserinher.MiniJavaGrammarParser.StringTypeContext)
	 */
	@Override
	public Record visitStringType(StringTypeContext ctx) {
		System.out.println("Visiting string type");
		// TODO Auto-generated method stub
		return super.visitStringType(ctx);
	}

	/*statement:   variableDeclarationStatement
	| assignmentStatement 
	| ifStatment 
	| whileStatement 
	| doWhileStatement 
	| printStatement 
	| codeBlockStatement
	| arrayAssignStatements
	| breakeStatement
	| continueStatement;
	*/
	@Override
	public Record visitStatement(StatementContext ctx) {
		System.out.println("Visiting statement");
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	//variableDeclarationStatement: type ID ('=' expression)? SC;
	@Override
	public Record visitVariableDeclarationStatement(
			VariableDeclarationStatementContext ctx) {
		System.out.println("Visiting var dclare st");
		// TODO Auto-generated method stub
		return super.visitVariableDeclarationStatement(ctx);
	}

	//classBody : field* method*;
	@Override
	public Record visitClassBody(ClassBodyContext ctx) {
		System.out.println("Visiting class body");
		// TODO Auto-generated method stub
		return super.visitClassBody(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitMultExpression(boris.tserinher.MiniJavaGrammarParser.MultExpressionContext)
	 */
	@Override
	public Record visitMultExpression(MultExpressionContext ctx) {
		System.out.println("Visiting mult expr");
		// TODO Auto-generated method stub
		return super.visitMultExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitThosExpression(boris.tserinher.MiniJavaGrammarParser.ThosExpressionContext)
	 */
	@Override
	public Record visitThosExpression(ThosExpressionContext ctx) {
		System.out.println("Visiting thos expr");
		// TODO Auto-generated method stub
		return super.visitThosExpression(ctx);
	}

	//mainMethodBody : statement;
	@Override
	public Record visitMainMethodBody(MainMethodBodyContext ctx) {
		System.out.println("Visiting main method body");
		// TODO Auto-generated method stub
		return super.visitMainMethodBody(ctx);
	}

	//mainMethod : 'public' 'static' 'void' 'main' '(' 'String'('...' | '[' ']') ID ')' '{' mainMethodBody'}';
	@Override
	public Record visitMainMethod(MainMethodContext ctx) {
		System.out.println("Visiting main class");
		symbolTable.enterScope();
		Record rec = super.visitMainMethod(ctx);
		symbolTable.exitScope();
		return rec;
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitPrePlusMinusExpression(boris.tserinher.MiniJavaGrammarParser.PrePlusMinusExpressionContext)
	 */
	@Override
	public Record visitPrePlusMinusExpression(PrePlusMinusExpressionContext ctx) {
		System.out.println("Visiting prePlusMinus");
		// TODO Auto-generated method stub
		return super.visitPrePlusMinusExpression(ctx);
	}

	//methodInvocation: expression(',' expression)*;
	@Override
	public Record visitMethodInvocation(MethodInvocationContext ctx) {
		System.out.println("Visiting method invocation");
		// TODO Auto-generated method stub
		return super.visitMethodInvocation(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIntType(boris.tserinher.MiniJavaGrammarParser.IntTypeContext)
	 */
	@Override
	public Record visitIntType(IntTypeContext ctx) {
		System.out.println("Visiting intType");
		// TODO Auto-generated method stub
		return super.visitIntType(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitStart(boris.tserinher.MiniJavaGrammarParser.StartContext)
	 */
	@Override
	public Record visitStart(StartContext ctx) {
		System.out.println("Visiting start");
		// TODO Auto-generated method stub
		return super.visitStart(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitIntArrayType(boris.tserinher.MiniJavaGrammarParser.IntArrayTypeContext)
	 */
	@Override
	public Record visitIntArrayType(IntArrayTypeContext ctx) {
		System.out.println("Visiting int array type");
		// TODO Auto-generated method stub
		return super.visitIntArrayType(ctx);
	}

	//rBExpr : LRB expression* RRB ;  
	@Override
	public Record visitRBExpr(RBExprContext ctx) {
		System.out.println("Visiting rBE");
		// TODO Auto-generated method stub
		return super.visitRBExpr(ctx);
	}

	//whileStatement: 'while' rBExpr statement;
	@Override
	public Record visitWhileStatement(WhileStatementContext ctx) {
		System.out.println("Visiting while statement");
		// TODO Auto-generated method stub
		return super.visitWhileStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitOrExpression(boris.tserinher.MiniJavaGrammarParser.OrExpressionContext)
	 */
	@Override
	public Record visitOrExpression(OrExpressionContext ctx) {
		System.out.println("Visiting or expr");
		// TODO Auto-generated method stub
		return super.visitOrExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitContinueStatement(boris.tserinher.MiniJavaGrammarParser.ContinueStatementContext)
	 */
	@Override
	public Record visitContinueStatement(ContinueStatementContext ctx) {
		System.out.println("Visiting continue statement");
		// TODO Auto-generated method stub
		return super.visitContinueStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see boris.tserinher.MiniJavaGrammarBaseVisitor#visitCharExpression(boris.tserinher.MiniJavaGrammarParser.CharExpressionContext)
	 */
	@Override
	public Record visitCharExpression(CharExpressionContext ctx) {
		System.out.println("Visiting char expression");
		// TODO Auto-generated method stub
		return super.visitCharExpression(ctx);
	}

	@Override
	public Record visitPlusExpression(PlusExpressionContext ctx) {
		System.out.println("Visiting plus expr");
		return super.visitPlusExpression(ctx);
	}

	//mainClass : CLASS ID '{' mainMethod '}';
	@Override
	public Record visitMainClass(MainClassContext ctx) {
		System.out.println("Visiting main class");
		symbolTable.enterScope();
		Record rec = super.visitMainClass(ctx);
		symbolTable.exitScope();
		return rec;
	}	
	
	
}
