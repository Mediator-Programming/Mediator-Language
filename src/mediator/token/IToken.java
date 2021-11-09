package mediator.token;

public interface IToken{
	public static final int TOKEN_COMMENT 			= -1;	//コメント
	public static final int TOKEN_ASSIGNMENT_OPERATOR = 0;
	public static final int TOKEN_COMPARE_OPERATOR	= 1;
	public static final int TOKEN_TEAM_OPERATOR		= 2;
	public static final int TOKEN_FACTOR_OPERATOR	= 3;
	public static final int TOKEN_EQUAL				= 4;
	public static final int TOKEN_COMMA				= 5;
	public static final int TOKEN_COLON				= 6;
	public static final int TOKEN_DOT				= 7;
	public static final int TOKEN_SEMICOLON			= 8;
	public static final int TOKEN_QUESTION			= 9;
	public static final int TOKEN_LPAREN			= 10;
	public static final int TOKEN_RPAREN			= 11;
	public static final int TOKEN_LBRACKET			= 12;
	public static final int TOKEN_RBRACKET			= 13;
	public static final int TOKEN_SBRACKET_OPT		= 14;
	public static final int TOKEN_LSBRACKET			= 15;
	public static final int TOKEN_RSBRACKET			= 16;
	public static final int TOKEN_IF				= 17;
	public static final int TOKEN_ELSE				= 18;
	public static final int TOKEN_SWITCH			= 19;
	public static final int TOKEN_CASE				= 20;
	public static final int TOKEN_DEFAULT			= 21;
	public static final int TOKEN_WHILE				= 22;
	public static final int TOKEN_DO				= 23;
	public static final int TOKEN_FOR				= 24;
	public static final int TOKEN_RETURN			= 25;
	public static final int TOKEN_BREAK				= 26;
	public static final int TOKEN_TRY				= 27;
	public static final int TOKEN_CATCH				= 28;
	public static final int TOKEN_FINALLY			= 29;
	public static final int TOKEN_CLASS				= 30;
	public static final int TOKEN_EXTENDS			= 31;
	public static final int TOKEN_VOID				= 32;
	public static final int TOKEN_THIS				= 33;
	public static final int TOKEN_SUPER				= 34;
	public static final int TOKEN_TYPE_KEYWORD		= 35;
	public static final int TOKEN_MODIFIER_KEYWORD	= 36;
	public static final int TOKEN_IDENTIFIER		= 37;
	public static final int TOKEN_NUMBER			= 38;
	
	public static final int TOKEN_STRING  = 0;	//シングル、ダブルクォーテーション文字
	public static final int TOKEN_SYMBOL  = 2;	//記号
	public static final int TOKEN_WORD    = 3;	//予約語、変数名、型名、etc.
	
	public String get();
	public int getType();
}
