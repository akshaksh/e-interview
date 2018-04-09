package hackerearth.sortingalgorithms.mergesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PairCount {
	static long arr[]=null;
	static long tempMergArr[]=null;
	static long counter =0l;
	public static void main(String strs[]) throws FileNotFoundException{
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt();
		arr=new long[n];
		tempMergArr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
		}
		new PairCount().mergesort(0, arr.length-1);
		System.out.println(counter);
		sc.close();
	}
	public void mergesort(int start,int end){
		if(start<end){
			int mid=start+(end-start)/2;
			mergesort(start,mid);
			mergesort(mid+1,end);
			merging(start,mid,end);
		}
	}
	public void merging(int start,int mid, int end){
			int i=start; int j=mid+1;
			int t=start;
			for (int k = start; k <= end; k++) {
	            tempMergArr[k] = arr[k];
	        }
			while(i<=mid && j<=end){
				if(tempMergArr[i]>=tempMergArr[j]){
					//arr[t]=tempMergArr[i];
					counter++;
					i++;
				}
				else{
					//arr[t]=tempMergArr[j];
					j++;
				}
				//t++;
			}
			while (i <= mid) {
	            //arr[t] = tempMergArr[i];
	            if(tempMergArr[i]>tempMergArr[mid]){
	            	counter++;
	               }
	            t++;
	            i++;
	        }
			while (j <= end) {
	            //arr[t] = tempMergArr[j];
	            if(tempMergArr[j]>tempMergArr[mid]){
	            	counter++;
	               }
	            t++;
	            j++;

	        }
	}
	
}


/* This will work but not effiient
 * public static void main(String strs[]) throws FileNotFoundException{
	//Scanner sc=new Scanner(System.in);
	Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	int n=sc.nextInt();
	long arr[]=new long[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextLong();
	}
	long counter=0l;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]>arr[j])
				counter++;
		}
	}
	System.out.println(counter);
	sc.close();
}*/