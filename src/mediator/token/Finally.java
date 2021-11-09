package mediator.token;

public class Finally implements IToken{
	String word;
	
	public Finally(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_FINALLY;
	}
}
