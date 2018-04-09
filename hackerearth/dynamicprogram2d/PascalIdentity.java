package hackerearth.algorithms.dynamicprogram2d;

import java.util.Arrays;


public class PascalIdentity {
	static long cache[][]=new long[1000][1000];
	public static void main(String[] args) {
		for(int i=0;i<cache.length;i++){
			Arrays.fill(cache[i], -1);
		}
		int a=181; int b=384;
		if(a>=b)
		System.out.println(getCombination(a, b));
		else
		System.out.println((a%1000000007)*(b%1000000007));
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
