package dp;

public class CoinChange {

	public static void main(String[] args) {
		int i, j;
        int arr[] = {1,2,3};
        int m = arr.length;
        //here m is type of coins we have and 10 is the value which we need to create 
        //from those coins.
        System.out.println( count(arr, m, 4));
        System.out.println(getNumberOfWays(arr, m, 4));

	}
	// Returns the count of ways we can 
    // sum S[0...m-1] coins to get sum n
    static int count( int S[], int m, int n )
    {
        // If n is 0 then there is 1 solution (do not include any coin)
        if (n == 0)
            return 1;
         
        // If n is less than 0 then no solution exists
        if (n < 0)
            return 0;
     
        // If there are no coins and n is greater than 0, then no
        // solution exist
        if (m <=0 && n >= 1)
            return 0;
     
        // count is sum of solutions (i) 
        // including S[m-1] (ii) excluding S[m-1]
        System.out.println("current(S,m-1,n) : ("+S+","+(m-1)+","+n+")"+"count(S, m, n-S[m-1]): ("+S+","+m+","+(n-S[m-1])+")");
        return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
    }
    
    //As above we can see same problem we are evaluating again and again so we will use memoization to solve this
    public static int getNumberOfWays(int arr[],int m,int n){
    	int T[][]=new int[m+1][n+1];
    	for(int i=0;i<=m;i++){
    		T[i][0]=1;
    	}
    	for(int i=1;i<n;i++){
    		T[0][i]=0;
    	}
    	for(int i=1;i<=m;i++){
    		for(int j=1;j<=n;j++){
    			if(i>j)
    				T[i][j]=T[i-1][j];
    			else
    				T[i][j]=T[i-1][j]+T[i][j-i]; //Excluding the number and including the number
    		}
    	}
    	return T[m][n];    
    	}
}
