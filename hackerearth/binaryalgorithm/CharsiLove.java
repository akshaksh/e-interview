package hackerearth.algorithms.binaryalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharsiLove {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean a = isDesperate(n);
		if(a)
			System.out.println("YES");
		else
			System.out.println("NO");
			
	}
 
	static boolean isDesperate(int n)
	{
		int i = 0,j = (int)Math.sqrt(2*n);//Very important thing end will be sqrt twice of the number else it won't go beyond that
		
		while(i <= j)
		{
			int num1, num2;
			num1 = desp(i);
			num2 = desp(j);
			if(num1 + num2 == n)
				return true;
			if(num1 + num2 < n)
				i++;
			else
				j--;
		}
		return false;
	}
 
	static int desp(int n)
	{
		int desp = (n*(n+1))/2;
		return desp;
	}

}

/*Its been a few days since Charsi is acting weird. And finally you(his best friend) came to know that its because his proposal has been rejected.

He is trying hard to solve this problem but because of the rejection thing he can't really focus. Can you help him? The question is: Given a number n , find if n can be represented as the sum of 2 desperate numbers (not necessarily different) , where desperate numbers are those which can be written in the form of (a*(a+1))/2 where a > 0 .

Input :

The first input line contains an integer n (1 ≤ n ≤ 10^9).

Output :

Print "YES" (without the quotes), if n can be represented as a sum of two desperate numbers, otherwise print "NO" (without the quotes).

SAMPLE INPUT 
256
SAMPLE OUTPUT 
YES*/