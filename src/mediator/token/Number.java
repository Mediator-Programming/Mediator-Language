package mediator.token;

public class Number implements IToken{
	String word;
	
	public Number(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_NUMBER;
	}
}
