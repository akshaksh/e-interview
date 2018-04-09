package hackerearth.algorithms.dynamicprogramming;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FactorialWithDynamic {
	static long cache[]=null;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		cache=new long[n+1];
		Arrays.fill(cache, -1);
		for(int i=0;i<n;i++){
			long fact=factorial(sc.nextInt());
			System.out.println(fact);
		}
		long end=System.currentTimeMillis();
		sc.close();
	}
	
	static long factorial(int n){
		if(n==0)
			return 1;
		else if(cache[n]!=-1){
			System.out.println("Check it");
			return cache[n];
		}
		else{
			return cache[n]=(n*factorial(n-1))%1000000007;
		}
	}

}
