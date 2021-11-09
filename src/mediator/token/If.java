package mediator.token;

public class If implements IToken{
	String word;
	
	public If(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_IF;
	}
}
