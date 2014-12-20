package cw3;

public class ArrayList implements List {

	private int size;
	private ReturnObjectImpl [] array;
	
	public ArrayList () {
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		
		if (size == 0) return true; else return false;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public ReturnObject get(int index) {
		
		return null;
	}

	@Override
	public ReturnObject remove(int index) {
		
		return null;
	}

	@Override
	public ReturnObject add(int index, Object item) {

		return null;
	}

	@Override
	public ReturnObject add(Object item) {

		ReturnObjectImpl returnObject = new ReturnObjectImpl (item);
		
		if (item== null) {
			returnObject.setErrorMessage(ErrorMessage.INVALID_ARGUMENT);
			return returnObject;
		} else {
		
		array[size] = returnObject;
		size++;		
		
		return new ReturnObjectImpl(null);
		}
	} 

}
