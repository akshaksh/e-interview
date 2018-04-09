package hackerearth.sortingalgorithms.countingsortprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); int min=0; int arr1[]=new int[n];Map<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++){
			int value=sc.nextInt();
			arr1[i]=value;
			if(mp.containsKey(value))
				mp.put(value, mp.get(value)+1);
			else
				mp.put(value, 1);
			if(i==0)
				min=value;
			else{
					if(min<value)
						min=value;
			}

		}
		int arr2[]=new int[min+2];
		for(int i=0;i<arr2.length;i++){
			if(mp.containsKey(i))
				arr2[i]=mp.get(i);
			else
				arr2[i]=0;
		}
		int t=0;
		for(int i=arr2.length-1;i>=0;i--){
			for(int j=0;j<arr2[i];j++){
				arr1[t++]=i;
			}
			if(arr2[i] != 0)
				System.out.print(i+" "+arr2[i]+"\n");
		}
		
		sc.close();

	}

}
