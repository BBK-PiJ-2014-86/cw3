package cw3;

public class ImprovedStackImpl implements ImprovedStack{
	
	private List stack;
	
	
	public ImprovedStackImpl () {
		stack = new ArrayList();
	}

	@Override
	public boolean isEmpty() {
		
		if(stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
	
		return stack.size();
	}

	@Override
	public void push(Object item) {
	
		if (item == null) {
			return;
		} else {
			stack.add(item);
		}
		
	}
	

	@Override
	public ReturnObject top() {
	
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return stack.get(stack.size()-1);
		}
	}

	@Override
	public ReturnObject pop() {
		
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return stack.remove(stack.size()-1);
		}
	}

	@Override
	public ImprovedStack reverse() {
		
		return null;
	}

	@Override
	public void remove(Object object) {
		
		
	}
	
	

}
