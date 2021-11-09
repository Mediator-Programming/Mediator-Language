package mediator.token;

public class RParen implements IToken{
	String word;
	
	public RParen(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_RPAREN;
	}
}
