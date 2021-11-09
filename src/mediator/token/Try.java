package mediator.token;

public class Try implements IToken{
	String word;
	
	public Try(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_TRY;
	}
}
