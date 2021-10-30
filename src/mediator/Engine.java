package mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mediator.expression.CallOperator;
import mediator.expression.IExpression;
import mediator.expression.ImmediateValue;
import mediator.operator.AddOperator;
import mediator.operator.IOperator;

public class Engine{
	
	public Map<String, IOperator> operators = new HashMap<String, IOperator>();
	public Map<String, Object> variables = new HashMap<String, Object>();
	
	public Engine(){
		operators.put("+", new AddOperator());
	}
	
	public Object eval(Object script){
		return getExpression(script).eval(this);
	}
	
	private IExpression getExpression(Object script){
		if(script instanceof List){
			List<?> scriptList = (List<?>)script;
			return new CallOperator(operators.get(scriptList.get(0)), scriptList.subList(1, scriptList.size()));
		}else{
			return new ImmediateValue(script);
		}
	}
}
