package hackerearth.sortingalgorithms.quicksortprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); long arr1[]=new long[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextLong();
		int m=sc.nextInt(); long arr2[]=new long[m];
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextLong();
		Arrays.sort(arr1);Arrays.sort(arr2);
		long num=arr2[arr2.length-1]; long steps=0;
		for(int i=0;i<n;i++){
			if(arr1[i]<=num){
				steps+=(num-arr1[i]+1);
			}
			else{
				break;
			}
		}
		System.out.println(steps);
		sc.close();

	}

}
