package dp;

import java.util.Arrays;

public class Factorial {
	static int fact[]=null;
	public static void main(String[] args) {
		int n=5;
		fact=new int[n+1];
		Arrays.fill(fact, -1);
		fact[0]=1;
		System.out.println(factorial(n));
	}
	public static int factorial(int n){
		if(n==1)
			return 1;
		if(fact[n] != -1)
			return fact[n];
		else
			return fact[n]=n*factorial(n-1);
	}

}
