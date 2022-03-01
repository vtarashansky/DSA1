import list.*;
public class mytest {

	
	public static void main(String [] args) {
		int num_tests = 90000000; //100,000,000
		int n = 90000000;
		System.out.println("InsertAtTail : " + testInsertAtTail(makeList(n),num_tests) + " milliseconds seconds");
		System.out.println("InsertAtHead : " + testInsertAtHead(makeList(n),num_tests) + " milliseconds seconds");
		System.out.println("InsertAt : " + testInsertAt(makeList(n),num_tests) + " milliseconds seconds"); //insert at middle of list
		// System.out.println("Insert : " + testInsert(makeList(n),num_tests) + " milliseconds seconds");
		System.out.println("RemoveAtTail : " + testRemoveAtTail(makeList(n),num_tests) + " milliseconds seconds");
		System.out.println("RemoveAtHead : " + testRemoveAtHead(makeList(n),num_tests) + " milliseconds seconds");
		// System.out.println("Remove : " + testRemove(makeList(n),num_tests) + " milliseconds seconds");
		System.out.println("Find : " + testFind(makeList(n),num_tests) + " milliseconds seconds"); //find element at center of the list
		System.out.println("Get : " + testGet(makeList(n),num_tests) + " milliseconds seconds"); //get element at center of the list
		
	}	

	private static LinkedList<Integer> makeList(int n){// make a LL of size n with all ones and a 2 at the center 
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<n; i++){
			{
				if(i==(n/2))
					list.insertAtHead(2);
				list.insertAtHead(1);
			}
		}
		return list;
	}

	private static int testInsertAtTail(LinkedList<Integer> ll,int num_tests){
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.insertAtTail(1);
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testInsertAtHead(LinkedList<Integer> ll,int num_tests){
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.insertAtHead(1);
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testInsertAt(LinkedList<Integer> ll,int num_tests){
		int index = ll.size()/2;
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.insertAt(index,1);
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testInsert(LinkedList<Integer> ll,int num_tests){
		return 0;
	}

	private static int testRemoveAtTail(LinkedList<Integer> ll,int num_tests){
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.removeAtTail();
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testRemoveAtHead(LinkedList<Integer> ll,int num_tests){
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.removeAtHead();
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testRemove(LinkedList<Integer> ll,int num_tests){
		return 0;
	}

	private static int testFind(LinkedList<Integer> ll,int num_tests){
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.find(2);
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	private static int testGet(LinkedList<Integer> ll,int num_tests){
		int index = ll.size()/2;
		long timems = System.currentTimeMillis();
		for(int i=0;i<num_tests; i++)
		{
			ll.get(index);
		}
		timems= System.currentTimeMillis() - timems;
		if(timems<1000) System.out.println("NOT LONG ENOUGH");
		return (int)timems;
	}

	
}
