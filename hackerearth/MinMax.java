package hackerearth.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int array[]=new int[length]; int sum=0;
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		Arrays.sort(array);
		System.out.println((sum-array[array.length-1])+" "+ (sum - (array[0])));
	}

}
