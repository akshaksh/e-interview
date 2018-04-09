package hackerearth.sortingalgorithms.radixsortprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkAndRadixSorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); long arr[]=new long[n];long backup[]=new long[n]; int index[]=new int[n];
		long weight[]=new long[n]; int count=0;
		String splits[]=br.readLine().split(" ");
		for(int i=0;i<splits.length;i++){
			arr[i]=Long.parseLong(splits[i]);
			backup[i]=arr[i];
		}
		while(true){
			for(int i=0;i<n;i++){
				weight[count]=arr[i]%100000;
				index[count]=i;
					count++;
				}
			for(int i=0;i<n-1;i++){
				for(int j=0;j<n-i-1;j++){
					long temp=0l; int tempindex=0;
					if(weight[j]>weight[j+1]){
						temp=weight[j];tempindex=index[j];
						weight[j]=weight[j+1]; index[j]=index[j+1];
						weight[j+1]=temp; index[j+1]=tempindex;
					}
				}
			}
			for(int i=0;i<index.length;i++)
				System.out.print(backup[index[i]]+" ");
			System.out.println();
			for(int i=0;i<n;i++){
				arr[i]=arr[i]/100000;
				if(arr[i] == 0)
					System.exit(0);
			}
			count=0;
			Arrays.fill(index, 0);
			Arrays.fill(weight, 0);
		}
	}

}
