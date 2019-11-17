package com.ds.example;

 class HeapSortTwo {

	int[] a = new int[10];
	int size = 0;// create heap with size 10
	int temp , max;
	
	public void heapify(int arr[], int n, int i)
	{
	
	
		  
	}
	
	
	public void insert(int value)
	{
            a[size++] = value;
    
    		int current = size-1;

    		while (a[current] > a[current/2]) {
    			  temp =a[current];
		    		 a[current]= a[current/2];
		    		 a[current/2] = temp;
		  
		   
    			current = current/2;
    		}
		
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
		insert(24);
	}
	
   public void printArr()
   {
	   for ( int i:a)
	   {
		   System.out.print(":"+i);
	   }
   }


public void maxHeap() {
	for (int pos = (size / 2); pos >= 1; pos--) {
		maxHeapify(pos-1);
	}
	
}


private void maxHeapify(int pos) {
	
	if (!((pos >= (size / 2)) && (pos <= size))) // check if its leaf node  
	{
		if (a[pos] < a[pos*2] || a[pos] < a[pos*2+1]) {
			if (a[pos*2] > a[pos*2+1]) {
					int tmp = a[pos];
					a[pos] = a[pos*2];
					a[pos*2] = tmp;
				}
				maxHeapify(pos*2);
			} else {
				int tmp = a[pos];
				a[pos] = a[pos*2+1];
				a[pos*2+1] = tmp;
				maxHeapify(pos*2+1);
			}
		}
	}
	
}


public class HeapSortExampleTwo
{
	public static void main(String[] args) {
		 
		HeapSortTwo hs = new HeapSortTwo();
		hs.CreateHeap();
		hs.printArr();
		hs.maxHeap();
		hs.printArr();
		
	}
}
