package hackereath;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
public static void main(String str[]){
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	ArrayList<Integer> al=new ArrayList();
	int min=0,max=0;
	int counter=0;
	int k=0;
	for(int i=0;i<num;i++){
		al.add(sc.nextInt());
		if(i==0)
			min=max=al.get(i);
		else
		{
			if(min>al.get(i))
				min=al.get(i);
			else if(max<al.get(i))
				max=al.get(i);
		}
	}
	for(k=min;k<=max;k++){
		if(al.contains(k)){
			counter++;
		}
	}
	if(counter == k-1){
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
}
}
