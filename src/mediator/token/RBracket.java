package mediator.token;

public class RBracket implements IToken{
	String word;
	
	public RBracket(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_RBRACKET;
	}
}
