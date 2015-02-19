package numberrecursion;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class Reverser {
	
	// Creates reader
	Scanner reader;
	
	public static void main (String[] args) {
		
		// Creates reverser
		Reverser rv = new Reverser();
		
		// Initializes reader
		rv.reader = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		// Function Call
		System.out.println("\nThe reversed number is "
				+ rv.reverse(rv.reader.nextLine()));
		
	}
	
	// Will reverse the String
	public String reverse (String str) {
		
		// Uses ternary operator to check if halting condition is met
		return str.length() > 0 ? str.charAt(str.length() - 1)
				+ reverse(str.substring(0, str.length() - 1)) : "";
		
	}
	
}
