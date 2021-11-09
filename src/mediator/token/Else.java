package mediator.token;

public class Else implements IToken{
	String word;
	
	public Else(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_ELSE;
	}
}
