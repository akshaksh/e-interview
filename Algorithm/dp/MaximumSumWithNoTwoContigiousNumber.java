package dp;

public class MaximumSumWithNoTwoContigiousNumber {

	public static void main(String[] args) {
		
		int arr[]={5, 5, 10, 100, 10, 5};
		int M[]=new int[arr.length];
		M[0]=arr[0];
		M[1]=Math.max(arr[0],arr[1]);
		//Without two consecutive numbers selection
		for(int i=2;i<arr.length;i++){
			M[i]=Math.max(arr[i]+M[i-2],M[i-1]);
		}
		System.out.println(M[arr.length-1]);
	}

}
