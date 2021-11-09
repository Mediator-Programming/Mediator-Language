package mediator.token;

public class TeamOperator implements IToken{
	String word;
	
	public TeamOperator(String s){
		word = s;
	}
	
	@Override
	public String get(){
		return word;
	}
	
	@Override
	public int getType(){
		return TOKEN_TEAM_OPERATOR;
	}
}
