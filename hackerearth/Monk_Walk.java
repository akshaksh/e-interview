package hackerearth.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Monk_Walk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		int count[]=new int[testcase]; int counter=0;
		char vowel_char[]=null;
		ArrayList<Character> al=new ArrayList<>();
		String str="";
		sc.nextLine();
		al.add('a');al.add('e');al.add('i');al.add('o');al.add('u');
		al.add('A');al.add('E');al.add('I');al.add('O');al.add('U');
		for(int i=0;i<testcase;i++){
			vowel_char=sc.nextLine().toCharArray();
			for(char c:vowel_char){
					if(al.contains(c))
						counter++;
			}
			count[i]=counter;
			counter=0;
		}
		for(int i=0;i<testcase;i++){
			System.out.println(count[i]);
		}
		

	}

}
