package cw3;

public class StackImpl extends AbstractStack{
	
	public StackImpl(List list) {
		super(list);
		

	}

	@Override
	public boolean isEmpty() {

		if (internalList.size()==0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {

		return internalList.size();
	}

	@Override
	public void push(Object item) {
 
		  internalList.add(item);
	}

	@Override
	public ReturnObject top() {
		
		
		if (internalList.size() == 0) {
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
		}
		return internalList.get(internalList.size()-1);
	}

	@Override
	public ReturnObject pop() {
		
		if (internalList.size() == 0) {
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
		}
		return internalList.remove(internalList.size()-1);
	}

	
}
