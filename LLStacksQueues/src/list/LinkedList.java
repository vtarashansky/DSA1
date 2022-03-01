package list;

/**
 * 
 * A custom built linked list
 * T here is the type the list stores
 */
public class LinkedList<T> implements List<T>{

	/* Dummy head and tail */
	private ListNode<T> head, tail;
	private int size;
	@SuppressWarnings("unchecked")
	public LinkedList() {
		head = (ListNode<T>) new ListNode<Object>(0);
		tail = (ListNode<T>) new ListNode<Object>(0);
		head.next=tail;
		tail.prev = head;
		
		size = 0; 
	}
	
	public int size() {
		/* TODO: Implement this method */  
		return size;
	}
	
	/**
	 * Clears out the entire list
	 */
	public void clear() {
		/* TODO: Implement this method */ 
		head.next=tail;
		tail.prev = head;
		
		size = 0;
	}
	
	/**
	 * Inserts new data at the end of the list (i.e., just before the dummy tail node)
	 * @param data
	 */
	public void insertAtTail(T data) {
		/* TODO: Implement this method */  
		ListNode<T> newNode = new ListNode<T>(data);
		newNode.prev = tail.prev;
		newNode.next = tail;
		tail.prev.next = newNode;
		tail.prev = newNode;
		size++;
	}
	
	/**
	 * Inserts data at the front of the list (i.e., just after the dummy head node
	 * @param data
	 */
	public void insertAtHead(T data) {
		/* TODO: Implement this method */ 
		ListNode<T> newNode = new ListNode<T>(data);
		newNode.next = head.next;
		newNode.prev = head;
		head.next.prev = newNode;
		head.next = newNode;
		size++;
	}
	
	/**
	 * Inserts node such that index becomes the position of the newly inserted data
	 * @param data
	 * @param index
	 */
	public void insertAt(int index, T data) {
		/* TODO: Implement this method */  
		ListNode<T> newNode = new ListNode<T>(data);
		
		ListNode<T> oldIndMinusOne = head;
		for(int i=0;i<index;i++) {
			oldIndMinusOne = oldIndMinusOne.next;
		}
		
		newNode.next = oldIndMinusOne.next;
		newNode.prev = oldIndMinusOne;
		oldIndMinusOne.next = newNode;
		
		size++;
	}
	
	/**
	 * Inserts data after the node pointed to by iterator
	 */
	public void insert(ListIterator<T> it, T data) {
		/* TODO: Implement this method */ 
		ListNode<T> newNode = new ListNode<T>(data);
		newNode.next = it.curNode.next;
		newNode.prev = it.curNode;
		it.curNode.next = newNode;
		
		size++;
		
	}
	
	
	
	public T removeAtTail(){
		if(size==0)return null;
		ListNode<T> rem = tail.prev;
		tail.prev = rem.prev;
		tail.prev.next = tail;
		size--;
		return rem.getData();
	}
	
	public T removeAtHead(){
		/* TODO: Implement this method */ 
		if(size == 0) return null;
		ListNode<T> rem = head.next;
		head.next = rem.next;
		rem.next.prev = head;
		size--;
		
		return rem.getData();
	}
	
	/**
	 * Remove based on Iterator position
	 * Sets the iterator to the node AFTER the one removed
	 */
	public T remove(ListIterator<T> it) {
		/* TODO: Implement this method */
		T ret = it.value();
		it.curNode.next.prev = it.curNode.prev;
		it.curNode.prev.next = it.curNode.next;
		it.curNode = it.curNode.next;
		size--;
		return ret;
	}
	
	/**
	 * Returns index of first occurrence of the data in the list, or -1 if not present
	 * @param data
	 * @return
	 */
	public int find(T data) {
		/* TODO: Implement this method */  
		ListNode<T> temp = head.next;
		for(int i = 0;i<size;i++) {
			if(temp.getData().equals(data))
				return i;
			else
				temp = temp.next;
		}
		return -1;
	}
	
	/**
	 * Returns the data at the given index, null if anything goes wrong (index out of bounds, empty list, etc.)
	 * @param index
	 * @return
	 */
	public T get(int index) { 
		/* TODO: Implement this method */  
		ListNode<T> temp = head.next;
		for(int i = 0;i<index;i++) {
			
				temp = temp.next;
		}
		return temp.getData();
	}
	
	/**
	 * Returns the list as space separated values
	 */
	public String toString() {
		String toRet = "[";
		
		ListNode<T> curNode = head.next;
		while(curNode != tail) {
			toRet += curNode.getData() + ", ";
			curNode = curNode.next;
		}
		
		return toRet + "]";
	}
	
	/* Return iterators at front and end of list */
	public ListIterator<T> front(){ 
		/* TODO: Implement this method */
		if(size == 0)
			return new ListIterator<T>(head);
		return new ListIterator<T>(head.next);
	}

	public ListIterator<T> back(){
		/* TODO: Implement this method */ 
		if(size == 0)
			return new ListIterator<T>(tail);
		return new ListIterator<T>(tail.prev);
	}
	
	
}
