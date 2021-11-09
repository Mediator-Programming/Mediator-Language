package mediator.token;

public class TypeKeyword implements IToken{
	String word;
	
	public TypeKeyword(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_TYPE_KEYWORD;
	}
}
