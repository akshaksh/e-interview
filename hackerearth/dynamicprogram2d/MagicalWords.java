package hackerearth.algorithms.dynamicprogram2d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicalWords {
	private static Map<String,Long>mp=new HashMap<>();
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			String str=sc.next();
			long sum=str.length();
			int length=str.length();
			for(int j=2;j<=length;j++){
				for(int k=0;k<length;k++){
					if(k+j <= str.length())
					{
						String temp=str.substring(k,k+j);
						if(mp.containsKey(temp)){
							sum+=mp.get(temp);
						}
						else{
							if(isPalindrome(temp)){
								sum+=Math.pow(temp.length(), 2);
								mp.put(temp, (long)Math.pow(temp.length(), 2));
							}
						}
					}
				}
			}
			System.out.println(sum);
		}
		sc.close();
		long end=System.currentTimeMillis();
		System.out.println("Final Time:"+(end-start));
	}
	static boolean isPalindrome(String str){
		String reverse=new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reverse);
	}

}
