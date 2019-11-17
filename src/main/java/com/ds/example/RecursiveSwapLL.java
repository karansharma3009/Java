package com.ds.example;

 class RecursiveSwap {

	Node head  ;
	Node next ; 
	public Node  GenerateList(){
	
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
		return tmp;
}
	
	public  void swap(Node curr) {
		// for recusrively swapping nodes 2 by 2 
		if (curr.next == null)
		{
			return ;
		}
		
		else 
		{
			int tmp = curr.next.data;
			curr.next.data = curr.data;
			curr.data = tmp;
		}
		
		swap(curr.next.next);

	}
	
	
	public  void deleteAlternate(Node curr) {
		// for recusrively swapping nodes 2 by 2 
		if (curr.next == null || curr.next.next == null)
		{
			return ;
		}
		
		else 
		{
			curr.next= curr.next.next;
			
		}
		
		deleteAlternate(curr.next);

	}
 }

 
class RecursiveSwapLL
	{
		public static void main(String[] args) {
			
			RecursiveSwap rs = new RecursiveSwap();
			Node temp = rs.GenerateList();
			rs.swap(temp);

			while(temp!=null)
			{
				System.out.println(temp.data);
			temp = temp.next;
			}

			Node temp2 = rs.GenerateList();
			rs.deleteAlternate(temp2);
			while(temp2!=null)
			{
				System.out.println(temp2.data);
			temp2 = temp2.next;
			}
			

		}
	}