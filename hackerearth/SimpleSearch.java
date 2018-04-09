package hackerearth.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt(); int search_number=0;
		ArrayList<Integer> al=new ArrayList<>(length);
		for(int i=0;i<length;i++){
			al.add(sc.nextInt());
		}
		search_number=sc.nextInt();
		System.out.println(al.indexOf(search_number));
		

	}

}
