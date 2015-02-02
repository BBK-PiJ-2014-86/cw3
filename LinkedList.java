package cw3;

/**
 * The class implements List {@see List} and creates a linked lists of Object instances wrapped in objects of type ReturnObject 
 * {@see ReturnObject}
 *  
 * @author ageorgiev
 *
 */

public class LinkedList implements List {
	
	private int size;
	protected ReturnObjectImpl head;
	
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

		ReturnObjectImpl iter = head;
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			
			if (index == 0) {
				head = head.getNext();
				size--;
				return iter;
			} else {
				for (int i = 0; i<index-1; i++) {
					iter = iter.getNext();
				}
				ReturnObjectImpl removed = iter.getNext();
				iter.setNext(iter.getNext().getNext());
				size--;
				return removed;
			}
		}
	}

	@Override
	public ReturnObject add(int index, Object item) {
		
		ReturnObjectImpl iter;

			
		 if (index >=size || index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			return new ReturnObjectImpl (ErrorMessage.INVALID_ARGUMENT);
		} else if (index == 0 && head != null) {
			iter = new ReturnObjectImpl (item);
			iter.setNext(head);
			head = iter;
			size ++;
			return new ReturnObjectImpl (null);
         } else {
			iter = head;
				for (int i = 0; i<index-1; i++) {
					iter = iter.getNext();
				}
			ReturnObjectImpl temp = iter.getNext();
			ReturnObjectImpl inserted = new ReturnObjectImpl (item);
			iter.setNext(inserted);
			inserted.setNext(temp);
			size++;
			return new ReturnObjectImpl (null);
		}
		
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
