package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OperatorOnce {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		Map<Integer,Integer> mp=new TreeMap<Integer,Integer>();
		mp.put(1,0);mp.put(2,0);mp.put(3,0);
		for(int i=0;i<testcase;i++){
			int length=sc.nextInt();
			if(length==1)
				System.out.println(1);
			else{
				for(int j=0;j<length;j++){
					int value=sc.nextInt();
					mp.put(value, mp.get(value)+1);
				}
				if(length==2 && ((mp.get(1)>0 && mp.get(2)>0) || mp.get(2)>0 && mp.get(3)>0))
					System.out.println(1);
				else if(length==2 &&  mp.get(1)>0 && mp.get(3)>0)
					System.out.println(2);
				else if(length==2 &&  mp.get(1)>0 && mp.get(3)==0 && mp.get(2)==0)
					System.out.println(1);
				else if(length==2 &&  mp.get(2)>0 && mp.get(1)==0 && mp.get(3)==0)
					System.out.println(1);
				else if(length==2 &&  mp.get(3)>0 && mp.get(1)==0 && mp.get(2)==0)
					System.out.println(1);
				else if((mp.get(1) == mp.get(2)) && (mp.get(1) == mp.get(3))){
					System.out.println(mp.get(2)+2);
				}
				else if((mp.get(1) > mp.get(2)) && (mp.get(2) == mp.get(3))){
					System.out.println(mp.get(1)+1);
				}
				else if((mp.get(1) == mp.get(2)) && (mp.get(1) > mp.get(3))){
					System.out.println(mp.get(2)+2);
				}
				else if((mp.get(1) > mp.get(2)) && (mp.get(1) > mp.get(3))){
					System.out.println(mp.get(1)+1);
				}
				else if((mp.get(2) > mp.get(1)) && (mp.get(1) == mp.get(3))){
					System.out.println(mp.get(2)+2);
				}
				else if((mp.get(2) > mp.get(1)) && (mp.get(2) > mp.get(3))){
					System.out.println(mp.get(2)+2);
				}
				else if((mp.get(3) > mp.get(2)) && (mp.get(2) == mp.get(1))){
					System.out.println(mp.get(3)+1);
				}
				else if((mp.get(3) == mp.get(2)) && (mp.get(2) > mp.get(1))){
					System.out.println(mp.get(2)+2);
				}
				else if((mp.get(3) > mp.get(2)) && (mp.get(3) > mp.get(1))){
					System.out.println(mp.get(3)+1);
				}
			}
			mp.clear();
			mp=new TreeMap<Integer,Integer>();
			mp.put(1,0);mp.put(2,0);mp.put(3,0);
		}
		sc.close();

	}

}
