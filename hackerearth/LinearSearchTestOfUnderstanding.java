package hackerearth.algorithms;

import java.util.Scanner;

public class LinearSearchTestOfUnderstanding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int search_num=sc.nextInt();
        int value=0; int index =-1;
        String str="";
        for(int i=0;i<size;i++){
            value=sc.nextInt();
            if(search_num == value)
            	index=i;
            	
        }
        if(index != -1)
        System.out.println(index+1);
        else
        System.out.println(-1);

	}

}
