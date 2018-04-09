package hackerearth.algorithms.dynamicprogram2d;

import java.util.Scanner;

public class LongestPalinSubstringWithDymnamicProgramming {
	static String sequesnce=null;;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String message=sc.next();
		int length=getLongestPalandromicString(message,0,message.length()-1);
		System.out.println("string: "+sequesnce);
		System.out.println("length: "+length);
		sc.close();
	}
	public static int getLongestPalandromicString(String str,int i,int j){
		if(i>j)
			return 0;
		else if(i==j)
			return 1;
		else if(str.charAt(i) == str.charAt(j)){
			return getLongestPalandromicString(str,i+1,j-1)+2;
		}
		else
		{
			int len1=getLongestPalandromicString(str, i+1, j);
			int len2=getLongestPalandromicString(str, i, j-1);
			if(len1>len2)
				{
					sequesnce=str.substring(i+1,j+1);
					return len1;
				}
			else
			{
				sequesnce=str.substring(i,j);
				return len2;
			}
			
		}
	}
}

/*The idea is to use recursion to solve this problem. The idea is compare the last character of the string X[i..j]with its first character. There are two possibilities
a)If the last character of the string is same as the first character, we include first and last characters in palindrome and recurse for the remaining substring X[i+1, j-1]
b)If last character of string is different from the first character, we return maximum of the two values we get by
	removing the last character and recursing for the remaining substring <font face="consolas" size="3">X[i, j-1]
removing the first character and recursing for the remaining substring <font face="consolas" size="3">X[i+1, j]
This yields the below recursive relation to find the length of longest repeated Subsequence of a sequence X
        | 1                                      (if i = j)<br />
LPS[i..j] = | LPS[i+1..j-1] + 2                      (if X[i] = X[j])<br />
        | max (LPS[i+1..j], LPS[i..j-1])         (if X[i] != X[j])<br />*/