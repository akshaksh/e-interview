package hackereath;

import java.util.ArrayList;
import java.util.Scanner;

public class RoundTableKillers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=n;i++){
			al.add(i);
		}
		while(al.size()!=1){
			int noe_delete=x%k;
			int index=al.indexOf(x);
			for(int i=0;i<noe_delete;i++){
				if(al.size()>1){
				if((index+1) < al.size()){
					al.remove(index+1);
				}
				else{
					al.remove((index+1)%al.size());
					index--;
				}
				}
			}
			if(al.size()>1){
			if((index+1) < al.size()){
				x=al.get(index+1);
			}
			else{
				x=al.get((index+1)%al.size());
			}
			}
		}
		System.out.println(al.get(0));
	}

}
