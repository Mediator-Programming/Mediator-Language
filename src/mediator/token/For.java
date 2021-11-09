package mediator.token;

public class For implements IToken{
	String word;
	
	public For(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_FOR;
	}
}
