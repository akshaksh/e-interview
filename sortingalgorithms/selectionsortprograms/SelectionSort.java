package hackerearth.sortingalgorithms.selectionsortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); int step=sc.nextInt();int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int minimum=0;
		for(int i=0;i<n-1;i++){
			minimum=i;
			for(int j=i+1;j<n;j++){
				if(arr[minimum]>arr[j])
					minimum=j;
			}
			int temp=arr[i];
			arr[i]=arr[minimum];
			arr[minimum]=temp;
			step--;
			if(step ==0)
				break;
		}
		for(int ar:arr)
			System.out.print(ar+" ");
		sc.close();
	}

}
