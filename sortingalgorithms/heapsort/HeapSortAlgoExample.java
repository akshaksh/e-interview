package heapsort;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class HeapSortAlgoExample {

    
    private static int N;
    /* Sort Function */
    public static int[] sort(int arr[])
    {       
        heapify(arr);
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
        return arr;
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
        if (left <= N && arr[left] < arr[i])
            max = left;
        if (right <= N && arr[right] < arr[max])        
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
    public static void main(String[] args)throws Exception
    {
    	System.out.println(System.currentTimeMillis());
    	StringBuilder string=new StringBuilder("");
        //Scanner sc=new Scanner(System.in);
    	Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));int myarr[]=null;
        int testcases=sc.nextInt(); int arr[]=new int[testcases];
        for(int i=0;i<testcases;i++){
        	arr[i]=sc.nextInt();
        }
        System.out.println(-1);System.out.println(-1);
        for(int i=2;i<testcases;i++){
        	if(myarr == null)
        		{
        			myarr=sort(Arrays.copyOfRange(arr, 0, i+1));
        			string.append(myarr[0]+" "+myarr[1]+" "+myarr[2]+"\n");
        		}
        	else{
        			int temp=0;
        			if(myarr[2]<arr[i]){
        				myarr[2]=arr[i];
        				if(myarr[1]<myarr[2]){
        					temp=myarr[2];
        					myarr[2]=myarr[1];
        					myarr[1]=temp;
        					if(myarr[1]>myarr[0]){
        						temp=myarr[0];
            					myarr[0]=myarr[1];
            					myarr[1]=temp;
        					}
        				}
        			}
        			string.append(myarr[0]+" "+myarr[1]+" "+myarr[2]+"\n");
        	}
       		
        }
        System.out.println(string);
        System.out.println(System.currentTimeMillis());
        sc.close();
    }  

}
