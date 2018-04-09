package hackerearth.sortingalgorithms.bubblesortprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BennyAndSegment {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[n][2];
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int check = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[j][0] >= arr[i][0] && arr[j][1] >= arr[i][1]){
                        if(arr[j][1]-arr[i][0]==k){
                        	System.out.println(arr[j][1]);
                        	System.out.println(arr[i][0]);
                            System.out.println("Yes");
                            check++;
                            break;
                        }                    
                    }
                }
                if(check!=0){
                    break;
                }
            }
            if(check==0){
                System.out.println("No");
            }
        }
        sc.close();
	}

}

/*
 * Solution Explanation: Here it will work like will take two two pair and check whether both co-ordinate of second pair must be larger than the first
 * and then we will find out the difference between start point of the first co-ordintate and rnd point of the 2nd co-ordinate  
 */