package hackerearth.sortingalgorithms.quicksortprograms;

import java.util.Scanner;

public class Sortthisway {
	private long array[];
	private int length;
	public static void main(String[] args) {
		Sortthisway sorter=new Sortthisway();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long input[]=new long[n]; 
		for(int i=0;i<n;i++){
			input[i]=sc.nextLong();
			
		}
		sorter.sort(input);
		for(long ar:input)
			{
				System.out.print(ar+" ");
			}
		sc.close();
	}
	public void sort(long arr[]){
		if(arr == null || arr.length ==0)
			return;
		this.array=arr;
		length=arr.length;
		quicksort(0,length-1);
	}
	public void quicksort(int start,int end){
		int i=start; int j=end; long pivot=array[start+(end-start)/2];
		while(i<=j){
			while(Math.abs(array[i])<Math.abs(pivot))
				i++;
			while(Math.abs(array[j])>Math.abs(pivot))
				j--;
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		if(start<j)
			quicksort(start,j);
		if(i<end)
			quicksort(i,end);
		
	}
	public void exchange(int i,int j){
		long temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
