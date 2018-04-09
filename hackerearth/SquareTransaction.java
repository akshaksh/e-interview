package hackerearth.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareTransaction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int array[] =new int[length]; int sum=0; boolean result=false; int index=0;
		ArrayList<Integer> al=new ArrayList<>(length);
		int noq=0; int queries[]=null;
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		noq=sc.nextInt();queries=new int[noq];
		for(int i=0; i< noq;i++){
			queries[i]=sc.nextInt();
		}
		
		for(int i=0;i<length;i++){
			sum+=array[i];
			al.add(sum);
		}
		for(int i=0;i<noq;i++){
			result=false;
			for(int j=0;j<al.size();j++){
				if(al.get(j) >= queries[i]){
					index=j;
					result=true;
					break;
				}
			}
			if(result)
				System.out.println(index+1);
			else
				System.out.println(-1);
		}
		
	}

}
