package com.ds.example;

class QuickSort {

	int[] arr ={8,5,23,1,2,13,10,20};
	int start =0; int end;
	public void RunQuickSort(){
	start =0;
	end = arr.length-1;	
	 
	QuickSortRunner(arr,start,end);
		
	}
	

	
	public void QuickSortRunner(int[] arr, int start, int end) {
	
		if ( start< end )
		{
		int pindex = partition (arr,start,end);
		QuickSortRunner(arr,start,pindex-1);
		QuickSortRunner(arr,pindex+1,end);
		}
	}



	private int partition(int[] arr, int start, int end) {
		
		int i, j, pivot, temp;
		  pivot = arr[start];
		  i = start;
		  j = end;
		  while(true)
		  {
		   while(arr[i] < pivot && arr[i] != pivot)
		   i++;
		   while(arr[j] > pivot && arr[j] != pivot)
		   j--;
		   if(i < j)
		   {
		    temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		   }
		   else
		   {
		    return j; // pindex 
		   }
		  }
	}




	public void printArr()
	{
		for( int i: arr)
		System.out.print(i+":");
	}
}

class QuickSortSrama {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		qs.RunQuickSort();
		qs.printArr();

	}
}