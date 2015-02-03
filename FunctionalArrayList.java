package cw3;

/**
 * The class extends @see ArrayList and implements @see FunctionalList
 * @author ageorgiev
 */

public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	/**
	 * {@inheritDoc}
	 */
	
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
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public FunctionalList rest() {

		FunctionalList fList = new FunctionalArrayList();
		
		if (isEmpty()) {
			return fList;
		} else {
			for (int i = 1; i<size(); i++) {
				fList.add(array[i].getReturnValue());
			}
			
			return fList;
		}
		
	}

	
}
