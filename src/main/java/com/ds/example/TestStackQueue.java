package com.ds.example;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class TestStackQueue {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(4);
		stack.push(56);
		//System.out.println(stack.pop());
		///System.out.println(stack.pop());
		System.out.println(stack.search(56)); // return -1 if element is not there
		System.out.println(stack.search(4));
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(3);
		q.add(4);
		q.add(6);
		
		System.out.println(q.poll());
		
	}

}
