package mediator.token;

public class SBracketOpt implements IToken{
	String word;
	
	public SBracketOpt(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_SBRACKET_OPT;
	}
}
