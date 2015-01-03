package cw3;

public class TestFunctionalArrayList {


	public static void main(String[] args) {
		
		FunctionalList testList = new FunctionalArrayList();
		
		testList.add("Ada Lovelace");
		testList.add("Charles Babbage");
		testList.add("Vannevar Bush");
		testList.add("Mauchly");
		testList.add("Licklider");
		
		System.out.println(testList.head().getReturnValue());
		System.out.println(testList.rest().size());
		System.out.println(testList.rest().get(1).getReturnValue());


	}

}
