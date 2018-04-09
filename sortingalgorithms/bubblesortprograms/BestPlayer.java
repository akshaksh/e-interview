package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BestPlayer {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); int t=sc.nextInt(); String name[]=new String[n]; int fan[]=new int[n];
		for(int i=0;i<n;i++){
			name[i]=sc.next();
			fan[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(fan[j]<fan[j+1]){
					int temp=fan[j];
					String tempString=name[j];
					fan[j]=fan[j+1];
					fan[j+1]=temp;
					name[j]=name[j+1];
					name[j+1]=tempString;
					
				}
			}
		}
		for(int i=0;i<n-1;i++){
			if(fan[i]==fan[i+1]){
				int value=name[i].compareTo(name[i+1]);
				if(value>0){
					String temp=name[i];
					name[i]=name[i+1];
					name[i+1]=temp;
				}
					
			}
		}
		for(int i=0;i<t;i++){
			System.out.println(name[i]);
		}
		sc.close();

	}

}
