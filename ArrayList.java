package cw3;

public class ArrayList implements List {

	private int size;
	private ReturnObjectImpl [] array;
	
	public ArrayList () {
		size = 0;
		array = new ReturnObjectImpl [10];
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
		
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ReturnObjectImpl removed = array[index];
			array[index] = null;
			size--;
			array = copyAndResize(array,index,-1);
			return removed;
		}
		
	}

	private ReturnObjectImpl[] copyAndResize(ReturnObjectImpl[] array2, int index, int i) {
		
		ReturnObjectImpl [] newArray;
		
		switch (i) {
			case -1:
			
			newArray = new ReturnObjectImpl [size];
			
			for (int j = 0; j<index; j++) {
				newArray[j] = array[j]; 
			}
			
			for (int k = index; k<newArray.length; k++) {
				newArray[k] = array[k+1];
			}
			
			return newArray;
			
		case 1:
		
				break;
		}
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
			
			if (size == array.length) {
				array = DoubleArray(array);
			}
		
			return new ReturnObjectImpl(null);
		}
	}

	private ReturnObjectImpl[] DoubleArray(ReturnObjectImpl[] array2) {
		
		ReturnObjectImpl [] newArray = new ReturnObjectImpl [array2.length*2];
		
		for (int i =0; i<array2.length; i++) {
			array2[i] = newArray[i];
		}
		
		return newArray;
		
	} 

}
