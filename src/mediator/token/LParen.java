package mediator.token;

public class LParen implements IToken{
	String word;
	
	public LParen(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_LPAREN;
	}
}
