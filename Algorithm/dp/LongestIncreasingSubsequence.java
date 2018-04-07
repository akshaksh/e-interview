package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60 };
		int list[]=new int[arr.length];
		String paths[]=new String[arr.length];
		for(int i=0;i<arr.length;i++)
			paths[i]=arr[i]+"";
		Arrays.fill(list, 1);
        int n = arr.length;
        for(int i=1;i<n;i++){
        	for(int j=0;j<i;j++){
        		if((arr[i]>arr[j])&&(list[i]<list[j]+1))
        			{
        				list[i]=list[j]+1;
        				paths[i]=paths[j]+","+arr[i];
        			}
        	}
        }
        System.out.println("Check the list");
        for(int ar:list)
        	System.out.print(ar+" ");
        System.out.println();
        for(String srr:paths)
        	System.out.println(srr);
        
        
	}

}
