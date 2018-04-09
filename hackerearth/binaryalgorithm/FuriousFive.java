package hackerearth.algorithms.binaryalgorithm;


public class FuriousFive {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		long num[]=new long[testcase];
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextLong();
		}
		for(int i=0;i<num.length;i++){
			System.out.println(5*num[i]);
		}
		sc.close();*/
		long num=1l; int counter=0;
			while(counter<=12209179){
				if(num%5==0){
					counter++;
				}
				num++;
			}
			System.out.println(num);
	}

}
