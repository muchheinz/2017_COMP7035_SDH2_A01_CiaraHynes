package Hint2;

public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyNode head;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){

		this.head = null;
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		boolean isEmpty = false;
		
		if(head == null)
		{
			isEmpty = true;
		}
		
		else
		{
			isEmpty = false;
		}
		
		return isEmpty;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){

		return head.getInfo();
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		if( head == null)
		{
			head = new MyNode(element, null);
		}
		
		else
		{
			MyNode next = head.getNext();
			MyNode current = head;
			
			while(next != null)
			{
				current = next;
				next = next.getNext();
			}
			
			current.setNext(new MyNode(element, null));
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		
		if(head != null)
		{
			head = head.getNext();
		}

		else
		{
			System.out.println("There is nothing in the queue");
		}
		
	}
	
}
