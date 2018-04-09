package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeProblemSolving {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); Object[] arr=generateAllPrimeNumbers(n).toArray(); int myarr[]=new int[n];
		long sum=0l; int t=0;
		for(int i=0;i<n;i++){
			myarr[i]=sc.nextInt();
		}
		for(int i=0;i<n;){
			if(t<=myarr.length-1){
			int value=myarr[t];
			for(int j=i;j<value+i;j++){
				sum+=(long)arr[j];
			}
			
			if(t<=myarr.length-1)
			{	i=i+value;
				for(;i<myarr[t+1]-1;i++){}
				t++;
			}
			
			}
			
			else{
				break;
			}
		}
		sc.close();
	}
	
	public static List<Integer> generateAllPrimeNumbers(int num){
		List<Integer> al=new ArrayList<Integer>();
		boolean flag=false;
		for(int i=3;i<=num;i++)
		{
			flag=false;
			for (int j = 2; j <= i / 2; j++) 
			{
					if (i % j == 0) 
					{
						flag=true;
						break;
					}
					if(!flag)
					{
						al.add(i);
					}
			}
		}
		return al;
	}

}
