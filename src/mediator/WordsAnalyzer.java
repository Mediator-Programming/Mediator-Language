package mediator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import mediator.token.IToken;
import mediator.token.NumberToken;
import mediator.token.StringToken;
import mediator.token.SymbolToken;
import mediator.token.WordToken;

public class WordsAnalyzer{
	String s;
	List<IToken> words;
	public IToken[] analyze(String str){
		s = str;
		System.out.println("■Start\n\n" + s + "\n□End");
		
		s = s.replaceAll("//.*\n", "");		//コメントを消去
//		System.out.println("■Start\n\n" + s + "\n□End");
		words = new ArrayList<IToken>();
		
		while(!s.equals("")){
			String fir = s.substring(0, 1);
			if(fir.matches("/")){
				//コメント
				if(s.length() > 1){
					String sec = s.substring(1, 2);
					if(sec.matches("/")){
						for(int i = 1; i < s.length(); i++){
							if(s.substring(i,i + 1).matches("\\n")){
								//コメントおわり
								nonAddToken(i);
								break;
							}
						}
						//単行コメント
					}else if(sec.matches("\\*")){
						//範囲コメント
						for(int i = 3; i < s.length(); i++){
							if(s.substring(i - 2,i).matches("\\*/")){
								//コメントおわり
								nonAddToken(i);
								break;
							}
						}
					}
				}
			}else if(fir.matches("[\"\']")){
				//クォーテーション文字列
				//ﾊﾞｯｸｽﾗｯｼｭだけ表示させようとすると死
				for(int i = 1; i < s.length(); i++){
					if(s.substring(0,i).matches("[\"\'](.*?[^\\\\])?" + s.substring(0,1))){
//					if(s.substring(0,i).matches("[\"\'].*?" + s.substring(0,1))){
						//引用符が閉じられた
						addToken(i, new StringToken(s.substring(0,i)));
						break;
					}
				}
			}else if(fir.matches("[0-9]")){
				//数字
				for(int i = 1; i < s.length(); i++){
					if(!s.substring(0,i).matches("\\d+(\\.\\d*)?") || i == s.length() - 1){
//					if(!s.substring(0,i).matches("\\d*") || i == s.length() - 1){
						//整数または小数(1ずれ)
						addToken(i - 1, new NumberToken(s.substring(0,i - 1)));
						break;
					}
				}
			}else if(fir.matches("[a-zA-Z_]")){
				//単語
				for(int i = 1; i < s.length(); i++){
					if(!s.substring(0,i).matches("[a-zA-Z_]+") || i == s.length() - 1){
						//単語(1ずれ)
						addToken(i - 1, new WordToken(s.substring(0,i - 1)));
						break;
					}
				}
			}else if(fir.matches("[;:=,\\.\\+\\-\\*/%<>!\\?\\(\\)\\{\\}\\[\\]\\&\\|]")){
				//記号
				addToken(1, new SymbolToken(s.substring(0,1)));
			}else if(fir.matches("[\\s\\n ]")){
				//空白文字
				nonAddToken(1);
			}else{
				//不正な入力
				nonAddToken(1);
			}
		}
		
		Object[] w = words.toArray();
		IToken ans[] = new IToken[w.length];
		for(int i = 0; i < w.length; i++){
			ans[i] = (IToken)w[i];
		}
		return ans;
	}
	
	public IToken[] analyzeFromFileName(String url){
		String chars = "";
		try{
			File file = new File(url);
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);
			String ch;
			while((ch = br.readLine()) != null){
//				System.out.print(ch);
				chars = chars + ch + "\n";
			}
			filereader.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		return analyze(String.valueOf(chars));
	}
	
	private void addToken(int index, IToken token){
		s = s.substring(index, s.length());
		words.add(token);
	}
	
	private void nonAddToken(int index){
		s = s.substring(index, s.length());
	}
}
