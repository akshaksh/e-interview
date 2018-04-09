package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class KingdomOfDreams {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int tescase=sc.nextInt();
		for(int i=0;i<tescase;i++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			int low=0;int high=arr.length-1;
			long cost1=0; long cost2=0; long totalcost=0;
			while(high-low>2){
					cost1=(2*arr[1])+arr[high]+arr[0];
					cost2=(2*arr[0])+arr[high]+arr[high-1];
					totalcost+=Math.min(cost1, cost2);
					high=high-2;
			}
			if(high-low == 2)
				totalcost+=arr[0]+arr[1]+arr[2];
			else if(high-low==1)
				totalcost+=arr[1];
			else
				totalcost+=arr[0];
			System.out.println(totalcost);
		}
		sc.close();

	}

}

/*Explaination- There are two ways to send two most costly persons to kingdom-

Send the two costly people with person having lowest cost turn by turn. So, total cost will be cost of two costly persons+ 2*(cost of cheapest person)(due to coming back).

Send the two most cheapest person and the cheapest person will comeback.Now send both costly persons and second most costly person will comeback with second cheapest person.

So, total cost will be cost of cheapest and costliest person plus 2*cost of second cheapest person.*/