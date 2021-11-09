package mediator.token;

public class Equal implements IToken{
	String word;
	
	public Equal(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_EQUAL;
	}
}
