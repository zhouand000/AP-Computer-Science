package fractioncalculator;

import java.util.Scanner;

/**
 * @author Andrew
 *
 */
public class FractionCalculator {
	
	// Creates Scanner
	Scanner reader;
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		// Creates FractionCalculator Object
		FractionCalculator fc = new FractionCalculator();
		
		// Creates Scanner
		fc.reader = new Scanner(System.in);
		
		// Gets input
		
	}
	
	/**
	 * @return a 
	 */
	public int readInput () {
		
		// Creates output variable
		int output;
		
		// Loops until a valid input is given
		do {
			
			System.out.print("Enter a number:\t");
			output = reader.nextInt();
			System.out.println();
			
		}
		while (output ==0);
		return output;
		
	}
}
