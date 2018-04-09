package hackereath;

import java.util.Scanner;

public class Starter {

	public static void main(String strs[]){
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		int num[]=new int[testcases];
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<num.length;j++){
			for(int i=3;i<num[j];i++){
				if(i%3 ==0 || i%5==0)
					sum+=i;
			}
			System.out.println(sum);
			sum=0;
		}
		
	}
	
}
