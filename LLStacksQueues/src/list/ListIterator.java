package list;

public class ListIterator<T> {
	
	protected ListNode<T> curNode;
	
	public ListIterator(ListNode<T> curNode) {
		this.curNode = curNode;
	}
	
	/**
	 * These two methods tell us if the iterator has run off
	 * the list on either side
	 */
	public boolean isPastEnd() {
		/* TODO: Implement this method */
		if(curNode.prev==null && curNode.next.next==null)
			return true;
		return (curNode.next== null);
		
	}
	
	public boolean isPastBeginning() {
		/* TODO: Implement this method */
		if(curNode.next==null && curNode.prev.prev==null)
			return true;
		return (curNode.prev == null);
	}
	
	/**
	 * Get the data at the current iterator position
	 */
	public T value() {
		/* TODO: Implement this method */
		return curNode.getData();
	
	}
	
	/**
	 * These two methods move the cursor of the iterator
	 * forward / backward one position
	 */
	public void moveForward() {
		/* TODO: Implement this method */
		if(!isPastEnd()) {
			curNode = curNode.next;
		}
	}
	
	public void moveBackward() {
		/* TODO: Implement this method */
		if(!isPastBeginning()) {
			curNode = curNode.prev;
		}
	}
}
