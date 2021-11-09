package mediator.token;

public class Class implements IToken{
	String word;
	
	public Class(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_CLASS;
	}
}
