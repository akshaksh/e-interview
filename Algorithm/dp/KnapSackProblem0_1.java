package dp;


public class KnapSackProblem0_1 {

	public static void main(String[] args) {
			int wt[]={1,2,3,4,5};
			int value[]={1,4,4,5,7};
			int length=wt.length;
			int W=9;
			int arr[][]=new int[length+1][W+1];
			int max=-1;
			//This is how DP works to save time we keep result in an array.
			for(int i=0;i<=length;i++){
				for(int j=0;j<=W;j++){
					if(i==0 || j==0)
						arr[i][j]=0;
					else if(wt[i-1]<=j)
						arr[i][j]=Math.max(arr[i-1][j], arr[i-1][j-wt[i-1]]+value[i-1]);
					else
						arr[i][j]=arr[i-1][j];
					
					if(max<arr[i][j])
						max=arr[i][j];
					
				}
			}
			System.out.println(max);
			System.out.println(getMaxValue(W,wt,value,length));
	}
	
	//this works in Top-Bottom fashion but this is only recursion not DP
	//In below recursion no sub problems are overlapping thats why we don't need to keep table in below solution
	public static int getMaxValue(int W,int wt[],int val[],int n){
		System.out.println("(W,n): "+W+", "+n);
		if(n==0 || W==0)
			return 0;
		else if(wt[n-1]>W)
			return getMaxValue(W,wt,val,n-1);
		else
			return Math.max(getMaxValue(W,wt,val,n-1),getMaxValue(W-wt[n-1],wt,val,n-1)+val[n-1]);
	}
}
