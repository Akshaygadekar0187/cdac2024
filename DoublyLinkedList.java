// 2.Implement Doubly linked list in java

import java.util.Scanner;
class DoublyLinkedList{

  static class Node{
	int data;
	Node next;
	Node prev;
		public Node(int data)
		{
		   this.data=data;
		   next=prev=null;
		}
	}
	
	void display(Node root)
	{
	   Node p=root;
	   if(root==null)
	     {
		System.out.println(" list is empty ");
		System.out.println(" ");
	      }
	else
	{
	    while(p!=null)
	  {
	       System.out.print(p.data+" ");
	       p=p.next;
	  }
        	System.out.println(" ");
	}	
}
	Node addAtEnd(Node root,int data){
        Node n=new Node(data);
	Node p=root;
	 if(root==null)
	 {
		 root=n;
	 }
	else
	{
	    while(p.next!=null)
        	{
    		  p=p.next;
		}
		p.next=n;
		n.prev=p;
	}	
    return root;
}
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList dl=new DoublyLinkedList();
		Node root=null;
		
		int choice=1;
		while(choice!=0)
		{
			
			System.out.println("1. add at end");
			System.out.println("2. display");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				        System.out.println("enter a elemtn");
						int no=sc.nextInt();
						System.out.println(" ");
				         root= dl.addAtEnd(root,no);
				        break;
				case 2:
				        dl.display(root);
				        break;
			}
		}
	}
}