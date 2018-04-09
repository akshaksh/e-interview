package hackerearth.algorithms;

import java.util.Scanner;

public class MannaFirstName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		String strings[]=new String[testcase]; int countSUVO=0;int countSUVOJIT=0;
		sc.nextLine();
		for(int i=0;i<testcase;i++){
			strings[i]=sc.nextLine();
		}
		
		for(int i=0;i<testcase;i++){
			if(strings[i].indexOf("SUVOJIT") != -1 || strings[i].indexOf("SUVO") != -1)
			{	
				while(null!=strings[i] && !strings[i].isEmpty() && strings[i].indexOf("SUVOJIT") != -1){
					strings[i]=strings[i].replaceFirst("SUVOJIT", "");
					countSUVOJIT++;
				}
				while(null!=strings[i] && !strings[i].isEmpty() && strings[i].indexOf("SUVO") != -1){
					strings[i]=strings[i].replaceFirst("SUVO", "");
					countSUVO++;
				}
			}
			System.out.println("SUVO = "+countSUVO+", SUVOJIT = "+countSUVOJIT);
			countSUVOJIT=countSUVO=0;
		}
		
	}

}
