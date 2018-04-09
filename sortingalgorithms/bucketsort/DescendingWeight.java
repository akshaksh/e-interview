package bucketsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DescendingWeight {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt();int k=sc.nextInt();int arr[]=new int[n];
		Map<Integer,String> mp=new TreeMap<Integer, String>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(int ar:arr){
			int value=ar%k;
			if(mp.containsKey(value))
				mp.put(value, mp.get(value)+ar+" ");
			else
				mp.put(value, ar+" ");
		}
		String message=mp.values().toString();
		message=message.substring(1);
		message=message.substring(0,message.length()-1);
		message=message.replace(", ", "");
		System.out.println(message);
		
		sc.close();
	}

}
