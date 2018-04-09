package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoyAndRopes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			int n=sc.nextInt(); long ub[]=new long[n-1]; long lb[]=new long[n-1];
			for(int j=0;j<n-1;j++){
				ub[j]=sc.nextLong();
			}
			for(int j=0;j<n-1;j++){
				lb[j]=sc.nextLong();
			}
			long len=1; long result=n; long res;
			for(int j=0;j<n-1;j++){
				res=len+Math.max(ub[j], lb[j]);
				result=Math.max(result, res);
				len++;
			}
			System.out.println(result);
		}
		sc.close();

	}

}

               