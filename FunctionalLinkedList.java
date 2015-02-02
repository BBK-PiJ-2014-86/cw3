package cw3;

/**
 * The class extends @see LinkedList and implements @see FunctionalList
 * @author ageorgiev
 */

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	@Override
	public ReturnObject head() {

		if (isEmpty()) {
			ReturnObject error = new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
			return error;
		} else {
			ReturnObject headCopy = new ReturnObjectImpl (head.getReturnValue());
			return headCopy;
		
		}
		
	}

	@Override
	public FunctionalList rest() {

		FunctionalList fList = new FunctionalLinkedList();
		if (isEmpty()) {
			
			return fList;
		} else {
			
			for (int i=1; i<size();i++) {
				fList.add(get(i).getReturnValue());
			}
			
			return fList;
		}
		
	}

}
