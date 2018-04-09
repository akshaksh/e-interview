package hackerearth.algorithms.greedyalgorithm;

import java.util.Scanner;

public class InsectColony {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		int array[][]=new int[testcase][];
		long sum=0; String result[]=new String[testcase];
		for(int i=0;i<testcase;i++){
			array[i]=new int[sc.nextInt()];
			for(int j=0;j<array[i].length;j++){
				array[i][j]=sc.nextInt();
				sum+=array[i][j];
			}
			if(sum%2 == 0)
				result[i]="Yes";
			else
				result[i]="No";
			sum=0;
		}
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		sc.close();
	}
	
}
/*In the problem we intend to kill all the ants using XOR operation.. its like if even no of ants are fighting then each one will have someone to fight with and both will die .. if odd someone will never get to fight and will stay alive...*/
//if number of "odd number" is even then its XOR will be 0 else 1