package bucketsort;

import java.util.Arrays;

public class BucketSortExample{
 
   public static void sort(int[] a, int maxVal) {
      int [] bucket=new int[maxVal+1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<a.length; i++) {
         bucket[a[i]]++;
      }
      for(int ar:bucket){
    	  System.out.print(ar+" ");
      }
      int outPos=0; 
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            a[outPos++]=i;
         }
      }
   }
 
 
   public static void main(String[] args) {
      int maxVal=90;
      int [] data= {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50}; 
 
      System.out.println("Before: " + Arrays.toString(data));
      sort(data,maxVal);
      System.out.println("After:  " + Arrays.toString(data));
      
   }
}
 