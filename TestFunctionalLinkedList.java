package cw3;

public class TestFunctionalLinkedList {

	public static void main(String[] args) {

	FunctionalList testList = new FunctionalLinkedList();
		
		testList.add("Ada Lovelace");
		testList.add("Charles Babbage");
		testList.add("Vannevar Bush");
		testList.add("Mauchly");
		testList.add("Licklider");
		
		System.out.println(testList.head().getReturnValue());
		System.out.println(testList.rest().size());
		System.out.println(testList.rest().get(3).getReturnValue());
		
	}

}
