package Hint1;

public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int maxItems;
	private int[] items;
	private int numItems;
	
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m){

		maxItems = m;
		numItems = 0;
		items = new int[maxItems];
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		boolean isEmpty = false;
		
		if(numItems == 0)
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
		
		int result = 0;
		
		if(this.numItems == 0)
		{
			System.out.println("Error: MyQueue is empty");
			
			result = -1;
		}
		
		else
		{
			result = items[0];
		}

		return result;

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		int scenario = 0;
		
		if(numItems < maxItems)
		{
			scenario = 1;
		}
		
		else
		{
			scenario = 2;
		}
		
		switch(scenario)
		{
		case 1: 
			items[numItems] = element;
			numItems++;
			break;
			
		case 2:
			System.out.println("Error: myQueue is already full");
			break;
		}
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(numItems != 0)
		{
			items[0] = 0;
			
			for(int count = 0; count < numItems-1; count++)
			{
				
				items[count] = items[count+1];
				
			}
			
			numItems--;
		}
		
		else
		{
			System.out.println("Error: myQueue is empty");
		}
		
	}
	
}
