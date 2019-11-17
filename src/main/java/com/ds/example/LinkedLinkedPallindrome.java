package com.ds.example;
import org.testng.reporters.jq.Main;

/* Java program to check if linked list is palindrome recursively */
 
class LinkedList 
{
	Node left ;
	public void  pallindromeList(){
	
		Node n1 = new Node(1,null);
		Node n2 = new Node(2,null);
		Node n3 = new Node(3,null);
		Node n4 = new Node(4,null);
		Node n5 = new Node(5,null);
		Node n6 = new Node(4,null);
		Node n7 = new Node(3,null);
		Node n8 = new Node(2,null);
		Node n9 = new Node(1,null);
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
		
		boolean isP = isPallindrome(tmp);
		
		if(isP)
		{
			System.out.println("pallindrome hai bc ");
		}
		else
		{
			System.out.println("nahin hai pallindrome");
		}
	}

	private  boolean isPallindrome(Node head) {
		left = head;
	    boolean result = helper(head);
        return result;
	}
	
	public boolean helper(Node right){
		 
        //stop recursion
        if (right == null)
            return true;
 
        
        boolean x = helper(right.next);
        if (!x)
        return false;
        //current left and right
        boolean y = (left.data == right.data);
        //move left to next
        left = left.next;
        return y;
    }

}


public class LinkedLinkedPallindrome
{
	public static void main(String[] args) {
		LinkedList l  = new LinkedList();
		l.pallindromeList();
	}
}