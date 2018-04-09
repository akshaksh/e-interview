package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicExample {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
        int n=sc.nextInt();
        int arr[]=new int[n];
        int swapcount=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int swaptempvalue=0;
                if(arr[j]>arr[j+1]){
                    swaptempvalue=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swaptempvalue;
                    swapcount++;
                }
            }
        }
        System.out.println(swapcount);
        sc.close();

	}

}
