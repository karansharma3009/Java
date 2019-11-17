package com.ds.example;

class Node
{
	int data;
	Node next;
	
	Node(int data , Node n )
	{
		this.data = data ;
		this.next = null;
	}
	
}

public class LinkedLinkedReverse {
	
	public static void main(String[] args) {
		 
		Node n1 = new Node(1,null);
		Node n2 = new Node(2,null);
		Node n3 = new Node(3,null);
		Node n4 = new Node(4,null);
		Node n5 = new Node(5,null);
		Node n6 = new Node(6,null);
		Node n7 = new Node(7,null);
		Node n8 = new Node(8,null);
		Node n9 = new Node(9,null);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next =n6;
		n6.next = n7;
		n7.next=n8;
		n8.next =n9;
		n9.next = null;
		Node tmp = n1;
		while ( tmp!=null)
		{
			System.out.print(tmp.data);
			tmp= tmp.next;
			System.out.print("=>");
		}
		if (tmp ==null) { System.out.println("null");}
		

		
		Node head = n1;
		Node curr = head ;
		Node next = null;
		Node prev = null;
			  
	       int count = 0;
		  while (count < 9 && curr != null) 
	       {
	
			  
		next = curr.next; // next 2 
		curr.next = prev; //1=null;
		prev = curr ;  //prev = 1;
		curr= next;
	
	       }	  
		  tmp = n9;
		  while ( tmp!=null)
			{
				System.out.print(tmp.data);
				tmp= tmp.next;
				System.out.print("=>");
			}
			  
	}

}
