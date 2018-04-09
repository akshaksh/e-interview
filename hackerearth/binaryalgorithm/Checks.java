package hackerearth.algorithms.binaryalgorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 


import java.util.StringTokenizer;

import static java.lang.Integer.max;
/**
 * Created by bugkiller on 7/1/2017.
 */
class Checks {
 
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\ajku0717\\Desktop\\input.txt")));
		char a[] = new char[52];
 
		for(int i =0; i<26; i++)
		{
			a[2*i] = (char)(i+65);
			a[2*i+1] = (char)(i+97);
		}
 
 
		int T = Integer.parseInt(xx.readLine());
 
		while(T-- > 0)
		{
			StringTokenizer st = new StringTokenizer(xx.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
 
 
			String s = xx.readLine();
 
			int max = 0;
			for(int i =0; i< 52; i++)
			{
 
				int l =0, r =0;
				int changes = k;
				char ch = a[i];
 
 
				while(r < n)
				{
					if(changes>0)
					{
						if(s.charAt(r) != ch)
						changes --;
 
						r++;
 
						max = Math.max(r-l, max);
 
 
					}
					else
					{
						if(s.charAt(r) == ch)
						{
							r++;
							max = Math.max(r-l,max);
						}
						else
						{
 
							while(changes == 0)
							{
								if(s.charAt(l) !=ch)
								++changes;
 
								++l;
							}
						}
 
					}
 
				}
 
 
			}
 
			System.out.println(max);
 
		}
	}
}