package mediator.token;

public class Default implements IToken{
	String word;
	
	public Default(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_DEFAULT;
	}
}
