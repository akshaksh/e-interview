package hackerearth.algorithms.dynamicprogram2d;

public class GenerateAllSubset {
    public static void main(String[] args)
    {
    	int arr[] = {90,64,31,17,27,65,57,33,41,34,75,19,7,2,76,44,74,29,22,81,33,46,72,37,54,74,16,2,69,8,70,82,87,80,11,82,19,8,44,28,34,10,40,29,63,80,47,28,100,26,11,71,43,70,45,15,23,37,42,7,78,10,44,58,60,96,80,62,89,37,71,3,51,78,97,49,5,50,93,76,100,40,92,78,52,44,11,36,2,40,82,75,55,55,48,79,66,3,66,89};
    	int counter=0;
        for(int i=0;i<Math.pow(2, arr.length);i++){
        	String str=getBinaryNumber(i);
        	if(str.length()<arr.length)
        	{
        		int length=arr.length-str.length();
        		for(int k=0;k<length;k++){
        			str="0"+str;
        		}
        	}
        	String message="";
        	for(int j=0;j<arr.length;j++){
        		int val=Integer.parseInt(str.substring(j,j+1))*arr[j];
        		if(val>0)
        			{
        				if(!message.isEmpty())
        				message+=","+val;
        				else
        				message+=val;
        			}
        	}
        	if(!message.isEmpty()){
        		String splits[]=message.split(",");
        		int arrlist[]=new int[splits.length];
        		for(int k=0;k<splits.length;k++){
        			arrlist[k]=Integer.parseInt(splits[k]);
        		}
        		int result = arrlist[0];
        		for(int k=1;k<arrlist.length;k++)
                {
            		result = gcd(arrlist[k], result);
            		if(result==1)
            			counter++;
                }
        	}
        }
        System.out.println(counter);
    }
    public static String getBinaryNumber(int num){
    	return Integer.toBinaryString(num);
    }
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
}
