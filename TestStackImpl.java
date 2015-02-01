package cw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackImpl {
	
	Stack myStack;
	
	@Before
	public void initialise () {
		myStack = new StackImpl(new ArrayList());
	}

	@Test
	public void testPopNormal() {
		
		myStack.push("1");
		myStack.push("2");
		myStack.push("3");
		myStack.push("4");
		myStack.push("5");
		myStack.push("6");
		
		assertEquals(myStack.pop().getReturnValue(),"6");
		
	}
	
	@Test
	public void testPopEmpty() {
	
		assertTrue(myStack.pop().hasError());
		
	}
	
	@Test
	public void testTopNormal () {
	
		myStack.push("1");
		myStack.push("2");
		myStack.push("3");
		myStack.push("4");
		myStack.push("5");
		myStack.push("6");
		
		assertEquals(myStack.top().getReturnValue(),"6");
		
		
	}
	
	@Test
	public void testTopEmpty() {
		
		assertTrue(myStack.pop().hasError());
		
	}

}
