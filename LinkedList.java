package cw3;

public class LinkedList implements List {
	
	private int size;
	private ReturnObjectImpl head;
	
	public LinkedList () {
		
		size = 0;
		head = null;
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
		
		ReturnObjectImpl iter = head;
		System.out.println(size());
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			for (int i = 0; i<index; i++) {
				iter = iter.getNext();
			}
			return iter;
		}
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

		ReturnObjectImpl iter;
		
		if (item == null) {
			return new ReturnObjectImpl (ErrorMessage.INVALID_ARGUMENT);
		} else if (head == null) {
			head = new ReturnObjectImpl(item);

			size++;
			return new ReturnObjectImpl (null);
		} else {
			iter = head;
			while (iter.getNext()!= null) {
				iter = iter.getNext();
			}
			iter.setNext(new ReturnObjectImpl(item));
			size++;
			return new ReturnObjectImpl (null);
			}
		
	}

}
