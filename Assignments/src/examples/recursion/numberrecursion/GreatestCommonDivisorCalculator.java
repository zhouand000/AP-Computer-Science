package examples.recursion.numberrecursion;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class GreatestCommonDivisorCalculator {
	
	// Creates Scanner
	Scanner reader;
	
	public static void main (String[] args) {
		
		// Creates an instance of GreatestCommonDivisorCalculator
		GreatestCommonDivisorCalculator calc = new GreatestCommonDivisorCalculator();
		
		// Initializes Scanner
		calc.reader = new Scanner(System.in);
		
		// Calls gcd method and prints
		System.out
				.println("The GCD is: "
						+ calc.getGreatestCommonDivisor(calc.readInt(),
								calc.readInt()));
		
	}
	
	// Reads an int
	public int readInt () {
		
		// Initializes output variable
		int output;
		
		// Gets input
		do {
			
			System.out.print("Please enter a positive integer: ");
			output = reader.nextInt();
			
		}
		while (output <= 0);
		return output;
		
	}
	
	// Uses Euclid's Algorithm to find the GCD
	public int getGreatestCommonDivisor (int numberX, int numberY) {
		
		// Initializes remainder variable
		int remainder = -1;
		
		// Loops until remainder == 0
		do {
			
			remainder = numberX % numberY;
			
			// Checks if the stopping condition is met
			if (remainder != 0) {
				
				numberX = numberY;
				numberY = remainder;
				
			}
			
		}
		while (remainder != 0);
		
		// Returns the GCD
		return numberY;
		
	}
	
}
