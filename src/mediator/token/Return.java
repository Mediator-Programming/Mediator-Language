package mediator.token;

public class Return implements IToken{
	String word;
	
	public Return(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_RETURN;
	}
}
