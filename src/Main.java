import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import mediator.Engine;

public class Main{
	public static void main(String args[]){
		List<Object> script = new ArrayList<Object>();
		script.add("+");
		script.add(new BigDecimal("1"));
		script.add(new BigDecimal("9"));
		
		Engine engine = new Engine();
		Object result = engine.eval(script);
		System.out.println(result);
	}
}
