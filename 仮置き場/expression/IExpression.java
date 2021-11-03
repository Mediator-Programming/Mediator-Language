package mediator.expression;

import mediator.Engine;

public interface IExpression{
	Object eval(Engine engine);
}
