package com.ds.example;

 class HeapSort {

	int[] a = new int[10];
	int size = 0;// create heap with size 10
	int temp , max;
	public void heapify(int siz)
	{
		
		for ( int i = 0 ; i <=siz  ;i ++)
		{
			
			if ( a[siz] > a[(siz-1)/2]){
				temp = a[(siz-1)/2];
				a[(siz-1)/2] = a[siz];
				a[siz] = temp;
			}
			
			siz = (siz-1)/2;
		}
		
	}
	
	
	public void insert(int value)
	{
     
		
			a[size++] = value;
		//	size++;
			heapify(size-1);
		
	}
	
	public void delete()
	{
		
	}
	
	public void CreateHeap()
	{
		
		insert(5);
		insert(2);
		insert(1);
		insert(4);
		insert(10);
		insert(12);
		insert(3);
	}
	
   public void printArr()
   {
	   for ( int i:a)
	   {
		   System.out.print(":"+i);
	   }
   }
	
}


public class HeapSortExample
{
	public static void main(String[] args) {
		 
		HeapSort hs = new HeapSort();
		hs.CreateHeap();
		hs.printArr();
		
	}
}
