import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import mediator.Engine;
import mediator.WordsAnalyzer;

public class Main{
	public static void main(String args[]){
		List<Object> script = new ArrayList<Object>();
		script.add("+");
		script.add(new BigDecimal("1"));
		script.add(new BigDecimal("9"));
		
		Engine engine = new Engine();
		Object result = engine.eval(script);
		System.out.println(result);
		
		WordsAnalyzer wa = new WordsAnalyzer();
		String words[] = wa.analyzeFromFileName("test.medi");
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}
	}
}
