package hackerearth.algorithms;

import java.util.Scanner;

public class PoliceManAndTheives {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		 
        int t = input.nextInt();
 
        while (t-->0){
            long result = 0;
            try{
                int n = input.nextInt();
                int k = input.nextInt();
                
                input.nextLine();
 
                for(int i=0;i<n;i++){
 
                    int[] arr = new int[n];
                    String data = input.nextLine();
                    int j = 0;
 
                    for(String p : data.split(" ")){
                        if(p.equals("P")) arr[j++]=1;
                        else if(p.equals("T")) arr[j++]=0;
                    }
 
                    result += catchThieves(arr, k);
                }
 
                
            }catch (Exception e){
                
            }finally {
                System.out.println(result);
            }
        }
    }
 
    private static long catchThieves(int[] arr, int k) {
        long res = 0;
 
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                int start = i-k < 0? 0: i-k;
                int end = i+k > arr.length-1? arr.length-1: i+k;
 
                for(int j = start; j<= end; j++){
                    if(arr[j] == 1) {
                        arr[j]=9;
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+",");
        }
        System.out.println();
        return res;
	}
	
}
