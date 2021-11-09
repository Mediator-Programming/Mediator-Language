package mediator.token;

public class Identifier implements IToken{
	String word;
	
	public Identifier(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_IDENTIFIER;
	}
}
