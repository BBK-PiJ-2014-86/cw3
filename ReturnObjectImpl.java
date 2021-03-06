package cw3;

public class ReturnObjectImpl implements ReturnObject {
	
	private ErrorMessage error;
	private Object returnValue;
	private ReturnObjectImpl next;


	
	public ReturnObjectImpl (Object data) {
		returnValue = data;
		error = ErrorMessage.NO_ERROR;
		next = null;
	}
	
	public ReturnObjectImpl (ErrorMessage error) {
		
		this.error = error;
	}

	
	@Override
	public boolean hasError() {
		
		if (error != ErrorMessage.NO_ERROR) {
			return true;
		} else return false;
	}

	@Override
	public ErrorMessage getError() {
		
		return error;
	}

	@Override
	public Object getReturnValue() {
		
		return returnValue;
	}
	
	/**
	 * sets the the object to be wrapped within the container class
	 * @param
	 */
	
	public void setReturnValue (Object data) {
		returnValue = data;
	}
	
	/**
	 * sets the ErrorMessage to be contained within the instance
	 * @param ErrorMessage
	 */
	
	public void setErrorMessage (ErrorMessage error) {
		this.error = error;
	}
	
	/**
	 * returns the next element stored 
	 * @return returns ReturnObjectImpl
	 */
	
	public ReturnObjectImpl getNext () {
		return next;
	}
	
	/**
	 * sets the next element to be stored
	 * @param ReturnObjectImpl
	 */
	
	public void setNext(ReturnObjectImpl newNext) {
		next = newNext;
		
	}
	
}
