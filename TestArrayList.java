package cw3;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList array = new ArrayList();
		
		array.add("Andrean");
		array.add("Mike Sandison");
		array.add("Bob Dylan");
		
		System.out.println(array.size());
		System.out.println(array.isEmpty());

		

		System.out.println(array.get(1).getReturnValue().toString());
		array.add(1, "William Bevan");
		System.out.println(array.get(1).getReturnValue().toString());
		
	}

}
