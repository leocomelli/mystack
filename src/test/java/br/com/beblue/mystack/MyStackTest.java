package br.com.beblue.mystack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

	private MyStack stack = new MyStack();

	@Before
	public void startUp() {
		stack.clear();
	}

	@Test
	public void testGetMinRunningJustPush() {
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		assertThat(stack.min(), equalTo(1));
		stack.push(-2);
		assertThat(stack.min(), equalTo(-2));
	}

	@Test
	public void testGetMinRunningJustPushAndPop() {
		stack.push(3);
		stack.push(1);
		stack.push(5);
		assertThat(stack.min(), equalTo(1));
		stack.push(0);
		assertThat(stack.min(), equalTo(0));
		assertThat(stack.pop(), equalTo(0));
		assertThat(stack.min(), equalTo(1));
		stack.push(-1);
		assertThat(stack.min(), equalTo(-1));
		assertThat(stack.pop(), equalTo(-1));
		assertThat(stack.min(), equalTo(1));
	}

}
