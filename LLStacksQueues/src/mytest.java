import list.*;
public class mytest {

	
	public static void main(String [] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.insertAtTail(3);
		list.insertAtHead(5);
		list.insertAtHead(4);
		list.insertAtHead(2);
		list.insertAtHead(1);
		list.removeAtHead();
		
		
		
		System.out.println(list);
	}
}
