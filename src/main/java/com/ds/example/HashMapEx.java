package com.ds.example;
import java.util.HashMap;
import java.util.Map;

// finding frequency of a number in a array.
public class HashMapEx {

	public static void main(String[] args) {
		int arr[] = { 2,2,3,3,5,6,6};
		
		HashMap<Integer, Integer > hm = new HashMap<Integer, Integer>();
		
		for ( int i=0; i < arr.length;i++)
		{
			Integer c = hm.get(arr[i]);
			System.out.println(c);
		    if (c==null)
		    {
		    	hm.put(arr[i],1);
		    }
		    else
		    {
		    hm.put(arr[i], ++c)	;
		    }
		}
		
		for ( Map.Entry m : hm.entrySet())
		{
			System.out.println("Frequency of " + m.getKey() + 
                    " is " + m.getValue());
		}
		
	}
	
	
}

