package com.ds.example;
import java.util.HashSet;


public class HashSetEx {

	public static void main(String[] args) {
		 HashSet<Integer> hs = new HashSet();
		 
		 hs.add(1);
		 System.out.println(hs.add(1));
		 System.out.println(hs.contains(2));
	}
}
