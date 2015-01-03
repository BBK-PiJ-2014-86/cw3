package cw3;

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

		return null;
	}

}
