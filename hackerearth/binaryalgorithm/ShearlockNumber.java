package hackerearth.algorithms.binaryalgorithm;

import java.util.Scanner;

public class ShearlockNumber {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int t=0; t<T; t++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int c = 0;
        for(int i=0;i<k;i++){
            if(sc.nextInt()<=p+c)c++;
        }
        if(p+k<=n) System.out.println(p+c);
        else System.out.println(-1);
    }   
    sc.close();
	}

}
