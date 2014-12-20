package cw3;

public class ReturnObjectImpl implements ReturnObject {
	
	private ErrorMessage error;
	private Object returnValue;

	
	public ReturnObjectImpl (Object data) {
		returnValue = data;
		error = ErrorMessage.NO_ERROR;
	}
	
	@Override
	public boolean hasError() {
		
		if (error != ErrorMessage.NO_ERROR) {
			return true;
		} else return false;
	}

	@Override
	public ErrorMessage getError() {
		
		return null;
	}

	@Override
	public Object getReturnValue() {
		
		return returnValue;
	}
	
}
