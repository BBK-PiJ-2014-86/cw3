package cw3;

public class TestSampleableListImpl {

	
	public static void main(String[] args) {
		
	SampleableList testList = new SampleableListImpl();
		
		testList.add("Ada Lovelace");
		testList.add("Charles Babbage");
		testList.add("Vannevar Bush");
		testList.add("Mauchly");
		testList.add("Licklider");
		
	     SampleableList testList2 = testList.sample();
		System.out.println(testList2.get(0).getReturnValue());
		System.out.println(testList2.get(1).getReturnValue());
		System.out.println(testList2.get(2).getReturnValue());
		
	}

}
