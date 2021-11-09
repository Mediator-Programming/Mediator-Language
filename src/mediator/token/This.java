package mediator.token;

public class This implements IToken{
	String word;
	
	public This(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_THIS;
	}
}
