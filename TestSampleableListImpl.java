package cw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSampleableListImpl {

	List myList;
		
	@Before
	public void initialise () {
		myList = new SampleableListImpl ();
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
	
	
	@Test
	public void testGetEmpty() {
	
		assertEquals(myList.get(1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		
	}
	
	@Test
	public void testIsEmptyAfterAddingAndRemoving() {
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		myList.remove(0);
		myList.remove(0);
		myList.remove(0);
		myList.remove(0);
		myList.remove(0);
		myList.remove(0);
		
	
		assertEquals(0,myList.size());
		
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
		
		for (int i = 0; i<10000; i++) {
			String myString = ""+i;
			myList.add(myString);
		}
		
		assertEquals(myList.get(9999).getReturnValue(),"9999");
		
	}
	
	@Test
	public void TestSample(){
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		assertEquals("4",((SampleableListImpl)myList).sample().get(1).getReturnValue().toString());
		
	}


		
	}