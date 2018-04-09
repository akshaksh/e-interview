package hackerearth.algorithms.dynamicprogram2d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class StringPermutationGenerator {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter a string: ");
	        String string = scanner.nextLine();
	        Set<String> permutations = generatePermutations(string);
	        System.out.println("Here are the unique permutations of " + string);
	        System.out.println(Arrays.toString(permutations.toArray()));
	        scanner.close();
	 }
	 // Generate all permutations of a string in Java
	    private static Set<String> generatePermutations(String input) {
	        input = input.toLowerCase();
	        Set<String> result = new HashSet<>();
	        permutations("", input, result);
	        return result;
	    }
	    // Recursive function for generating permutations
	    // Each call contains the left side of a valid permutation and remaining characters
	    private static void permutations(String prefix, String letters, Set<String> result) {
	        if (letters.length() == 0) {
	            result.add(prefix);
	        } else {
	            for (int i = 0; i < letters.length(); i++) {
	                String letter = letters.substring(i, i + 1);
	                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
	                permutations(prefix + letter, otherLetters, result);
	            }
	        }
	    }
}
