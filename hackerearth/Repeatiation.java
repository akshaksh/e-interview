package hackerearth.algorithms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Repeatiation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		int k=0;
		int number=0;
		Map<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<testcase;i++){
			number=sc.nextInt();
			if(map.containsKey(number)){
				map.put(number, map.get(number)+1);
			}
			else{
				map.put(number, 1);
			}
		}
		k=sc.nextInt();
		 Object keys[]= map.keySet().toArray();
		 for(Object key:keys){
			 if(map.get(key) == k)
				 {System.out.println(key); break;}
		 }
		
		

	}

}
