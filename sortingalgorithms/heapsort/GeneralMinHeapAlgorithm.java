package heapsort;

public class GeneralMinHeapAlgorithm {
	static int n;
	public static void main(String[] args) {
		int arr[]={5,3,17,10,7,19,6,22,9};
		 System.out.println("\nElements Before heapify ");        
	        for (int i = 0; i <arr.length; i++)
	            System.out.print(arr[i]+" ");
	        minheapify(arr);
	        System.out.println("\nElements After heapify ");        
	        for (int i = 0; i <arr.length; i++)
	            System.out.print(arr[i]+" ");
	}
	public static void minheapify(int arr[]){
		n = arr.length-1;
        for (int i = n/2; i >= 0; i--)
            minheap(arr, i);   
        /*See If elements are even then number of leaf will be size/2 and if odd then siz/2+1 so as per this index will always be greater
        than equals to size/2 for the leaf.*/
	}
	public static void minheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int min = i;
        if (left <= n && arr[left] < arr[i])
            min = left;
        if (right <= n && arr[right] < arr[min])        
        	min = right;
 
        if (min != i)
        {
            swap(arr, i, min);
            minheap(arr, min);
        }
    }
	public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    

}
