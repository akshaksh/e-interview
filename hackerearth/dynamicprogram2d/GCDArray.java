package hackerearth.algorithms.dynamicprogram2d;

import java.util.Scanner;

public class GCDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); int arr[]=new int[n]; int counter=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i] == 1)
				counter++;
		}
		long pow = (long) ((Math.pow(2,n) - 1)%1000000007);
		int val=n-counter;
		pow=pow-val;
		System.out.println(pow);
		sc.close();

	}

}
