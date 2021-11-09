package mediator.token;

public class Extends implements IToken{
	String word;
	
	public Extends(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_EXTENDS;
	}
}
