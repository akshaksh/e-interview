package hackerearth.sortingalgorithms.quicksortprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*Problem Statement:
Trico is trying to impress a girl. But the girl is not showing any sign of interest to him. So his best friend suggested him to gift one Grovyle string to her. Grovlye string is a odd length string consisting of only lowercase alphabets arranged in such a way that a number X associated with it is smallest as possible.
X is calculated as : First take absolute distance of each character's position from the center of the string i.e., (string length/2) and then multiply the distance with its ASCII value. Similarly find all the values and add them.
Example : Given string : aaa
Here only one unique permutation is possible : aaa
distances are : for first a, d1 = 1, second a, d2 =0, third a, d3 = 1;
so X = 1 X 97 + 0 X 97 + 1 X 97 = 194;
So given a string of odd length consisting of only lowercase alphabets, find one permutation of the given string such that X is smallest as possible. And if there are many such strings then print the lexicographically smallest one.
Input: First line contains T, the number of test cases that follow. Next T lines, each contains one odd length string consisting of only lowercase alphabets.
Output: For each test case, print the desired result in separate lines.
Constraints: 1 ≤ T ≤ 1000 0 ≤ String Length ≤ 1001*/
public class Permutations {
	
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        while(t > 0){
            t--;
            line = br.readLine();
            char[] c = line.toCharArray();
            char[] c1 = new char[c.length];
            Arrays.sort(c);
            int s = 0, e = c.length - 1;
            for(int i = 0; i < c.length; i++){
                if(i%2 == 0){
                    c1[s++] = c[i];
                }else{
                    c1[e--] = c[i];
                }
            }
            for(int i = 0; i < c1.length; i++){
                System.out.print(c1[i]);
            }
            System.out.println("");
        }
    }  
	
	/*Below commeneted code will work but for large number fo string it will give heap error  so
	private static List<String> al=null;
	private static Map<Integer,List<String>>mp=new TreeMap<>();
	private static int min=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			printString(sc.next());
		}
		sc.close();
	}
	public static void printString(String str){
		min=0;
		mp.clear();
		List<String>als=null;Set<Entry<Integer, List<String>>> entrySet=null;
		generatePermutation("",str);
		entrySet= mp.entrySet();
		als=mp.get(min);
		if(als.size() == 1)
		{
			System.out.println(als.get(0));
		}
		else if(als.size() == 2)
		{
				if(als.get(0).compareTo(als.get(1))>0)
					System.out.println(als.get(1));
				else
					System.out.println(als.get(0));
		}
		else{
		String message=als.get(0);
		for(int i=1;i<als.size()-1;i++){
			if(message.compareTo(als.get(i))>0)
			{
					message=als.get(i);
			}
		}
		System.out.println(message);
		}
		
	}
	public static void generatePermutation(String prefix,String string){
		if(string.length()==0)
			{
				int sum=calculate(prefix);
				//System.out.println(prefix+" : "+sum);
				if(mp.containsKey(sum))
					mp.get(sum).add(prefix);
				else
				{
					al=new ArrayList<String>();
					al.add(prefix);
					mp.put(sum, al);
				}
				if(sum<min || min==0){
					min=sum;
				}
			}
		else{
			for(int i=0;i<string.length();i++)
				{
					String a=prefix;
					String b=string.substring(i,i+1);
					String c=string.substring(0,i);
					String d=string.substring(i+1);
					generatePermutation(prefix+string.substring(i,i+1),(string.substring(0,i)+string.substring(i+1)));
				}
		}
	}
	public static int calculate(String string){
		char ch[]=string.toCharArray();
		int mid=ch.length/2;
		int sum=0;
		for(int i=0;i<ch.length;i++){
			sum+=Math.abs((mid-i))*(int)ch[i];
		}
		return sum;
	}

*/}
