package com.ds.example;

public class InsertionSort {
	
	public static void main(String[] args) {
		 
		int[] a = { 12,2,4,1,3,4,9};
		int temp;
		
		for ( int i =1 ; i<=a.length-1;i++)
		{
			temp = a[i];  //4 
			int hole = i;
			while (  hole > 0 &&  a[hole-1] > temp) // 
			{
				a[hole] = a[hole-1];  // a[2]=12;
				hole--;
			}
			
			a[hole] = temp;
		
		}

	 for ( int i :a )
	 {
		 System.out.println(i);
	 }
	}

}
