package hackerearth.sortingalgorithms.insertionsortprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MonkAndNiceStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {  
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	        int n=sc.nextInt();
	        String s[]=new String[n];
	        for(int i=0;i<n;i++)
	        s[i]=sc.next();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<i;j++){
	                if(s[i].compareTo(s[j])>0){
	                    ++a[i];
	                }else{
	                    
	                }
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.println(a[i]);
	        }
        }

}
