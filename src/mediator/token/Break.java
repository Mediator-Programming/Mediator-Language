package mediator.token;

public class Break implements IToken{
	String word;
	
	public Break(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_BREAK;
	}
}
