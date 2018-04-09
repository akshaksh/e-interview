package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DiscoverMonk {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); int noq=sc.nextInt();
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<n;i++){
			set.add(sc.nextInt());
		}
		for(int i=0;i<noq;i++){
			if(set.contains(sc.nextInt()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	

}

/*This is another way and most efficient way to solve above problem
 * public static void main(String[] args) throws FileNotFoundException {
	Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
	int n=sc.nextInt(); int noq=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<noq;i++){
		int x=sc.nextInt();
		System.out.println(checkExistance(x,arr));
	}
	sc.close();
}

public static String checkExistance(int x,int arr[]){
	int low=0;int high=arr.length-1; int mid=0; boolean found=false;
	while(low<=high){
		mid=(low+high)/2;
		if(arr[mid]>x)
			high=mid-1;
		else if(arr[mid]<x)
			low=mid+1;
		else
			{found=true; break;}
	}
	if(found)
		return "YES";
	else
		return "NO";
}*/



/*Another way
Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
int n=sc.nextInt(); int noq=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++){
	al.add(sc.nextInt());
}
Collections.sort(al);
for(int i=0;i<noq;i++){
	if((Collections.binarySearch(al, sc.nextInt()))>=0)
		System.out.println("YES");
	else
		System.out.println("NO");
}
sc.close();
*/