import java.util.HashMap;
import java.util.Map;

public class Expression {

	private char op;

	private Expression left;

	private Expression right;

	private int constant;

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		switch (op) {
		case 'c':
			return constant;
		case '+':
			return add();
			case '-':
				return subtract();
			case '*':
				return multiply();
			case '/':
				return divide();
			default:
			throw new IllegalStateException();
		}
	}

	private int divide() {
		return left.evaluate() / right.evaluate();
	}

	private int multiply() {
		return left.evaluate() * right.evaluate();
	}

	private int subtract() {
		return left.evaluate() - right.evaluate();
	}

	private int add() {
		return left.evaluate() + right.evaluate();
	}

}
/*
* Maybe switch statement? Tbh not too sure what to change here without completely changing structure of tests (For instance left/right->Int etc.
* If we want to get around the switch completely I would just make a hashmap of expressions / runnables and call the funcs but not sure
* */