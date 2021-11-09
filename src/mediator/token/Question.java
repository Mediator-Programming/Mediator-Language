package mediator.token;

public class Question implements IToken{
	String word;
	
	public Question(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_QUESTION;
	}
}
