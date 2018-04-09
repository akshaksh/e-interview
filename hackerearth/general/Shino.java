package hackereath;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Shino {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt();
		int q=sc.nextInt();
		int j=0;
		ArrayList<Long> al=new ArrayList<>();
		ArrayList<Long> indexes=new ArrayList<>();
		Map<Long,Long> fightcount=new HashMap<>();
		ArrayList<Long> query=new ArrayList<Long>();
		for(int i=0;i<n;i++){
			long number=sc.nextLong();
			al.add(number);
			if(!fightcount.containsKey(number))
		    fightcount.put(number,0L);
		}
		for(int i=0;i<q;i++){
			query.add(sc.nextLong());
		}
		if(n%2 != 0)
			n=(n/2)+1;
		else
			n=n/2;
		for(int i=0;i<n;i++){
			for(int k=0;k<al.size();k=k+2){
				
				if(((k+1)<al.size()) && (al.get(k+1)>al.get(k))){
					fightcount.put(al.get(k), fightcount.get(al.get(k))+1);
					fightcount.put(al.get(k+1), fightcount.get(al.get(k+1))+1);
					indexes.add(al.get(k));
				}
				else if(((k+1)<al.size()) && (al.get(k+1)<al.get(k))){
					fightcount.put(al.get(k), fightcount.get(al.get(k))+1);
					fightcount.put(al.get(k+1), fightcount.get(al.get(k+1))+1);
					indexes.add(al.get(k+1));
				}
			}
			if(indexes.size()>0){
				Iterator<Long> it=indexes.iterator();
				while(it.hasNext()){
					al.remove(it.next());
				}
				indexes.clear();
			}
			else{
				break;
			}
		}
		sc.close();
		Iterator<Long> iterator = query.iterator();
		while(iterator.hasNext()){
			long value=0;
			long key=iterator.next();
			if(fightcount.containsKey(key))
			value=fightcount.get(key);
			System.out.println(value);
		}
	}

}
