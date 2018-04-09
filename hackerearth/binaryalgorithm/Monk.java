package hackerearth.algorithms.binaryalgorithm;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Monk {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		//Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt();
		int m=sc.nextInt();
		long smallest=Integer.MAX_VALUE;
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			Arrays.sort(arr[i]);
		}
		
		for(int i=0,j=1;i<n && j<n;i++,j++){
			for(int k=0;k<arr[i].length;k++){
				 smallest=Math.min(smallest, findMinimum(arr[j],arr[i][k]));
			}
		}
		System.out.println(smallest);
		sc.close();
		
	}
	static int findMinimum(int arr[],int find){
		int low=0; int high=arr.length-1;
		int mid=0;
		while(high-low>1){
			mid=(low+high)/2;
			if(find>arr[mid])
				low=mid;
			else if(find<arr[mid]){
				high=mid;
			}
			else{
				mid=0;
			}
		}
		return Math.min(Math.abs(arr[high]-find),Math.abs(find-arr[low]));

	}

}

/*for(int i=0,j=1;i<n && j<n;i++,j++){
for(int k=0;k<arr[i].length;k++){
	for(int p=0;p<arr[j].length;p++){
		//System.out.print(arr[i][k]-arr[j][p]+" ");
		if(i==0 && j==1 && k==0 && p==0)
			smallest=Math.abs(arr[i][k]-arr[j][p]);
		else{
				if(Math.abs(arr[i][k]-arr[j][p]) <smallest)
					smallest=Math.abs(arr[i][k]-arr[j][p]);
		}
	}
}
}*/

//Here normal binary search will not work as value which we are searching is not necessary to be found so we have to go for high-low>1 not high>=low