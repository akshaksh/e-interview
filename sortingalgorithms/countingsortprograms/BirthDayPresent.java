package hackerearth.sortingalgorithms.countingsortprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BirthDayPresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();Long arr[]=new Long[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		long count=0l;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
