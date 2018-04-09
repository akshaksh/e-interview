package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pokeball {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		Map<Character,Integer> mp=new TreeMap<Character, Integer>();
		int value=0;
		for(int i=0;i<testcase;i++){
			int n=sc.nextInt();int k=sc.nextInt();
			sc.nextLine();
			String str=sc.nextLine();
			for(int j=0;j<str.length();j++){
				if(mp.containsKey(str.charAt(j))){
					mp.put(str.charAt(j), mp.get(str.charAt(j))+1);
				}
				else{
					mp.put(str.charAt(j), 1);
				}
				if(value<mp.get(str.charAt(j))){
					value=mp.get(str.charAt(j));
				}
			}
			if((n-value)<=k){
				System.out.println(n);
			}
			else{
				System.out.println(value+k);
			}
			mp.clear();
			value=0;
		}
		sc.close();
		

	}

}
//Not sure what problem is exactly asking
