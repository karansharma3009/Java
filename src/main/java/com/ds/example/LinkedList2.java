package com.ds.example;



public class LinkedList2 {
	
	public static void main(String[] args) {
		 
		Node n1 = new Node(1,null);
		Node n2 = new Node(5,null);
		Node n3 = new Node(7,null);
		Node n4 = new Node(9,null);
		Node n5 = new Node(2,null);
		Node n6 = new Node(4,null);
		Node n7 = new Node(6,null);
		Node n8 = new Node(8,null);
		Node n9 = new Node(10,null);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		//list 2 starts with n5 
		n5.next =n6;
		n6.next = n7;
		n7.next=n8;
		n8.next =n9;
		n9.next = null;
		
		Node L1 = n1; Node L2=n5;
		Node tmp = L1;
		while ( tmp!=null)
		{
			System.out.print(tmp.data);
			tmp= tmp.next;
			System.out.print("=>");
		}
		
		System.out.print("Second list "); 
		tmp =L2 ;
		while ( tmp!=null)
		{
			System.out.print(tmp.data);
			tmp= tmp.next;
			System.out.print("=>");
		}
		
	    Node curr = null;
	    Node head = new Node(0,null) ;
	    tmp = head;
	    curr= head;
		while (L1!=null &&  L2 !=null)    
		{
		 if (L1.data <= L2.data)
			{
				head.next = L1 ;
				L1 = L1.next;
			}
			else
			{
				head.next = L2 ;
				L2 = L2.next;
			}
		 head = head.next;
		}
		
		 if(L1!=null){
			 head.next = L1;
		    }
		 
		    if(L2!=null){
		        head.next = L2;
		    }
	
		 
		
		System.out.println("=======Merged List===");
		while ( tmp!=null)
		{
			
			System.out.print(tmp.data);
			tmp= tmp.next;
			System.out.print("=>");
		}
		}
	
	
	
	
		
	}
	
	

