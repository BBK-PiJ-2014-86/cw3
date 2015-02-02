package cw3;

/**
 * The class implements @see SampleableList and extends @see LinkedList
 * @author ageorgiev
 *
 */

public class SampleableListImpl extends LinkedList implements SampleableList{

	@Override
	public SampleableList sample() {
		
		SampleableList list  = new SampleableListImpl (); 
		
		if(isEmpty()) {
			return list;
		} else {
			for (int i = 1; i<size(); i+=2) {
			list.add(get(i).getReturnValue());
			}
			return list;
		}
		
	}

}
