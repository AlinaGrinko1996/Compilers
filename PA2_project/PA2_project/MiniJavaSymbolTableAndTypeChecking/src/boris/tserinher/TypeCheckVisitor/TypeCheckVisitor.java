package boris.tserinher.TypeCheckVisitor;

import boris.tserinher.MiniJavaGrammarBaseVisitor;
import boris.tserinher.MiniJavaGrammarParser.MainClassContext;
import boris.tserinher.MiniJavaGrammarParser.PlusExpressionContext;
import boris.tserinher.Records.Record;
import boris.tserinher.SymbolTable.SymbolTable;

public class TypeCheckVisitor extends MiniJavaGrammarBaseVisitor<Record> {
	
	private SymbolTable symbolTable;

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
