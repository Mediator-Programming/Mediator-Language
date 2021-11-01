package mediator.token;

public class StringToken implements IToken{
	String word;
	
	public StringToken(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_STRING;
	}
}
