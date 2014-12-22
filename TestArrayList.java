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
		System.out.println(array.remove(0).getReturnValue().toString());
		array.add(0, "Happy Cycling");
		array.add(0, "Dayvan Cowboy");
		array.add(0, "Avril 14");
		array.add(0, "An Eagle in your mind");
		array.add(0, "1969");
		array.add(0, "Rhubarb");
		array.add(0, "444");
		
		System.out.println(array.get(1).getReturnValue().toString());
		System.out.println(array.get(6).getReturnValue().toString());
		
		System.out.println(array.size());
		

		
	}

}
