package numberrecursion;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class PowerOperation {
	
	// Creates scanner instance variable
	Scanner reader;
	
	public static void main (String[] args) {
		
		// Creates PowerOperation
		PowerOperation op = new PowerOperation();
		
		// Initializes reader
		op.reader = new Scanner(System.in);
		
		// Gets input
		System.out.print("Base:\t\t");
		double base = op.reader.nextDouble();
		System.out.print("\nExponent:\t");
		int exponent = op.reader.nextInt();
		
		// Makes call and prints
		System.out.println(base + "^" + exponent + " = "
				+ op.power(base, exponent));
		
	}
	
	// Actual power method
	public double power (double base, int exponent) {
		
		return exponent != 0 ? power(base, exponent > 0 ? exponent - 1
				: exponent + 1)
				* (exponent > 0 ? base : (double) 1d / base) : 1;
		
	}
	
}
