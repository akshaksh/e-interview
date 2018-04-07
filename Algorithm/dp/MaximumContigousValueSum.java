package dp;

public class MaximumContigousValueSum {

	public static void main(String[] args) {
		int arr[]={1,-3,4,-2,-1,6};
		System.out.println(getMaximumContSum(arr));
		//System.out.println(getMaximumContSumNegativeNumber(new int[]{-4,-2,-6,-7,-1,-3,-5,-9,-8}));
	}
	//Below thing will work if some values are +ve and some -ve and if all -ve then it will give 0
	public static int getMaximumContSum(int arr[]){
		int maxsum=0; int sum=0; String str="";
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(sum<0){
				sum=0;
				str="";
				continue;
			}
			else{
				str=str+arr[i]+", ";
			}
			if(sum>maxsum)
				maxsum=sum;
		}
		System.out.println(str);
		return maxsum;
	}
	
	//if all numbers are -ve then we need to see increment like -4,-3,-1 etc..
	/*public static int getMaximumContSumNegativeNumber(int arr[]){
		int maxsum=arr[0]; int sum=arr[0]; String str="";
		for(int i=1;i<arr.length;i++){
			sum=sum-arr[i];
			if(sum>0){
				sum=arr[i];
				str="";
				continue;
			}
			else{
				str=str+arr[i]+", ";
			}
			if(sum>maxsum)
				maxsum=sum;
		}
		System.out.println(str);
		return maxsum;
	}
	*/
	
	
}
