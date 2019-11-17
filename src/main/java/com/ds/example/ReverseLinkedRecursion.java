package com.ds.example;
class ReverseLinkPrint {
	
	Node head= null;
	Node next = null;
	public Node ReverseList() {
		 
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
	   Node head = n1 ;
		printReverse( tmp );	
	  return head;
	}

	void printReverse(Node head)
    {
        if (head == null) return;
        // print list of head node
        printReverse(head.next);
        // After everything else is printed
        System.out.print(head.data+" ");
    }
	
	
	Node ReverseUtil ( Node curr , Node prev)
	{
		
		if ( curr.next == null){
			head = curr ;
			curr.next = prev;
			return null;
		}
			else
			{
				 next = curr.next;
				curr.next = prev ; 
			}
			
		ReverseUtil( next , curr);
		return head;
		
	}
}


class ReverseLinkedRecursion {
	public static void main(String[] args) {
		ReverseLinkPrint r = new ReverseLinkPrint();
		Node head =r.ReverseList();
		 
		head =r.ReverseUtil(head, null);
		
		while (head!=null){
		System.out.println(head.data);
		head=head.next;
		}
		
	}
}