package hackerearth.algorithms.greedyalgorithm;

import java.util.Scanner;

public class MotuPatluIcream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		int number=0; int motucount=1,patlucount=1; double motutime=0,patlutime=0;
		int array[][]=new int[testcase][];
		for(int i=0;i<testcase;i++){
			number=sc.nextInt();
			array[i]=new int[number];
			for(int j=0;j<number;j++){
				array[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<array.length;i++){
			if(array[i].length>1){
					motutime=array[i][0]/2.0;
					patlutime=array[i][array[i].length-1];
					for(int j=1,k=array[i].length-2;j<=k;){
						if(motutime>patlutime){
							patlutime+=array[i][k];
							patlucount++;
							k--;
						}
						else if(motutime<=patlutime){
							motutime+=array[i][j]/2.0;
							motucount++;
							j++;
						}
					}
			System.out.println(motucount+" "+patlucount);
			if(motucount>patlucount)
				System.out.println("Motu");
			else if(motucount<patlucount)
				System.out.println("Patlu");
			else
				System.out.println("Tie");
			motucount=1;patlucount=1;
			}
			else{
				System.out.println(1+" "+0);
				System.out.println("Motu");
			}
		}
		sc.close();
	}

}
