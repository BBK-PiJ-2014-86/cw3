package cw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {

	List myList;
		
	@Before
	public void initialise () {
		myList = new ArrayList ();
	}

	@Test
	public void testaAddAndGetNormal() {
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		assertEquals(myList.get(5).getReturnValue(),"6");
		
	}
	
	/**
	 * This test tests if popping empty stack would return ErrorMessage object of type EMPTY_STRUCTURE 
	 */
	
	@Test
	public void testGetEmpty() {
	
		assertEquals(myList.get(1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		
	}
	
	@Test
	public void testAddNormal () {
	
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add(3,"6");
		
		assertEquals(myList.get(3).getReturnValue(),"6");
		
	}

		

	@Test 
	public void testSize() {
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		assertEquals(myList.size(),6);
		
	}
	
	@Test
	public void testAddExtreme () {
		
		for (int i = 0; i<1000000; i++) {
			String myString = ""+i;
			myList.add(myString);
		}
		
		assertEquals(myList.get(999999).getReturnValue(),"999999");
		
	}

		
	}

