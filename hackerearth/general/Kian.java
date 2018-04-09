package hackereath;

import java.util.Scanner;

public class Kian {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long array[]=new long[num];
		for(int i=0;i<num;i++){
			array[i]=sc.nextLong();
		}
		if(num<=3){
			for(int i=0;i<3;i++){
				if(i<num){
					System.out.print(array[i]+" ");
				}
				else{
					System.out.print(0+" ");
				}
			}
		}
		else{
			for(int i=0;i<3;i++){
				long sum=0;
				for(int j=i;j<num;j=j+3){
					sum=sum+array[j];
				}
				System.out.print(sum+" ");
			}
		}
	}

}
