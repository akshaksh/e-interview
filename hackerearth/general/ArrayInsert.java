package hackereath;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String strs[]){
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int queries_number=sc.nextInt();
		int sum=0;
		int array[]=new int [length];
		String queries[]=new String[queries_number];
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		sc.nextLine();
		for(int i=0;i<queries_number;i++){
			queries[i]=sc.nextLine();
		}
		for(int j=0;j<queries.length;j++){
			String splitstring[]=queries[j].split(" ");
			if(splitstring[0].equals("1")){
				array[Integer.parseInt(splitstring[1])]=Integer.parseInt(splitstring[2]);
			}
			else{
				for(int i=Integer.parseInt(splitstring[1]);i<=Integer.parseInt(splitstring[2]);i++){
					sum+=array[i];
				}
				System.out.println(sum);
				sum=0;
			}
		}
	}
}
