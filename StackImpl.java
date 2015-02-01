package cw3;

public class StackImpl extends AbstractStack{
	
	// do I create size param to track the size of the stack or not? 
	// size of the list must be visible - getSize?

	//what if the list is empty?
	//there is a thing called internalList which is of type List;
	
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
		
		return internalList.get(internalList.size()-1);
	}

	@Override
	public ReturnObject pop() {
		
		return null;
	}

	
}
