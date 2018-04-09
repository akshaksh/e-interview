package hackerearth.algorithms.dynamicprogram2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TotalCost {

	static int weight[][]=null;
	static int cost[][]=null;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int n=sc.nextInt(); int m=sc.nextInt(); weight=new int[n][m]; cost=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				weight[i][j]=sc.nextInt();
			}
		}
		int sum1=0;int sum2=0;
		for(int i=0;i<m;i++){
			Arrays.fill(cost[i],-1);
		}
		for(int i=0;i<n;i++){
			sum1+=weight[0][i];
			sum2+=weight[i][0];
			cost[0][i]=sum1;
			cost[i][0]=sum2;
		}
		int queries=sc.nextInt();
		while(queries-- > 0){
			int x=sc.nextInt();int y=sc.nextInt();
			//Below commented code is required if we are going through loop
			/*for(int i=1;i<x;i++){
				for(int j=1;j<y;j++){
					cost[i][j]=weight[i][j]+cost[i-1][j]+cost[i][j-1]-cost[i-1][j-1];
				}
			}*/
			getSum(x-1,y-1);
			System.out.println(cost[x-1][y-1]);
		}
		sc.close();

	}
	public static int getSum(int x, int y){
		if(x<1 && y<1)
			return weight[0][0];
		else if(cost[x][y] != -1){
			return cost[x][y];
		}
		else
		return cost[x][y]=weight[x][y]+getSum(x-1,y)+getSum(x,y-1)-cost[x-1][y-1];
		
	}

}



/*this will also work but takes time so much
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); int m=sc.nextInt(); int cost[][]=new int[n][m];
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cost[i][j]=sc.nextInt();
		}
	}
	int queries=sc.nextInt(); int sum=0;
	while(queries-- > 0){
		sum=0;
		int x=sc.nextInt();int y=sc.nextInt();
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				sum+=cost[i][j];
			}
		}
		System.out.println(sum);
	}
	sc.close();

}*/