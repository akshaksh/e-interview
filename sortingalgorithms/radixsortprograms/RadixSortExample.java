package hackerearth.sortingalgorithms.radixsortprograms;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSortExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int arr[]=new int[n];int output[][]=new int[10][n]; int count[]=new int[10];int num=arr[0]; int power=1;
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int ar:arr)
			if(ar>num)
				num=ar;
		while(num>0){
			for(int i=0;i<arr.length;i++){
				int value=arr[i]/power;
				value=value%10;
				output[value][count[value]]=arr[i];
				count[value]++;
			}
			int t=0;
			for(int i=0;i<output.length;i++){
				for(int j=0;j<count[i];j++){
					arr[t++]=output[i][j];
					output[i][j]=0;
				}
				
			}
			num=num/10;
			power=power*10;
			Arrays.fill(count, 0);
			for(int ar:arr)
				System.out.print(ar+" ");
			System.out.println();
		}
	}

}
