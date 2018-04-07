package dp;

import java.util.Arrays;

public class Fibbonacci {
	//Through Memoization as we can see no need to evaluate again in DP but still it has O(n) for both time and space  
/*	static int fib[]=null;
	public static void main(String[] args) {
		int n=5;
		fib=new int[n+1];
		Arrays.fill(fib, -1);
		fib[0]=0;fib[1]=1;
		fibonacci(n);
		for(int ar:fib)
			System.out.print(ar+" ");
	}
	public static int fibonacci(int n){
		if(n==0 || n==1)
			return fib[n];
		if(fib[n]!=-1)
			return fib[n];
		return fib[n]=fibonacci(n-1)+fibonacci(n-2);
	}
*/	
	
	// here complexity will reduce for space from O(n) to O(1) but time will remain same
	public static void main(String[] args) {
		int n=5; int a=0;int b=1; int sum=0;
		for(int i=0;i<n;i++){
			System.out.print(sum+" ");
			sum=a+b;
			a=b; //As we are adding only in last one
			b=sum;
		}
	}
}
