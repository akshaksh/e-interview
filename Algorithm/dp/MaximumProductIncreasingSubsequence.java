package dp;


public class MaximumProductIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 3, 100, 4, 5, 150, 6};
		 int[] mpis = new int[arr.length];

	        for (int i = 0; i < arr.length; i++)
	            mpis[i] = arr[i];
	        for (int i = 1; i < arr.length; i++)
	            for (int j = 0; j < i; j++)
	                if (arr[i] > arr[j] && mpis[i] 
	                         < (mpis[j] * arr[i]))
	                    mpis[i] = mpis[j] * arr[i];
	        
	        System.out.println("List");
	        for(int ar:mpis){
	        	System.out.print(ar+" ");
	        }
			}
		
}
