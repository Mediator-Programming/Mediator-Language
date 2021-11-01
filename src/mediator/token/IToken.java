package mediator.token;

public interface IToken{
	public static final int TOKEN_COMMENT = -1;	//コメント
	public static final int TOKEN_STRING  = 0;	//シングル、ダブルクォーテーション文字
	public static final int TOKEN_NUMBER  = 1;	//数字
	public static final int TOKEN_SYMBOL  = 2;	//記号
	public static final int TOKEN_WORD    = 3;	//予約語、変数名、型名、etc.
	
	public String get();
	public int getType();
}
