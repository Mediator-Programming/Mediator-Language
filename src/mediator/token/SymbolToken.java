package mediator.token;

public class SymbolToken implements IToken{
	String word;
	
	public SymbolToken(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_SYMBOL;
	}
}
