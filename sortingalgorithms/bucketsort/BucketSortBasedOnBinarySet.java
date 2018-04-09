package bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BucketSortBasedOnBinarySet {
	static int totalcount=0; 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int [] data= new int[n]; int max=0;
		Map<Integer,List<Integer>> mp=new TreeMap<>();
		for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
		}
		for(int ar:data)
			if(max<ar)max=ar;
		getNumberOfSetBits(max);
		int maxdigit=totalcount;
		for(int ar:data){
			int value=getNumberOfSetBits(ar);
			if(mp.containsKey(value))
				mp.get(value).add(ar);
			else
				{
					List<Integer>al=new ArrayList<Integer>();al.add(ar);
					mp.put(value,al);
				}
		}
		for(int i=0;i<maxdigit;i++){
			if(mp.containsKey(i)){
				Object[] arr=mp.get(i).toArray();
				Arrays.sort(arr);
				for(Object ar:arr)
					System.out.print(ar+" ");
				System.out.println();
			}
		}
		sc.close();
	}
	public static int getNumberOfSetBits(int num){
		int counter=0;
		while(num>0){
			totalcount++;
			if(num%2 ==1)
				counter++;
			num=num/2;
		}
		return counter;
	}

}
