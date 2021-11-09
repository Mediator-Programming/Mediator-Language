package mediator.token;

public class Catch implements IToken{
	String word;
	
	public Catch(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_CATCH;
	}
}
