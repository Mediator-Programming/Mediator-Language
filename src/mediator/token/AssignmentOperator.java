package mediator.token;

public class AssignmentOperator implements IToken{
	String word;
	
	public AssignmentOperator(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_ASSIGNMENT_OPERATOR;
	}
}
