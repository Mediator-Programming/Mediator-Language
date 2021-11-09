package mediator.token;

public class Comma implements IToken{
	String word;
	
	public Comma(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_COMMA;
	}
}
