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
	
	public void setReturnValue (Object data) {
		returnValue = data;
	}
	
	public void setErrorMessage (ErrorMessage error) {
		this.error = error;
	}
	
	public ReturnObjectImpl getNext () {
		return next;
	}
	
	public void setNext(ReturnObjectImpl newNext) {
		next = newNext;
		
	}
	
}
