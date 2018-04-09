package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class EasyGoing {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt(); int arr[]=null;
		for(int i=0;i<testcase;i++){
			int n=sc.nextInt(); int m=sc.nextInt();
			arr=new int[n];
			for(int c=0;c<n;c++){
				arr[c]=sc.nextInt();
			}
			Arrays.sort(arr);
			int sum=0;
			for(int j=0;j<n-m;j++){
				sum+=arr[n-j-1]-arr[j];
			}
			System.out.println(Math.abs(sum));
		}
		sc.close();
	}

}
