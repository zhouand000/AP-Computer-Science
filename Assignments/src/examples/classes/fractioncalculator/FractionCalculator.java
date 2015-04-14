package examples.classes.fractioncalculator;

import java.util.Scanner;

/**
 * Contains main
 * 
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
		
		// Creates Fraction object
		Fraction f = new Fraction();
		
		// Creates Scanner
		fc.reader = new Scanner(System.in);
		
		// Sets numerator and denominator
		f.setNumerator(fc.readInput());
		f.setDenominator(fc.readInput());
		
		// Gets input and prints result
		System.out.println("f = " + f);
		System.out.println("f = " + f.toDouble());
		
	}
	
	/**
	 * Returns a number
	 * 
	 * @return a number
	 */
	public int readInput () {
		
		// Creates output variable
		int output;
		
		// Loops until a valid input is given
		do {
			
			System.out.print("\nEnter a number:\t");
			output = reader.nextInt();
			System.out.println();
			
		}
		while (output == 0);
		return output;
		
	}
}
