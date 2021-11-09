package mediator.token;

public class Do implements IToken{
	String word;
	
	public Do(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_DO;
	}
}
