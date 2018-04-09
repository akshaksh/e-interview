package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class BishuSoldiers {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.setOut(new PrintStream(new File("abc.txt")));
		int length=sc.nextInt();
		int testcase=0; int query[]=null;
		int array[]=new int [length];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		testcase=sc.nextInt();
		query=new int[testcase];
		for(int i=0;i<query.length;i++){
			query[i]=sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<query.length;i++){
			int sum=0;int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[j]<=query[i]){
					sum+=array[j];
					count++;
				}
				else{
					break;
				}
			}
			System.out.println(count+" "+sum);
		}
		sc.close();

	}
	/*public static void printpower(int array[],int value){
		int start=0; int end=array.length-1;int mid=0; int sum=0;
		while(start<=end){
			mid=(start+end)/2;
			if(array[mid]<value){
				start=mid+1;
			}
			else if(array[mid]>value){
				end=mid-1;
			}
			else{
				break;
			}
		}
		for(int i=0;i<=mid;i++){
			sum+=array[i];
		}
		System.out.println(mid+1+" "+sum);
	}*/

}
