package hackerearth.algorithms.dynamicprogram2d;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class VasayaAndNumberTheory {
	
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    int[] dp = new int[n];
    
    for(int i=0;i<n;i++)
    {
        data[i] = sc.nextInt();
        dp[i] = 1;
    }
    
    Arrays.sort(data);
    //Below will give number of elelments in the subset 
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(data[j]%data[i]==0)
                dp[j] = Math.max(dp[j], dp[i]+1);
            //dp[i] this will tell that value which is dividing the dp[j] is itself are divisble by how many other number so count will increase
        }
    }
    int ans = 0;
    
    for(int i=0;i<n;i++)
        ans = Math.max(ans, dp[i]);
    if(ans==1)
        System.out.println(-1);
    else
        System.out.println(ans);
    
    //To print subset array see this:https://www.geeksforgeeks.org/largest-divisible-subset-array/
     sc.close();
   }
}