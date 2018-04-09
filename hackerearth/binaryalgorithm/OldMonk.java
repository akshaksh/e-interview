package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OldMonk {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	    int q = s.nextInt();
        for(int z=0;z<q;z++)
        {
           int n = s.nextInt();
           long a[] = new long[n];
           long b[] = new long[n];
           for(int k=0;k<n;k++)
           {
             a[k] = s.nextLong();
           }
           for(int k=0;k<n;k++)
           {
             b[k] = s.nextLong();
           }
           int max=0;
           for(int i=0;i<n;i++)
           {
               int start=0;
               int end =n-1;
               long x = a[i];
               int ind=-1;
               while(start<=end)
               {
                   int mid = (start+end)/2;
                   if(b[mid]>=x)
                   {
                       ind = mid;
                       start = mid+1;
                   }
                   else end = mid -1;
               }
               if(ind!=-1)
                    {
                        for(int j=i;j<=ind;j++)
                        {
                           if((j-i)>max)
                           {
                               max = j-i;
                           }
                        } 
                    }
           }
           System.out.println(max);
        }
    }
}
