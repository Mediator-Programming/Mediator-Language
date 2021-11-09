package mediator.token;

public class Super implements IToken{
	String word;
	
	public Super(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_SUPER;
	}
}
