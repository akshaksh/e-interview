package hackerearth.algorithms.dynamicprogram2d;

import java.util.Arrays;
import java.util.Scanner;

public class NumberTheory {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); int myarr[]=new int[n];
		for(int i=0;i<n;i++){
			myarr[i]=sc.nextInt();
		}
		Arrays.sort(myarr);
		int counter=0; int max=0; int a=0,b=0;
		for(int i=0;i<n-1;i++){ //Problem is here sequence will be a,b,c,d and abcefg,abcdhijk and so on
			for(int k=i+1;k<n;k++){
			counter=0;int j=k; b=myarr[j];a=myarr[i];
			while(j<n){
				if(b%a == 0)
				{   counter++;
					a=b;
				}
				j++;
				if(j>=n)
				break;
				b=myarr[j];
			}
				if(max<counter)
					max=counter;
			}
		}
		if(max == 0)
		System.out.println(-1);
		else
			System.out.println(max+1);
		sc.close();

	}
}
