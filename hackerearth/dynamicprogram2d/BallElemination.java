package hackerearth.algorithms.dynamicprogram2d;

import java.util.Scanner;

public class BallElemination {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)arr[i]=scan.nextInt();
	     int d[][]=new int[n][n];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++)
	         d[i][j]=-1;
	     }
	    System.out.println(getResult(arr,0,n-1,d));
	    scan.close();
	    }
	    static int getResult(int arr[],int i,int j,int d[][]){
	           if(d[i][j]==-1){
	        
	        if(i==j) return 1;
	        if(i==j+1)return 0;
	        if(arr[i]==arr[j]) return getResult(arr,i+1,j-1,d);
	        int q=999999;
	        for(int m=i;m<j;m++){
	            q=Math.min(q,getResult(arr,i,m,d)+getResult(arr,m+1,j,d));
	            
	        }
	         return d[i][j]=q;
	      }
	      return d[i][j];
	}

}
/*Explanation:
	If a is our array of n balls, let f(i,j) be the cost of eliminating all the balls in a[i..j]. Our required solution is then f(0,n−1) (assuming 0-based indexing).

	How do we calculate the value of f(i,j)?
	If a[i]=a[j], let us eliminate all balls between i and j, then we can remove ball i and j with no cost. Hence in this case, f(i,j)=f(i+1,j−1).
	If a[i]≠a[j], let us split our given range into two pieces to be solved recursively. We cannot immediately say where is the best index for splitting hence we have to try all indices between i and j. In this case, f(i,j)=min{f(i,k)+f(k+1,j):i≤k<j}

	What about our base cases?
	If i=j+1, then our range is empty, and f(i,j)=0.
	If i=j, then we have one ball in our range which requires cost 1 to remove. So here f(i,j)=1.

	Our final definition of f is as follows
	f(i,j)=⎧⎩⎨⎪⎪⎪⎪01f(i+1,j−1)min{f(i,k)+f(k+1,j):i≤k<j}if i=j+1,if i=j,if a[i]=a[j],otherwise.
	The dynamic programming solution will require O(n2) space and O(n3) time.
	For this problem the top-down approach is easier to implement. Here is the link to my solution.
	As a challenge you can also try to implement a bottom-up approach :)*/