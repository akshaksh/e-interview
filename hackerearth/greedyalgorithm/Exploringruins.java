package hackerearth.algorithms.greedyalgorithm;

import java.util.Scanner;

public class Exploringruins {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			if(str.length() == 1){
				if(str.charAt(0) == '?')
					System.out.println("a");
				else
					System.out.println(str);
				
			}
			else{
				if (str.charAt(0) == '?') {
	                if (str.charAt(1) == 'a') {
	                	str = "b" + str.substring(1);
	                } else {
	                	str = "a" + str.substring(1); //here it considering both ? and b as well
	                }
	            }
				for(int i=1;i<str.length()-1;i++){
						if(str.charAt(i) == '?'){
								if(str.charAt(i+1)=='a' || str.charAt(i-1)=='a'){
									str=str.substring(0,i)+"b"+str.substring(i+1);
								}
								else{
									str=str.substring(0,i)+"a"+str.substring(i+1);
								}
						}
				}
				if(str.charAt(str.length()-1) == '?'){
					if(str.charAt(str.length()-2) == 'a')
						str=str.substring(0,str.length()-1)+"b";
					else
						str=str.substring(0,str.length()-1)+"a";
				}
				System.out.println(str);
			}
			sc.close();
			
	}

}
