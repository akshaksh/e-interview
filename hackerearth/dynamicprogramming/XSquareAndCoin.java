package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XSquareAndCoin {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			int n=sc.nextInt(); long k=sc.nextLong(); long arr[]=new long[n];long previoussum=0; long sum=0;
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
			}
			for(int j=0;j<n;j++){
				sum=0;
				if(arr[j]<=k){
					while(arr[j]<=k){
						sum=(sum+arr[j]);
						j++;
						if(j>arr.length-1)
							break;
						
					}
				}
				if(sum>previoussum)
					previoussum=sum;
			}
			System.out.println(previoussum);
		}
		sc.close();
	}
	public long getValue(long arr[],int n,int k){
		long previoussum=0; long sum=0;
		if(arr.length-1 < 1){
			return 0;
		}
		else{
			for(int i=0;i<n;i++){
				sum=0;
				if(arr[i]<=k){
					while(arr[i]<=k){
						sum=(sum+arr[i]);
						i++;
						if(i>arr.length-1)
							break;
						
					}
				}
				if(sum>previoussum)
					previoussum=sum;
			}
		}
		return 0;
	}

}
