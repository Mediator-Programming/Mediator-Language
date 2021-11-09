package mediator.token;

public class LBracket implements IToken{
	String word;
	
	public LBracket(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_LBRACKET;
	}
}
