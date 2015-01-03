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
