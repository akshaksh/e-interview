package hackerearth.algorithms.dynamicprogram2d;

public class GCDofTwonumbers {

	// extended Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
 
// Driver Program
    public static void main(String[] args)
    {
        int a = 3, b =3, g;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
         
        a = 35; b = 10;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
         
        a = 31; b = 2;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
 
    }

}
