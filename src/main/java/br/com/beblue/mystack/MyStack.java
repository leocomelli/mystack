package br.com.beblue.mystack;

import java.util.Stack;

public class MyStack extends Stack<Integer> {

	private static final long serialVersionUID = 1691878218797981731L;

	private final Stack<Integer> minValues = new Stack<>();

	public Integer min() {
		return minValues.peek();
	}

	@Override
	public Integer pop() {
		int obj = super.pop();
		minValues.pop();
		return obj;
	}

	@Override
	public Integer push(Integer item) {
		if (isEmpty()) {
			super.push(item);
			minValues.push(item);
		} else {
			super.push(item);
			int minValue = minValues.peek();
			if (item <= minValue) {
				minValues.push(item);
			}
		}
		return item;
	}
}
