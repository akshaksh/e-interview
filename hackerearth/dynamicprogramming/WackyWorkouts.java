package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WackyWorkouts {
	static long MOD = 1000000007;
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt(); long values[]=new long[testcase];
		for(int i=0;i<testcase;i++){
			values[i]=sc.nextLong();
		}
		for(int i=0;i<values.length;i++){
			if(values[i]>1)
			{
				long finalvalue[][]=ans(new long[][]{{1,1},{1,0}},new long[][]{{1,1},{1,0}},values[i]+1);
				System.out.println(finalvalue[0][0]);
			}
			else if(values[i]==1){
				System.out.println(2);
			}
			else {
				System.out.println(1);
			}
		}
		sc.close();
	}
	public static long[][]ans(long f[][],long m[][],long n){
			if(n==1)
				return f;
			else{
				f=ans(f,m,n/2);
				f=calc(f,f);
				if(n%2==1)
					f=calc(f,m);
				return f;
			}
	}
	public static long[][] calc(long f[][],long m[][]){
		long x=(((f[0][0]%MOD)*(m[0][0]%MOD))%MOD+((f[0][1]%MOD)*(m[1][0]%MOD)%MOD))%MOD;
    	long y=(((f[0][0]%MOD)*(m[0][1]%MOD))%MOD+((f[0][1]%MOD)*(m[1][1]%MOD)%MOD))%MOD;
    	long p=(((f[1][0]%MOD)*(m[0][0]%MOD))%MOD+((f[1][1]%MOD)*(m[1][0]%MOD)%MOD))%MOD;
    	long q=(((f[1][0]%MOD)*(m[0][1]%MOD))%MOD+((f[1][1]%MOD)*(m[1][1]%MOD)%MOD))%MOD;
    	
    	f[0][0]=x;
    	f[0][1]=y;
    	f[1][0]=p;
    	f[1][1]=q;
    	return f;
	}
	
}



/*This will work but not for longer inputs
for(int i=0;i<values.length;i++){
	long M[][]={{1,1},{1,0}};long A[][]={{1,1},{1,0}};
	long value=values[i];
	if(value<1){
		System.out.println(1);
	}
	else if(value == 1){
		System.out.println(2);
	}
	else{
		for(int j=0;j<value;j++){
			long w=A[0][0]*M[0][0]+A[0][1]*M[1][0];
			long x=A[0][0]*M[0][1]+A[0][1]*M[1][1];
			long y=A[1][0]*M[0][0]+A[1][1]*M[1][0];
			long z=A[1][0]*M[0][1]+A[1][1]*M[1][1];
			A[0][0]=w%1000000007;A[0][1]=x%1000000007;A[1][0]=y%1000000007;A[1][1]=z%1000000007;
		}
		System.out.println(A[0][0]);
	}
}*/






/*Without Cache
public class WackyWorkouts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			int value=sc.nextInt();
			if(value<1){
				System.out.println(1);
			}
			else{
				long arr[]=new long[value+2];arr[0]=1l;arr[1]=1l;
				for(int j=2;j<=value+1;j++){
					arr[j]=(arr[j-1]+arr[j-2])%1000000007;
				}
				System.out.println(arr[value+1]);
				
			}
		}
		sc.close();

	}

}
*/