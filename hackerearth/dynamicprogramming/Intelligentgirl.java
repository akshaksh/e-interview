package hackerearth.algorithms.dynamicprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This will give some time problem
public class Intelligentgirl {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		String str=sc.nextLine();
		Pattern pattern = Pattern.compile("[2468]");
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.groupCount()); long counter=0; String message="";
		while(matcher.find()){
			counter++;
			message+=matcher.start()+" ";
		}
		String[] split = message.split(" "); int t=0;
		for(int i=0;i<str.length();){
			int len=Integer.parseInt(split[t]);
			while(i<=len){
				System.out.print(counter);i++;
			}
			counter--;
			t++;
		}
		sc.close();
	}

}


/*Without regex
class TestClass {
    public static void main(String args[] ) throws Exception {
        
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		for(int i=0;i<length;i++){
		String message =str.substring(i);
		long count = message.chars().filter(ch -> ch == '2' || ch == '4' || ch == '6' || ch == '8').count();
		System.out.print(count+" ");
		}
	

    }
}
*/
