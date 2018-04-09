package hackerearth.algorithms.greedyalgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HungerGame {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n=Integer.parseInt(br.readLine());
		int n=sc.nextInt();
		Integer arr[]=new Integer[n]; int b[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());int start=0;int end=n-1;int i=0;
		while(start<end){
			if(i<n)
			b[start++]=arr[i++];
			if(i<n)
			b[end--]=arr[i++];
		}
		int max=-1;
		for(i=0;i<n-1;i++){
			int diff=Math.abs(b[i]-b[i+1]);
			if(max<diff)
				max=diff;
		}
		System.out.println(max);
		sc.close();

	}

}
