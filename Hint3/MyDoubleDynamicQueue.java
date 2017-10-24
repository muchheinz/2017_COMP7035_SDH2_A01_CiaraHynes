package Hint3;


public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){

		this.head = null;
		this.tail = null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
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
	public T first(){

		return head.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){

		if( head == null)
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}
		
		else
		{
			
			MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<T>(null, element, head);
			
			head.setLeft(node);
			head = node;
			
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){

		if( head == null)
		{
			System.out.println("The queue is empty");
		}
		
		else
		{
			head = head.getRight();
			
			if(head != null)
			{
				head.setLeft(null);

			}
			
			else
			{
				tail = null;
			}
			
		}
		
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){

		return tail.getInfo();
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){

		if( head == null)
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}
		
		else
		{	
			MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<T>(tail, element, null);
			
			tail.setRight(node);
			tail = node;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){

		if( head == null)
		{
			System.out.println("The queue is empty");
		}
		
		else
		{
			tail = tail.getLeft();
			
			if(tail != null)
			{
				tail.setRight(null);
			}
			
			else
			{
				head = null;
			}
			
		}
		
		
	}
	
}
