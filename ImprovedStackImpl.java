package cw3;

public class ImprovedStackImpl implements ImprovedStack{
	
	private List list;
	
	
	public ImprovedStackImpl () {
		list = new ArrayList();
	}
	
	public ImprovedStackImpl (List list) {
		this.list = list;
	}

	@Override
	public boolean isEmpty() {
		
		if(list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
	
		return list.size();
	}

	@Override
	public void push(Object item) {
	
		if (item == null) {
			return;
		} else {
			list.add(item);
		}
		
	}
	

	@Override
	public ReturnObject top() {
	
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return list.get(list.size()-1);
		}
	}

	@Override
	public ReturnObject pop() {
		
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return list.remove(list.size()-1);
		}
	}

	@Override
	public ImprovedStack reverse() {
		
		if (isEmpty()) {
			return null;
		}
		
		ReturnObject [] oldArray = ((ArrayList) list).getArray();
		ReturnObject [] newArray = new ReturnObjectImpl [oldArray.length]; 
		
		for (int i = 0; i < list.size();i++) {

			newArray[i] = oldArray[(list.size()-1)-i]; 
			
		}
		
		ArrayList newList = new ArrayList();
		
		newList.setArray(newArray,list.size());
		
		ImprovedStack reversedCopy = new ImprovedStackImpl (newList);
		return reversedCopy;
		
	}

	@Override
	public void remove(Object object) {
		
		for (int i =0; i<list.size(); i++) {
			if (list.get(i).getReturnValue().equals(object)) {
				list.remove(i);
			} 
		}
		
	}
	

	
	

}
