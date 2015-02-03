package cw3;

/** 
 * The class extends AbstractStack
 * @author ageorgiev
 *
 */

public class StackImpl extends AbstractStack{
	
	public StackImpl(List list) {
		super(list);
		
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public boolean isEmpty() {

		if (internalList.size()==0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public int size() {

		return internalList.size();
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public void push(Object item) {
 
		  if (item == null) {
			  return;
		  } else {
		  internalList.add(item);
		  }
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public ReturnObject top() {
		
		
		if (internalList.size() == 0) {
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
		}
		return internalList.get(internalList.size()-1);
	}
	
	/**
	 * {@inheritDoc}
	 */

	@Override
	public ReturnObject pop() {
		
		if (internalList.size() == 0) {
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
		}
		return internalList.remove(internalList.size()-1);
	}

	
}
