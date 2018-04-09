package hackerearth.algorithms.dynamicprogram2d;

import java.util.Scanner;

public class LongestPalinSubstring {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++){
    		System.out.println(isPrime(findLongestPalindrome(sc.next()).length()));
    	}
        sc.close();
       
    }
    public static String isPrime(int n)
    {
        // Corner case
        if (n <= 1) return "NOT PRIME";
     
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return "NOT PRIME";
     
        return "PRIME";
    }
    public static String findLongestPalindrome(String s) {
        if (s.isEmpty()) {
            return "Please enter a String";
        }
    
        if (s.length() == 1) {
            return s;
        }
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i = i+1) {
            
            // get longest palindrome for odd length (center is i)
            String tmp = checkForEquality(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
    
            // get longest palindrome for even length (center is i, i+1)
            tmp = checkForEquality(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
    
        return longest;
    }
    
    public static String checkForEquality(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);    
    }
}

/*How to proceed in above questions?
See as we know to check wheter a string is palindrome or not we select the mid point and move towards left and right and will check whether
string is greater than the previous palindrome string if yes then replace. in this way we will get our string.*/