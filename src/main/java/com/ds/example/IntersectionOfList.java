package com.ds.example;
import java.util.HashSet;




public class IntersectionOfList {
	
	Node n1,n2,n3,n4,n5,n6,n7 ,n8,n9,head ,n10,n11,L1,L2;
	public void GenerateList1() {
		 
		 n1 = new Node(1,null);
		 n2 = new Node(2,null);
		 n3 = new Node(3,null);
		 n4 = new Node(4,null);
		 n5 = new Node(5,null);
		 n6 = new Node(6,null);
		 n7 = new Node(7,null);
		 n8 = new Node(8,null);
		 n9 = new Node(9,null);
		 n10 = new Node(10,null);
		 n11 = new Node(11,null);
		 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next =n6;
		n6.next = null;
		n7.next = n8;
		n8.next =n9;
		n9.next = n10;
		n10.next=n11;
		n11.next =n4;    
	    
      L1 = n1;
      L2 = n7;
      
	}
	
	
	public void findIntersection()
	{
		HashSet<Integer>  hs = new HashSet<Integer>();;
		while (L1 !=null)
		{
			
			hs.add( L1.data);
			L1 = L1.next;
			
		}
		
		while ( L2!=null)
		{
			if (hs.contains(L2.data))
			{
				System.out.println(" interstion point is at "+ L2.data);
				return ;
			}
			
			L2 = L2.next;
			
		}
		
		System.out.println("non intersestion ");
	}

	public static void main(String[] args) {
		 
		IntersectionOfList il = new IntersectionOfList();
		il.GenerateList1();
		il.findIntersection();
	}
}
