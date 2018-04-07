package dp;
//Not fully completed
import java.util.Arrays;

public class CountNumberOfIncreasingSequence {

	public static void main(String[] args) {
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60 };
		int k=4;
		int list[]=new int[arr.length];
		Arrays.fill(list, 1);
        int n = arr.length;
        for(int i=1;i<n;i++){
        	for(int j=0;j<i;j++){
        		if((arr[i]>arr[j])&&(list[i]<list[j]+1))
        			{
        				list[i]=list[j]+1;
        			}
        	}
        }
        System.out.println("Check the list");
        for(int ar:list)
        	System.out.print(ar+" ");
        System.out.println();

	}

}
