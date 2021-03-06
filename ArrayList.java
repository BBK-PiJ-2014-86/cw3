package cw3;

/**
 * The class implements List {@see List} and creates an array list of Object instances wrapped in objects of type ReturnObject 
 * {@see ReturnObject}
 * @author ageorgiev
 *
 */

public class ArrayList implements List {

	protected int size;
	protected ReturnObjectImpl[] array;
	
	/**
	 * Constructor:
	 * The constructor for the ArrayList initialises the size of array at 0 and the array is created with initial length of 5
	 */
	
	public ArrayList () {
		size = 0;
		array = new ReturnObjectImpl [5];
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		
		if (size == 0) return true; else return false;
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public int size() {
		
		return size;
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public ReturnObject get(int index) {
		
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return array[index];
		}
	}

	/**
	 * {@inheritDoc}
	 * <br>
	 * <br>
	 * The method calls another method {@see copyAndResize()} which provides an array without the removed element.
	 *    
	 */
	
	@Override
	public ReturnObject remove(int index) {
		
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ReturnObjectImpl removed = array[index];
			array[index] = null;
			size--;
			array = copyAndResize(array,null,index,-1);
			return removed;
		}
		
	}

	/**
	 * This method is used when adding or removing an element at a specified index. In the case of removing, the method will
	 * overwrite the deleted element. In the case of adding, the method will add the new element and shift the elements
	 * to the right of the added element  
	 * 
	 * @param (ReturnObjectImpl[]) array2 - array to be copied and resized
	 * @param (ReturnObjectImpl) item - used only when adding an element. Null when deleting elements
	 * @param  (int) index - index of where the element is being added or from where it is deleted
	 * @param (int) i This specifies if the method will resize after adding or deleting : -1 when deleting elements, 1 when adding elements
	 * @return an array of type ReturnObjectImpl [] 
	 */
	private ReturnObjectImpl[] copyAndResize(ReturnObjectImpl[] array2, ReturnObjectImpl item, int index, int i) {
		
		ReturnObjectImpl [] newArray;
		
		newArray = new ReturnObjectImpl [size];
		
		for (int j = 0; j<index; j++) {
			newArray[j] = array[j]; 
		}
		
		switch (i) {
			case -1:
	
				for (int k = index; k<newArray.length; k++) {
					newArray[k] = array[k+1];
				}
				
				return newArray;
			
			case 1:
		
				for (int m = index+1; m < newArray.length; m++) {
					
					newArray [m] = array[m-1];
				}
			
				newArray[index] = item;
				
				return newArray;
			
		}
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * <br>
	 * <br>
	 * The method calls another method {@see copyAndResize()} which provides an array with the added element.
	 *    
	 */

	@Override
	public ReturnObject add(int index, Object item) {
			
		ReturnObjectImpl addItem = new ReturnObjectImpl (item);
		if (index >=size|| index<0) {
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (array [index] != null) {
			size++;
			array = copyAndResize(array, addItem, index, 1);
			return new ReturnObjectImpl (null);
		} else {
			size++;
			array[index] = addItem;
			return new ReturnObjectImpl (null);
		}
			
		
	}


	/**
	 * {@inheritDoc}
	 * <br>
	 * <br>
	 * The method checks if the array where the container objects are stored is full. If so, the array will double in size
	 * @see doubleArray();
	 *    
	 */
	
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
				array = doubleArray(array);
			}
		
			return new ReturnObjectImpl(null);
		}
	}
	
	/**
	 * Copies the elements of the passed array, doubles its length and returns it 
	 * @param (ReturnObjectImpl [] ) array2 
	 * @return ReturnObjectImpl [] 
	 */

	private ReturnObjectImpl[] doubleArray(ReturnObjectImpl[] array2) {
		
		ReturnObjectImpl [] newArray = new ReturnObjectImpl [array2.length*2];
		
		for (int i =0; i<array2.length; i++) {
			newArray[i] = array2[i];
		}
		
		return newArray;
		
	}
	
	/**
	 * Returns the array object where wrapper objects are stored
	 * @return array of type ReturnObject[]
	 */
	
	public ReturnObject[] getArray () {
		
		return array;
		
	}
	
	/**
	 * Sets the array field to the provided array and sets the size of how many actual wrapper objects are stored in the array
	 * @param array
	 * @param size - sets the size of the array, ie how many actual elements are there.
	 */
	
	public void setArray (ReturnObject[] array, int size) {
		
		this.array = (ReturnObjectImpl[]) array;
		this.size=size;
		
	}

}
