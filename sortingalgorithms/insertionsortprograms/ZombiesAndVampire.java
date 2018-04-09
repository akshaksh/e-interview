package hackerearth.sortingalgorithms.insertionsortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZombiesAndVampire {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//Insertion Sort
		   for (int i = 1; i < n; i++)
		   {
		       int key = arr[i];
		       int j = i-1;
		      while (j >= 0 && arr[j] > key) //here we will shift all the left side elements from their adjacent left values till end 
		       {
		           arr[j+1] = arr[j];
		           j = j-1;
		       }
		       arr[j+1] = key;
		   }
		   String evennumbers=""; String oddnumbers=""; int sumeven=0; int sumodd=0;
		   for(int i=0;i<n;i++){
			   if(arr[i]%2 == 0)
			   {
				   evennumbers+=" "+arr[i];
				   sumeven+=arr[i];
			   }
			   else{
				   oddnumbers+=" "+arr[i];
				   sumodd+=arr[i];
			   }
		   }
		   evennumbers+=" "+sumeven;
		   oddnumbers+=" "+sumodd;
		   System.out.println(evennumbers+ oddnumbers);
		sc.close();

	}

}
