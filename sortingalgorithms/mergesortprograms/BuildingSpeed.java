package hackerearth.sortingalgorithms.mergesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildingSpeed {
	static int arr[]=null;
	static int tempMergArr[]=null;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); arr=new int[2*n]; tempMergArr=new int[arr.length];
		for(int i=0;i<2*n;i++){
			arr[i]=sc.nextInt();
		}
		new BuildingSpeed().mergesort(0, arr.length-1);
		long sum=0l;
		for(int i=0;i<2*n;i=i+2){
			sum+=arr[i];
		}
		System.out.println(sum);
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
				if(tempMergArr[i]<=tempMergArr[j]){
					arr[t]=tempMergArr[i];
					i++;
				}
				else{
					arr[t]=tempMergArr[j];
					j++;
				}
				t++;
			}
			while (i <= mid) {
	            arr[t] = tempMergArr[i];
	            t++;
	            i++;
	        }
			while (j <= end) {
	            arr[t] = tempMergArr[j];
	            t++;
	            j++;
	        }
	}

}
/*public static void main(String[] args) throws FileNotFoundException {
	Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	int n=sc.nextInt(); int arr[]=new int[2*n];
	for(int i=0;i<2*n;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr); long sum=0l;
	for(int i=0;i<2*n;i=i+2){
		sum+=Math.min(arr[i], arr[i+1]);
	}
	System.out.println(sum);
	sc.close();

}*/