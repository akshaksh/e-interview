package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class ShubhamXor {

	//Below will work but will take time
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		long n=sc.nextLong(); 
		Map<Long,Long> treemap=new TreeMap<Long,Long>(); long t=0l;
		for(int i=0;i<n;i++){
			long value=sc.nextLong();
			if(treemap.containsKey(value))
				treemap.put(value, treemap.get(value)+1l);
			else
				treemap.put(value, 1l);			
		}
		Set<Entry<Long, Long>> keyset=treemap.entrySet();
		Iterator<Entry<Long, Long>> iterator=keyset.iterator(); long count=0l;
		while(iterator.hasNext()){
			Map.Entry<Long, Long> pair=iterator.next();
			long key=pair.getKey();
			long value=pair.getValue();
			if(value>1){
			value=value-1;
			count+=(value*(value+1))/2;
			}
		}
		System.out.println(count);
		sc.close();
	}

}



/*public static void main(String[] args) throws FileNotFoundException {
	Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	long n=sc.nextLong(); long arr[]=new long[(int)n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextLong();
	}
	Arrays.sort(arr); long d=0l; long count =0l;
	for(int i=0;i<n-1;i++){
			if(arr[i] == arr[i+1])
				d++;
			else{
				count=count+((d*(d+1))/2);
				d=0l;}
	}
	System.out.println(count);
	sc.close();
}*/