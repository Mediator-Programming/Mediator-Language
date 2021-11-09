package mediator.token;

public class While implements IToken{
	String word;
	
	public While(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_WHILE;
	}
}
