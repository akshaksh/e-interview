package hackerearth.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class NormalPockemon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt(); 
		int array[] = new int[length];
		int counter=0; StringBuilder sum=new StringBuilder("");
		ArrayList<String> al=new ArrayList<>(length);
		Set<Integer> numbers=new HashSet<>();
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
			numbers.add(array[i]);
		}
		Object[] diffnumber=numbers.toArray();
		for(int i=0;i<length;i++){
			sum.append(array[i]+"");
			for(int j=i+1;j<length;j++){
				sum.append(sum+":"+array[j]);
				counter=0;
				for(int k=0;k<diffnumber.length;k++){
					if(sum.indexOf(String.valueOf(diffnumber[k])) != -1)
					counter++;
				}
				if(counter == diffnumber.length){
					al.add(sum.toString());
				}
			}
			sum=new StringBuilder("");
		}
		System.out.println(al.size());
		sc.close();

	}

}
