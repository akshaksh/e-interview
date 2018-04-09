package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChoclateBoxes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int nob=sc.nextInt(); int previous_value=0; int previousindex=0;
		int boxes_index[][]=new int[2][nob];
		for(int i=0;i<nob;i++){
			int value=sc.nextInt();
			if(i==0){
				boxes_index[0][i]=1;
				boxes_index[1][i]=i+1;
				previousindex=1;
			}
			else{
				previousindex=previousindex+previous_value;
				boxes_index[0][i]=previousindex;
				boxes_index[1][i]=i+1;
			}
			previous_value=value;
			
		}
		int noq=sc.nextInt();
		for(int i=0;i<noq;i++){
			int index=findboxindex(boxes_index[0],sc.nextInt());
			System.out.println(boxes_index[1][index]);
		}
		sc.close();

	}
	public static int findboxindex(int arr[],int find){
		int low=0;int high=arr.length-1; int mid=0;
		while (low <= high) {
            mid=(low+high)/2;
            if(arr[mid]>find){
            	high=mid-1;
            }
            else{
            	low=mid+1;
            }
        }
        return low-1;
	}

}


/*int n=sc.nextInt(); int box=1; int count=0;
Map<Integer, Integer> mp=new TreeMap<Integer,Integer>();
for(int i=0;i<n;i++){
	int value=sc.nextInt();
	for(int j=0;j<value;j++){
		mp.put(++count, box);
	}
	box++;
}
int noq=sc.nextInt();
for(int i=0;i<noq;i++){
	int value=sc.nextInt();
	System.out.println(mp.get(value));
}

sc.close();*/
