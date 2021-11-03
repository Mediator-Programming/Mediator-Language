import mediator.token.IToken;
import mediator.WordsAnalyzer;

public class Main{
	public static void main(String args[]){
		WordsAnalyzer wa = new WordsAnalyzer();
		IToken words[] = wa.analyzeFromFileName("Sample.medi");
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i].get());
		}
	}
}
