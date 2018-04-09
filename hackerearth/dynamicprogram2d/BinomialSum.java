package hackerearth.algorithms.dynamicprogram2d;

import java.util.Arrays;
import java.util.Scanner;

public class BinomialSum {
	static long cache[][]=new long[1000][1000];
	 public static void main(String[] args) {
		 for(int i=0;i<cache.length;i++){
				Arrays.fill(cache[i], -1);
			}
		Scanner sc=new Scanner(System.in);
		int queries=sc.nextInt(); int arr[]=new int[4];
		for(int i=0;i<queries;i++){
			for(int j=0;j<4;j++){
				arr[j]=sc.nextInt();
			}
			long res1=0l; long res2=0l; long res3=0l; long res4=0l; long sum=0l;
			if(arr[0]>=arr[2])
				res1=getCombination(arr[0], arr[2]);
			else
				res1=(arr[0]*arr[2]);
			if(arr[0]>=arr[3])
				res2=getCombination(arr[0], arr[3]);
			else
				res2=(arr[0]*arr[3]);
			
			if(arr[1]>=arr[2])
				res3=getCombination(arr[1], arr[2]);
			else
				res3=(arr[1]*arr[2]);
			if(arr[1]>=arr[3])
				res4=getCombination(arr[1], arr[3]);
			else
				res4=(arr[1]*arr[3]);
			sum=((res1 *res2)+(res3*res4));
			System.out.println(sum%1000000007);
				
		}
		sc.close();
	}
	 public static long getCombination(int n,int r){
			long sum=0l;
			if(n==r)
				return 1;
			else if(n<r || n<0 || r<0)
				return 0;
			else if(n<2)
				return 1;
			else if(cache[n][r] != -1)
				return cache[n][r];
			else
				return cache[n][r]=(getCombination(n-1, r)+getCombination(n-1, r-1))%1000000007;
		}
}
