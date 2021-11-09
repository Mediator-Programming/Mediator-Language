package mediator.token;

public class ModifierKeyword implements IToken{
	String word;
	
	public ModifierKeyword(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_MODIFIER_KEYWORD;
	}
}
