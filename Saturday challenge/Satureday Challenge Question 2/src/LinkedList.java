
public class LinkedList {
	Node head;
	public void insert(int value)
	{
		Node n1 = new Node(value);
		if(head == null)
		{
			head = n1;//if linkedlist is empty
		}
		else
		{
			Node temp =head;
			head = n1;
			n1.next = temp;
		}
	}
	
	public void append(int value2)
	{
		Node n1 = new Node(value2);
		if(head == null)//linkedlist is empty
		{
			head = n1;

		}
		else {               //if nodes are present
			Node it = head;
			while(it.next != null)
			{
				it = it.next;
			}
			it.next = n1;
		}
	}
	
	public int numberOfNodes()//finding number of nodes in ll
	{
		Node it=head;
		int count =0;
		while(it !=null)
		{		
			
			it=it.next;
			count++;
		}
		
		return count;
		
		
				
	}
	public void insertAt(int value,int position)//for inserting at particular position
	{
		int non = numberOfNodes();
		
		if(position == 1)
		{
			this.insert(value);
		}
		else if(position == non)
		{
			this.append(value);
		}
		else if(position >1 && position<non+1)
		{
			Node n1 = new Node(value);
			Node it=head;
			int count =1;
			while(count != position-1)
			{		
				count++;
				it=it.next;
			}
			 n1.next = it.next;
			 it.next=n1;
		}
		else
			 {
				 System.out.println("Invalid position...");
			 }
			
			
		}
	public void deleteFirst()
	{
		if(head != null)
		{
			
			Node temp = head;
			head = temp.next;
			temp.next = null;
			temp = null;
			
		}
	}
	public void deleteLast()
	{ 
		if(head != null)
		{
			if(head.next == null)
			{
				Node temp = head;
				head = null;
				temp = null;
			}
			else
			{
				Node it = head;
				while(it.next.next != null)
				{
					it = it.next;
				}
					it.next =null;
				}
			}
		}
	public void deleteByPosition(int position)
	{
		int total_nodes = numberOfNodes();
		System.out.println(total_nodes);
		if(position  == 1)
		{
			deleteFirst();
		}
		else if(position == total_nodes)
		{
			deleteLast();
		}
		else if(position>1 && position<total_nodes-1)
		{
			int counter = 1;
			Node it = head;
			while(counter != position-1)
			{
				it =it.next;
				counter++;
			}
			Node temp =it.next;
			it.next =temp.next;
			temp.next = null;
			temp = null;
		}
		else
		{
			System.out.println("Invalid position...");
		}
	}
	public void ReversePrint(Node it)
	{
		if(it != null)
		{
			
			ReversePrint(it.next);
			System.out.print(it.data+"--> ");
		}
		
	}
	
	public void reverseLinkedList()
	{
		Node itp = null;
		Node it = head;
		Node itn = head;
		while(it != null)
		{
			itn = it.next;
			it.next = itp;
			itp = it;
			it = itn;
		}
		head = itp;
	}
	
	

	
	
	
	public String toString()//for printing ll 
	{
		String str="";
		if(head == null)
			return "LinkedList is empty...";
		else
		{
			Node it = head;
			while(it != null)
			{
				str = str+it.data+"->";
				it = it.next;
				
			}
		}
		return str;
	}

	
	public void swapAdjacentNode()
	{
		Node it = head;
		Node itp = head;
		int count = 1;
		//if there is atleat one or more nodes present in linkedList.
			while(it!= null && it.next != null  )
			{
					Node it1 = it.next;
					itp.next = it1;
					Node temp = it1.next;
					it1.next = it;
					if(count == 1)
					{
						head= it1;
					}
					
					it.next = temp;
					itp = it;
					it = it.next;
					count++;
				}
				
			
		}
	}

