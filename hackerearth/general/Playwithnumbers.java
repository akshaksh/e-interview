package hackereath;

import java.util.Scanner;

public class Playwithnumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int query=sc.nextInt();
		int array[]=new int[number];
		int result[]=new int[query];
		int sum=0;
		for(int i=0;i<number;i++){
			array[i]=sc.nextInt();
		}
		for(int j=0;j<query;j++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;
			b--;
			sum=((b-a)/2)+a;
			result[j]=array[sum];
			sum=0;
			
			
		}
		for(int i=0;i<query;i++){
			System.out.println(result[i]);
		}
		
	}

}
