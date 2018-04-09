package hackerearth.algorithms.greedyalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class K_Friends {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcases=sc.nextInt();
		for(int i=0;i<testcases;i++){
			int n=sc.nextInt(); int arr[]=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
			}
			int k=sc.nextInt();
			Arrays.sort(arr);
			printNumberOfGifts(arr,k);
		}
		sc.close();

	}
	
	static void printNumberOfGifts(int arr[],int k){
		int length=arr.length; long sum=0l;
		if(length == 2)
			System.out.println(arr[0]*2);
		else{
			int i=0;
			for(;i<k-1;i++)
				sum+=arr[i];
			sum+=(arr[i]*(length-k+1));
			System.out.println(sum);
		}
	}

}
