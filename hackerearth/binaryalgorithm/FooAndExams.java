package hackerearth.algorithms.binaryalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class FooAndExams {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\ajku0717\\Desktop\\input.txt"));
		int testcase=sc.nextInt();
		BigInteger a=null,b=null,c=null,d=null,k=null;
		for(int i=0;i<testcase;i++){
			a=sc.nextBigInteger();b=sc.nextBigInteger();c=sc.nextBigInteger();d=sc.nextBigInteger();k=sc.nextBigInteger();
			System.out.println(getStudyHour(a,b,c,d,k));
		}
		sc.close();

	}
	
	public static long getStudyHour(BigInteger a, BigInteger b, BigInteger c,BigInteger d,BigInteger k){
		long t=1; double evaluation=0.0;
		t=(long) Math.cbrt(k.doubleValue()/a.doubleValue())+1;
		while(true){
			evaluation=(a.doubleValue()*(Math.pow(t,3)) + b.doubleValue()*(Math.pow(t, 2)) + c.doubleValue()*(Math.pow(t, 1)) +d.doubleValue());
			if(evaluation<=k.doubleValue() || t==0)
				{break;}
			t--;
		}
		return t;
	}

}

/*
Here we have used the concept of upper bound O(n)  

*/