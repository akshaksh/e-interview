package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HousesInCities {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc=new Scanner(System.in);
		long starttime=System.currentTimeMillis();
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		for(int t=0;t<testcase;t++){
			int n=sc.nextInt(); long arr[]=new long[n]; long sum=0l;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextLong();
				sum+=arr[i];
			}
			int q=sc.nextInt();
			for(int i=0;i<q;i++){
				int start=sc.nextInt(); int end=sc.nextInt(); long totalsum=0l;
				start--;end--;
				//totalsum=getsum(arr, start-1, end-1);
				 for(;start<=end;){
					if(start==end)
						totalsum=(totalsum%1000000007+arr[end]%1000000007);
					else
					totalsum=(totalsum%1000000007+arr[start]%1000000007+arr[end]%1000000007);
					start++;
					end--;
				}
				System.out.println(totalsum);
			}
		}
		long endtime=System.currentTimeMillis();
		System.out.println("Time:"+(endtime-starttime));
		sc.close();

	}
	/*public static long getsum(long arr[],int start,int end){ //this is one way to solve
		if(start>end)
			return 0l;
		else if(start==end){
			return arr[start];
		}
		else{
			return (arr[start]+arr[end]+getsum(arr,start+1,end-1))%1000000007;

		}
	}*/

}
