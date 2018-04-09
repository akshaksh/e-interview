package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_Arrangment {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int counter=0; boolean flag;
		Map<Integer,Integer>mp=new HashMap<Integer, Integer>(m);
		System.out.println(System.currentTimeMillis());
		for(int i=1;i<=m;i++){
			mp.put(i,k);
		}
		for(int i=1;i<=n;i++){
			
			flag=false;
			int value=sc.nextInt();
			if(mp.size()>=1){
			if((null != mp.get(value)) && (mp.get(value)>0)){
				mp.put(value, mp.get(value)-1);
				if(mp.get(value) == 0)
					mp.remove(value);
			}
			else{
				counter++;
				if(value == m){
					for(int j=1;j<m;j++)
						if((null != mp.get(j))&&(mp.get(j)>0))
							{mp.put(j, mp.get(j)-1); if(mp.get(j) == 0)
								mp.remove(j);break;}
				}
				else{
					for(int j=value+1;j<=m;j++){
						if((null != mp.get(j))&&(mp.get(j)>0))
							{mp.put(j, mp.get(j)-1); if(mp.get(j) == 0)
								mp.remove(j);flag=true;break;}
					}
					if(!flag){
						for(int j=1;j<=value-1;j++)
							if((null != mp.get(j))&&(mp.get(j)>0))
								{mp.put(j, mp.get(j)-1); if(mp.get(j) == 0)
									mp.remove(j);break;}
					}
					
				}
				
					
			}
			
			}
			else{
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
		System.out.println(System.currentTimeMillis());
	}

}
