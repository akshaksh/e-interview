package dp;

import java.util.Arrays;

public class NumberOfBst {
	static int counter=0;
	static int cache[]=null;
	public static void main(String[] args) {
		int n=10;
		cache=new int[n+1];
		Arrays.fill(cache, -1);
		cache[0]=1;
		System.out.println(getCatalanNumber(10));
		System.out.println(getCatalanNumberWithMemoization(10));
		System.out.println("counter "+counter);
	}
	public static int getCatalanNumber(int n){
		counter++;
		int count=0;
		if(n==0)
			return 1;
		for(int i=1;i<=n;i++){ //Less than n because we have taken n==0 and n==1
			count+=(getCatalanNumber(i-1)*getCatalanNumber(n-i));
		}
		return count;
	}
	public static int getCatalanNumberWithMemoization(int n){
		counter++;
		if(cache[n] !=-1)
			return cache[n];
		cache[n]=0;
		for(int i=1;i<=n;i++){
			cache[n]+=(getCatalanNumber(i-1)*getCatalanNumber(n-i));
		}
		return cache[n];
	}
}
