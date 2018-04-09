package hackerearth.sortingalgorithms.selectionsortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class OldKeyPad {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); 
		int arr[]=new int[n]; int total=0;
		Map<Integer,Integer> mp=new TreeMap<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int keysize=sc.nextInt(); 
		for(int i=0;i<keysize;i++){
			int value=sc.nextInt();
			total+=value;
			for(int j=1;j<=value;j++){
				if(mp.containsKey(j))
					mp.put(j, mp.get(j)+1);
				else
					mp.put(j, 1);
			}
		}
		int maximum=0;
		for(int i=0;i<n-1;i++){
			maximum=i;
			for(int j=i+1;j<n;j++){
				if(arr[maximum]<arr[j])
					maximum=j;
			}
			int temp=arr[i];
			arr[i]=arr[maximum];
			arr[maximum]=temp;
		}
		int t=0;
		Set<Entry<Integer, Integer>> set=mp.entrySet();
		Iterator<Entry<Integer, Integer>> it=set.iterator();
		long sum=0l;
		while(it.hasNext()){
			Map.Entry<Integer, Integer> me=it.next();
			int key=me.getKey();
			int value=me.getValue();
			for(int i=1;i<=value;i++){
				if(t<arr.length)
				sum+=key*arr[t++];
			}
		}
		if(n<=total)
		System.out.println(sum);
		else
			System.out.println(-1);
		sc.close();

	}

}
