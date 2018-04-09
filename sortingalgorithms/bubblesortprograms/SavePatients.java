package hackerearth.sortingalgorithms.bubblesortprograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SavePatients {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		boolean flag=false;
		int n=sc.nextInt(); int patients[]=new int[n];int vaccine[]=new int[n];
		for(int i=0;i<n;i++)
			vaccine[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			patients[i]=sc.nextInt();
		//Arrays.sort(vaccine);
		//Arrays.sort(patients);
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				int temp=0;
				if(vaccine[j]>vaccine[j+1]){
					temp=vaccine[j];
					vaccine[j]=vaccine[j+1];
					vaccine[j+1]=temp;
				}
				if(patients[j]>patients[j+1]){
					temp=patients[j];
					patients[j]=patients[j+1];
					patients[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(patients[i]>vaccine[i])
			{
				flag=true; break;
			}
		}
		if(flag)
			System.out.println("No");
		else
			System.out.println("Yes");
		sc.close();

	}
	
}
