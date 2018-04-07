package dp;

public class LongestCommonSubsequence {
	static int cache[][]=null;
	static int bottomup[][]=null;
	static int counter=0;
	public static void main(String[] args) {
		String str1="ABCDGH";
		String str2="AEDFHR";
		int len1=str1.length();
		int len2=str2.length();
		cache=new int[len1][len2];
		bottomup=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++)
			bottomup[0][i]=0;
		for(int j=0;j<=len2;j++)
			bottomup[j][0]=0;
		
		for(int i=0;i<cache.length;i++){
			for(int j=0;j<cache[i].length;j++){
				cache[i][j]=-1;
			}
		}
		int length=getLongestCommonSequence(str1,str2,0,0,len1,len2);
		System.out.println(length);
		System.out.println(counter);
		getLCS(str1,str2,len1,len2);
		System.out.println(getTopBottom(str1,str2,len1,len2));
		System.out.println("Check it");
	}
	//Below is one of the way for memoization just save it in some array and return it whenever we needed
	public static int getLongestCommonSequence(String X,String Y,int i,int j,int n,int m){
		counter++;
		if(i==n || j==m)
			return 0;
		if(cache[i][j] != -1)
			return cache[i][j];
		else if(X.charAt(i) == Y.charAt(j))
			return cache[i][j]=1+getLongestCommonSequence(X, Y, i+1, j+1, n, m);
		else
			return cache[i][j]=Math.max(getLongestCommonSequence(X, Y, i+1, j, n, m), getLongestCommonSequence(X, Y, i, j+1, n, m));
	}
	
	//Below is another way of doing memoization which will contain all the values already and then we will use this 2-D array.
	public static void getLCS(String X, String Y,int m,int n){
		int arr[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			arr[i][n]=0;
		for(int j=0;j<=n;j++)
			arr[m][j]=0;
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				arr[i][j]=arr[i+1][j+1];
				if(X.charAt(i) == Y.charAt(j))
					arr[i][j]++;
				if(arr[i][j+1]>arr[i][j])
					arr[i][j]=arr[i][j+1];
				if(arr[i+1][j]>arr[i][j])
					arr[i][j]=arr[i+1][j];
			}
		}
		System.out.println("Now printig the sequence also");
		String str=""; int i=0;int j=0;
		while (i <m && j<n)
        {
            if (X.charAt(i) == Y.charAt(j))
            {
            	str=str+X.substring(i,i+1);
            	System.out.println("midiile:"+str);
                i++; 
                j++; 
            }
            else if (arr[i][j+1] > arr[i+1][j])
                j++;
            else
                i++;
        }
		System.out.println("sequence :"+str);

	}
	
	//Below is another way of doing memoization which will contain all the values already and then we will use this 2-D array.
	// Using Top-bottom through recurrsion
	public static int getTopBottom(String X,String Y,int m,int n){
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(X.charAt(i-1)==Y.charAt(j-1))
					bottomup[i][j]=bottomup[i-1][j-1]+1;
				else
					bottomup[i][j]=Math.max(bottomup[i-1][j], bottomup[i][j-1]);
			}
		}
		System.out.println("Now printig the sequence also");
		String str=""; int i=m;int j=n;
		while (i > 0 && j > 0)
        {
            if (X.charAt(i-1) == Y.charAt(j-1))
            {
            	str=str+X.substring(i-1,i);
            	System.out.println("midiile:"+str);
                i--; 
                j--; 
            }
  
            else if (bottomup[i-1][j] > bottomup[i][j-1])
                i--;
            else
                j--;
        }
		System.out.println("sequence :"+str);
		return bottomup[m][n];
	}
}
