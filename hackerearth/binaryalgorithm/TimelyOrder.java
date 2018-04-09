package hackerearth.algorithms.binaryalgorithm;

//Here we have to find the difference between wegiht on different different time
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TimelyOrder {

	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int q = sc.nextInt();
		long sum = 0;
		int[] time = new int[q+1];
		time[0] = 0;
		int n = 1;
		HashMap<Integer,Long> map = new HashMap<>();
		map.put(0,(long)0);
		for(int i=0;i<q;i++)
		{
			int c = sc.nextInt();
			if(c==1)
			{
				int x = sc.nextInt();
				sum = sum+x;
				int t = sc.nextInt();
				time[n] = t;
				n++;
				map.put(t,sum);
			}
			else
			{
				int k = sc.nextInt();
				int t = sc.nextInt();
				System.out.println(map.get(time[n-1])-map.get(time[getindex(t-k,time,n)-1]));
				
			}
		}
		sc.close();
	}
	public static int getindex(int t,int[] time,int n)
	{
		if(t==0) //If Difference between times are 0 means exact same time then return first element
		{
			return 1;
		}
		if(time[n-1]<=t) //If difference between times are more than the recorded times actually we have then return the last element
		{
			return n;
		}
		int l = 0;
		int r = n-1;
		while(r-l>1) //To find the lower bound
		{
			int m = (l+r)/2;
			if(time[m]<=t)
			{
				l = m;
			}
			else
			{
				r = m;
			}
		}
		if(time[l]==t) //If difference is same as the first element in the array then it will go to the point 
		{
			return l;
		}
		return l+1;
	}
}
