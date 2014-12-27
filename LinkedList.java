package cw3;

public class LinkedList implements List {
	
	private int size;
	private ReturnObjectImpl head;
	

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

		ReturnObjectImpl iter = head;
		
		if (item == null) {
			return new ReturnObjectImpl (ErrorMessage.INVALID_ARGUMENT);
		} else if (iter == null) {
		iter = (ReturnObjectImpl) item;
		size++;
		return new ReturnObjectImpl (null);
		} else {
			
			while (iter.getNext()!= null) {
				iter = iter.getNext();
			}
			iter.setNext((ReturnObjectImpl) item);
			size++;
			return new ReturnObjectImpl (null);
			}
		
	}

}
