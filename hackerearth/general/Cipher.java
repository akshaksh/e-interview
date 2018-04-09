package hackereath;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String originalmessage=sc.nextLine();
		int number=sc.nextInt();
		char array[]=originalmessage.toCharArray();
		for(int i=0;i<array.length;i++){
			if(Character.isUpperCase(array[i])){
				int beforenum=number%26;
				int num=array[i]+beforenum;
				if(num>90){
					num=(num-90)+64;
				}
				array[i]=(char)num;
			}
			else if(Character.isLowerCase(array[i])){
				int beforenum=number%26;
				int num=array[i]+beforenum;
				if(num>122){
					num=(num-122)+96;
				}
				array[i]=(char)num;
			}
			else if(Character.isDigit(array[i])){
				int num=Character.getNumericValue(array[i])+number;
				num=num%10;
				num=num+48;
				array[i]=(char)num;
			}
		}
		System.out.println(new String(array,0,array.length));

	}

}
