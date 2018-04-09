package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeFound {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		long n=sc.nextLong(); long m=sc.nextLong();
		long arr[]=new long[(int) n]; long max=0l;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
			if(max<arr[i])
				max=arr[i];
		}
		long lb=max; long ub=100000000000000000l;long mid=0l; long value=0l;
		while(lb<=ub){
			mid=(lb+ub)/2;
			if(isAbleToSolve(mid, arr, m)){
				value=mid;
				ub=mid-1;
			}
			else{
				lb=mid+1;
			}
		}
		System.out.println(value);
	}
public static boolean isAbleToSolve(long time,long arr[],long m){
	long sum=0; int days=1;
	for(int i=0;i<arr.length;i++){
		if((sum+arr[i])>time){
			days++;
			sum=arr[i];
		}
		else{
			sum+=arr[i];
		}
	}
	if(days<=m)
		return true;
	else
		return false;
}
}
/*
 * To solve above problem we will use binary algorithm and approch will be like lower bound will be max value in the array and upper bound and we will try 
 * to find mid in such a way that if problem is solving then will move upper bound else lower bound until lower bound is smaller than upper bound and will get our answer as mid.
 */