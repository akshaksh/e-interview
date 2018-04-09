package hackerearth.algorithms.binaryalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SoapMystery {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int num[]=new int[length];
		int q=0; int result[]=null;
		for(int i=0;i<num.length;i++){
				num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		q=sc.nextInt();
		result=new int[q];
		for(int i=0;i<q;i++){
			int count=0;
			int number=sc.nextInt();
			for(int j=0;j<length;j++){
					if(number>num[j])
						count++;
					else
						break;
			}
			result[i]=count;
		}
		for(int i=0;i<length;i++){
			System.out.println(result[i]);
		}
		sc.close();    **********************OR*************
	}*/
	static int binarysearch(int low,int high,int key,int a[])
    {
        int ans=-1;
    
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]<key)
            {
                ans=mid;
                 low=mid+1;
                
             }
             else 
            {
              high=mid-1;
             }
             
   }
   return ans;                //key not found
 }
    public static void main(String args[] ) throws Exception {
       
 
    
        Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int A[] = new int[n];
      for(int i=0;i<n;i++)
      {
            A[i]=s.nextInt();
      }
        int t = s.nextInt();
    
        Arrays.sort(A);
        for(int j=0;j<t;j++)
        {
            int m = s.nextInt();
            int count1=binarysearch(0,n-1,m,A);
            System.out.println(count1+1);
        }
      
      
 
    }

}
