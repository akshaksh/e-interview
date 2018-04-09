package hackerearth.algorithms.dynamicprogramming;

public class BeerProblem {
	static int n=0;
	static int arr[]={2,3,5,1,4};
	static int cache[][]=new int[arr.length][arr.length];
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				cache[i][j]=-1;
			}
		}
		int proft=profit(0,n-1);
		System.out.println(proft);
		System.out.println(System.currentTimeMillis());
	}
	static int profit(int be, int en) {
        if (be > en)
          return 0;
        // (en-be+1) is the number of unsold wines
     // these two lines save the day
        if (cache[be][en] != -1)
          return cache[be][en];
        int year = n - (en-be+1) + 1; // as in the description above
        return cache[be][en]=Math.max(
          profit(be+1, en) + year * arr[be],
          profit(be, en-1) + year * arr[en]);
      }

}
