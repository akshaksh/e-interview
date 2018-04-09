package hackerearth.algorithms;

import java.util.Scanner;

public class Streak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt(); int number=0;
		String results[]=new String[testcase];
		for(int i=0;i<testcase;i++){
			number=sc.nextInt();
			if(number%21 == 0)
				results[i]="The streak is broken!";
			else if(String.valueOf(number).indexOf("21") != -1)
				results[i]="The streak is broken!";
			/*else if(
					(String.valueOf(number).indexOf("2") !=-1) 
					&& (String.valueOf(number).lastIndexOf("1") !=-1) 
					&& (String.valueOf(number).indexOf("2")<String.valueOf(number).indexOf("1"))){
				results[i]="The streak is broken!";
			}*/
			else{
				results[i]="The streak lives still in our heart!";
			}
		}
		for(String val:results){
			System.out.println(val);
		}
	}

}
