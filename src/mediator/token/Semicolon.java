package mediator.token;

public class Semicolon implements IToken{
	String word;
	
	public Semicolon(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_SEMICOLON;
	}
}
