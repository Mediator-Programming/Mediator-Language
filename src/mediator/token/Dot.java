package mediator.token;

public class Dot implements IToken{
	String word;
	
	public Dot(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_DOT;
	}
}
