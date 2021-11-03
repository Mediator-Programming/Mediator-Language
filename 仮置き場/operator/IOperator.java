package mediator.operator;

import java.util.List;

import mediator.Engine;

public interface IOperator{
	Object call(Engine engine, List<?> args);
}
