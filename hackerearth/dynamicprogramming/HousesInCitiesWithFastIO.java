package hackerearth.algorithms.dynamicprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class HousesInCitiesWithFastIO {

	public static void main(String[] args) throws IOException {
		//long starttime=System.currentTimeMillis();
		//BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\ajku0717\\Desktop\\input.txt")));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++){
			int n=Integer.parseInt(br.readLine()); int k=0; long sum[]=new long[n];
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens())
			{
				if(k==0)
					sum[k]=Long.parseLong(st.nextToken().trim());
				else{
					sum[k]=Long.parseLong(st.nextToken().trim())+sum[k-1];
				}
				k++;
			}
			int queries=Integer.parseInt(br.readLine());
			for(int j=0;j<queries;j++){
				int start=0; int end=0;
				st= new StringTokenizer(br.readLine()," ");
				start=Integer.parseInt(st.nextToken());
				end = Integer.parseInt(st.nextToken());
				start--;end--;
				if(start>0)
				bw.write(Long.toString(sum[end]-sum[start-1]));
				else
					bw.write(Long.toString(sum[end]));
				bw.newLine();
			}
			
		}
		bw.close();
		br.close();

	}

}


/*public static void main(String args[]) throws NumberFormatException, IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int T=Integer.parseInt(br.readLine());
	for(int t=0;t<T;t++) {
		int N = Integer.parseInt(br.readLine());
		long[] a = new long[N];
		long[] sum = new long[N];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int i=0;
		while(st.hasMoreTokens())
		{
			a[i++]=Integer.parseInt(st.nextToken().trim());
		}
		sum[0]=a[0];

		for(i=1;i<N;i++)
		{
			sum[i]=sum[i-1]+a[i];
		}
		int Q=Integer.parseInt(br.readLine());
		for(i=0;i<Q;i++)
		{
			st= new StringTokenizer(br.readLine()," ");
			int start=Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			long numberOfCities = 0;
			if((start-2)>-1)
				numberOfCities=sum[end-1]-sum[start-2];
			else
				numberOfCities=sum[end-1];
			bw.write(Long.toString(numberOfCities));
			bw.newLine();
		}
		bw.flush();
	}
}*/