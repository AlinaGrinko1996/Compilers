package boris.tserinher.SymbolTable;

import boris.tserinher.MiniJavaGrammarBaseListener;
import boris.tserinher.MiniJavaGrammarParser.ClassDeclarationContext;
import boris.tserinher.MiniJavaGrammarParser.FieldContext;
import boris.tserinher.MiniJavaGrammarParser.MainClassContext;
import boris.tserinher.MiniJavaGrammarParser.MainMethodContext;
import boris.tserinher.MiniJavaGrammarParser.MethodContext;
import boris.tserinher.MiniJavaGrammarParser.ParameterContext;
import boris.tserinher.MiniJavaGrammarParser.ProgramContext;
import boris.tserinher.MiniJavaGrammarParser.StartContext;
import boris.tserinher.Records.ClassRecord;
import boris.tserinher.Records.MethodRecord;
import boris.tserinher.Records.VarRecord;

public class SymbolTableListener extends MiniJavaGrammarBaseListener {
	
	private MiniJavaSymbolTable symbolTable;
	private ClassRecord currentClass;
	private MethodRecord currentMethod;
	
	 
	
	public SymbolTableListener() {
		super();
	}

	public SymbolTableListener(SymbolTable symbolTable) {
		super();
		this.symbolTable = (MiniJavaSymbolTable) symbolTable;
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
		System.out.printf("\n~~~~~Enter into scope %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		super.enterProgram(ctx);
	}
	
	@Override
	public void exitProgram(ProgramContext ctx) {
		System.out.println("Exit Program");
		//symbolTable.exitScope();
		super.exitProgram(ctx);
	}

	@Override
	public void enterMainClass(MainClassContext ctx) {
		
		String id = ctx.getChild(1).toString();
		String type = ctx.getChild(0).toString();
		
		currentClass = new ClassRecord(id, type);
		symbolTable.enterScope();
		symbolTable.setCurrentScopeType(type);
		symbolTable.setCurrentScopeName(id);
		System.out.printf("\n~~~~~Enter into scope %s %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase(), id.toUpperCase());
		System.out.printf("Enter: Main class(id = %s; type = %s) \n", id, type);
		symbolTable.putRecord(id, currentClass);
		super.enterMainClass(ctx);
	}

	@Override
	public void exitMainClass(MainClassContext ctx) {
		System.out.println("Exit Main Class");
		System.out.printf("~~~~~Exit from scope %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		symbolTable.exitScope();
		super.exitMainClass(ctx);
	}
	
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		String id = ctx.getChild(1).toString();
		String type = ctx.getChild(0).toString();
		
		currentClass = new ClassRecord(id, type);
		
		symbolTable.enterScope();
		symbolTable.setCurrentScopeType(type);
		symbolTable.setCurrentScopeName(id);
		System.out.printf("\n~~~~~Enter into scope %s %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase(), id.toUpperCase());
		//System.out.printf("\n~~~~~Enter into scope %s~~~~~~~\n", symbolTable.getCurrentScopeType());
		symbolTable.putRecord(id, currentClass);
		super.enterClassDeclaration(ctx);
	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
		System.out.printf("Exit Class: %s \n", ctx.getChild(1));
		System.out.printf("\n~~~~~Exit from scope %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		symbolTable.exitScope();
		super.exitClassDeclaration(ctx);
	}
	
	@Override
	public void enterMainMethod(MainMethodContext ctx) {
		String id = ctx.getChild(3).toString();
		String type = ctx.getChild(2).toString();
		symbolTable.enterScope();
		symbolTable.setCurrentScopeType("method");
		
		currentMethod = new MethodRecord(id, type);
		currentClass.putMethodRecord(currentMethod);
		symbolTable.putRecord(id, currentMethod);

		
		symbolTable.setCurrentScopeName(id);
		System.out.printf("\n~~Enter into scope %s %s~~\n", symbolTable.getCurrentScopeType().toUpperCase(), id.toUpperCase());
		//System.out.printf("\n~~~~~Enter into scope %s~~~~~~~\n", symbolTable.getCurrentScopeType());
		System.out.printf("Enter: Main method(id = %s; type = %s) \n", id, type);
		
		super.enterMainMethod(ctx);
	}

	@Override
	public void exitMainMethod(MainMethodContext ctx) {
		System.out.printf("Exit Method: %s \n", ctx.getChild(2));
		System.out.printf("\n~~Exit from scope %s %s~~\n", symbolTable.getCurrentScopeType().toUpperCase(), symbolTable.getCurrentScopeName().toUpperCase());
		//System.out.printf("~~Exit from scope %s~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		symbolTable.exitScope();
		super.exitMainMethod(ctx);
	}	

	@Override
	public void enterMethod(MethodContext ctx) {
		String id = ctx.getChild(1).toString();
		String type = ctx.getChild(0).getChild(0).getChild(0).toString();
		symbolTable.enterScope();
		symbolTable.setCurrentScopeType("method");
		
		currentMethod = new MethodRecord(id, type);
		currentClass.putMethodRecord(currentMethod);
		symbolTable.putRecord(id, currentMethod	);

		symbolTable.setCurrentScopeName(id);
		System.out.printf("\n~~~~~Enter into scope %s %s~~~~~~~\n", symbolTable.getCurrentScopeType().toUpperCase(), id.toUpperCase());
		//System.out.printf("\n~~Enter into scope %s~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		System.out.printf("Enter: Method(id = %s; type = %s) \n", id, type);
		super.enterMethod(ctx);
	}

	@Override
	public void exitMethod(MethodContext ctx) {
		System.out.printf("Exit Method: %s \n", ctx.getChild(1));
		System.out.printf("\n~~Exit from scope %s~~\n", symbolTable.getCurrentScopeType().toUpperCase());
		symbolTable.exitScope();
		super.exitMethod(ctx);
	}

	@Override
	public void enterField(FieldContext ctx) {
		String id = ctx.getChild(1).toString();
		String type = ctx.getChild(0).getChild(0).getChild(0).toString();
		
		VarRecord fieldRecord = new VarRecord(id, type);
		symbolTable.putRecord(id, fieldRecord);
		currentClass.putFieldsRecord(fieldRecord);
		
		System.out.printf("Enter: Field(id = %s; type = %s) \n", id, type);

		super.enterField(ctx);
	}

	@Override
	public void exitField(FieldContext ctx) {
		//System.out.printf("Exit Field: %s \n", ctx.getChild(1));
		super.exitField(ctx);
	}
	
	@Override
	public void enterParameter(ParameterContext ctx) {
		String id = ctx.getChild(1).toString();
		String type = ctx.getChild(0).getChild(0).getChild(0).toString();
		
		VarRecord parameterRecord = new VarRecord(id, type);		
		symbolTable.putRecord(id, parameterRecord);
		currentMethod.putParameterRecord(parameterRecord);

		System.out.printf("Enter: Parameter(id = %s; type = %s) \n", id, type);
		super.enterParameter(ctx);
	}

	@Override
	public void exitParameter(ParameterContext ctx) {
		//System.out.printf("Exit Parameter: %s \n", ctx.getChild(1));
		super.exitParameter(ctx);
	}

	
	

}
