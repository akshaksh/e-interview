package hackerearth.sortingalgorithms.insertionsortprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int arr[]=new int[n]; int unsortedarr[]=new int[n];
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		unsortedarr = Arrays.copyOfRange(arr, 0, arr.length);
		int i, key, j;
		   for (i = 1; i < n; i++)
		   {
		       key = arr[i];
		       j = i-1;
		      while (j >= 0 && arr[j] > key) //here we will shift all the left side elements from their adjacent left values till end 
		       {
		    	  
		           arr[j+1] = arr[j];
		           j = j-1;
		       }
		       arr[j+1] = key;
		   }
		  for(int l=0;l<n;l++){
			  mp.put(arr[l], l);
		   }
		 for(int k=0;k<n;k++){
			 	int value=mp.get(unsortedarr[k]);
			 	System.out.println(value+1);
		 }
		 sc.close();

	}

}
