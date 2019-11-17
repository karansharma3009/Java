package com.ds.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetExample {

	
	public static void main(String[] args) {
		 
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,2,3,5,6,8}));
		set2.addAll(Arrays.asList(new Integer[]{1,2,4,0,6,10}));
		
		Set<Integer> union = new HashSet<Integer>(set1);
		
		union.addAll(set2);
		
		System.out.println("union "+ union);
		
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("intersection "+ intersection);
		
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("difference "+ difference);
	}
}
