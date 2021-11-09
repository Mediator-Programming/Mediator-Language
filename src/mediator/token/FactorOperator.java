package mediator.token;

public class FactorOperator implements IToken{
	String word;
	
	public FactorOperator(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_FACTOR_OPERATOR;
	}
}
