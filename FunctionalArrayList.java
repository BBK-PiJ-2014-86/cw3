package cw3;

public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	@Override
	public ReturnObject head() {

		 if (isEmpty()) {
			 ReturnObject error = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			 return error;
		 } else {
			 ReturnObject head = array[0];
			 return head;
		 }
	}

	@Override
	public FunctionalList rest() {

		return null;
	}

	
}
