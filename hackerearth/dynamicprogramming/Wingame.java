package hackerearth.algorithms.dynamicprogramming;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wingame {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	       int testcases=sc.nextInt();
	       for(int i=0;i<testcases;i++){
	           float red=sc.nextFloat();float green=sc.nextFloat();
	           if((red==1 && green==0) || (red==0))
	        	   System.out.println("1.000000");
	           else
	           System.out.println(String.format("%.6f", red/(red+green)));
	       }
	       sc.close();

	}

}
