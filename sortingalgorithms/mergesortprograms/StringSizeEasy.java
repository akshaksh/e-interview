package hackerearth.sortingalgorithms.mergesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringSizeEasy {
	static String tempMergArr[]=null;
	static String arr[]=null;
	public static void main(String strs[]) throws FileNotFoundException{
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); String stringlist[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
			stringlist[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			String splits[]=stringlist[i].split(" ");
			arr=splits;
			tempMergArr=new String[splits.length];
			mergesort(0,splits.length-1);
			System.out.print(" ");
			for(String strd:arr)
				System.out.print(strd+" ");
			System.out.println();
		}
		sc.close();
	}
	public static void mergesort(int start,int end){
		if(start<end){
			int mid=start+(end-start)/2;
			mergesort(start,mid);
			mergesort(mid+1,end);
			merging(start,mid,end);
		}
	}
	public static void merging(int start,int mid, int end){
		int i=start; int j=mid+1;
		int t=start;
		for (int k = start; k <= end; k++) {
            tempMergArr[k] = arr[k];
        }
		while(i<=mid && j<=end){
			if(tempMergArr[i].length()<=tempMergArr[j].length()){ //Equals is required as for the same size we have to maintain the order 
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
		//System.out.println("Hello");
}
	
}
