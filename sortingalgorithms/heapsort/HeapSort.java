package heapsort;


/* Class HeapSort */
public class HeapSort 
{    
    private static int N;
    /* Sort Function */
    public static void sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
    /* Main method */
    public static void main(String[] args) 
    {
    	int i;    
        int arr[] = {802,327,219,415,648,783,250,891,232,822,604,123,138,505,883,224,86,681,51,310};
        System.out.println("\nElements Before sorting ");        
        for (i = 0; i <arr.length; i++)
            System.out.print(arr[i]+" ");
        sort(arr);
        System.out.println("\nElements after sorting ");        
        for (i = 0; i <arr.length; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}
