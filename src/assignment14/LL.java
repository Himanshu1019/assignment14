package assignment14;

public class LL 
{
	Node head;
	class Node
	{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	// adding element at first
	
	public void addfirst(int data)
	{
		Node newnode= new Node(data);
			if(head==null) 
			{
				head=newnode;
				return ;
			}
			else
			{
				newnode.next=head;
				head=newnode;
			}
	}
		
	
	public void printlist()
	{
		if(head==null) 
		{
			System.out.println("list is empty");
			return ;
		}
		Node currentnode=head;
		while(currentnode !=null)
		{
			System.out.println(currentnode.data+"...");
			currentnode=currentnode.next;
		}
		System.out.println(" NULL");
		}
		
		
			
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list=new LL();
		list.addfirst(70);
		list.addfirst(30);
		list.addfirst(56);
		
		list.printlist();
	}

}
