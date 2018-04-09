package hackerearth.algorithms.dynamicprogram2d;

import java.util.Arrays;
import java.util.Scanner;

public class Bino_Sum_for_set {
	static long cache[][]=new long[1001][1001];
	public static void main(String[] args) {
		for(int i=0;i<cache.length;i++){
			Arrays.fill(cache[i], -1);
		}
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			int n=sc.nextInt(); int k=sc.nextInt();long sum=0l;
			while(k>=0){
				sum=sum%1000000007+getCombination(n,k)%1000000007;
				k--;
			}
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
			return cache[n][r]=getCombination(n-1, r)%1000000007+getCombination(n-1, r-1)%1000000007;
	}

}
