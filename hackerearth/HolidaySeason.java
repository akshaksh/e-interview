package hackerearth.algorithms;

import java.util.Scanner;

public class HolidaySeason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt(); int counter=0;
		sc.nextLine();
		String text=sc.nextLine();
		for(int i=0;i<length;i++){
			if((i+1<length) && (i+2<length) && (i+3<length)){
				if((text.charAt(i) == text.charAt(i+2)) && (text.charAt(i+1) == text.charAt(i+3))){
					counter++;
				}
			}
		}
		System.out.println(counter);
		sc.close();

	}

}
