package mediator.token;

public class Void implements IToken{
	String word;
	
	public Void(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_VOID;
	}
}
