package cw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestImprovedStackImpl {

		
		ImprovedStack myStack;
		
		@Before
		public void initialise () {
			myStack = new ImprovedStackImpl();
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
		
		/**
		 * This test tests if popping empty stack would return ErrorMessage object of type EMPTY_STRUCTURE 
		 */
		
		@Test
		public void testPopEmpty() {
		
			assertEquals(myStack.pop().getError(), ErrorMessage.EMPTY_STRUCTURE);
			
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
			
			assertEquals(myStack.top().getError(), ErrorMessage.EMPTY_STRUCTURE);
			
		}
		
		@Test
		public void testPushIntoEmpty() {
			
			myStack.push("1");
			
			assertEquals(myStack.top().getReturnValue(), "1");
			
		}
		
		@Test 
		public void testSize() {
			
			myStack.push("1");
			myStack.push("2");
			myStack.push("3");
			myStack.push("4");
			myStack.push("5");
			myStack.push("6");
			
			assertEquals(myStack.size(),6);
			
		}
		
		@Test
		public void testPushExtreme () {
			
			for (int i = 0; i<1000000; i++) {
				String myString = ""+i;
				myStack.push(myString);
			}
			
			assertEquals(myStack.pop().getReturnValue(),"999999");
			
		}
		
		@Test
		public void testReverse () {
			
			myStack.push("1");
			myStack.push("2");
			myStack.push("3");
			myStack.push("4");
			myStack.push("5");
			myStack.push("6");
			
			ImprovedStack newImprovedStack = myStack.reverse();
			
			assertEquals(newImprovedStack.pop().getReturnValue(),"1");
			
		}
		
		@Test 
		public void testRemoveObject () {
			
			String kk = "2";
			
			myStack.push("1");
			myStack.push("6");
			myStack.push("3");
			myStack.push("5");
			myStack.push("2");
			myStack.push("2");
			
			myStack.remove("2");
			
			assertEquals("5",myStack.pop().getReturnValue());
			
			
		}
		
	}

