package gridpathfinder;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class SimpleGridPathfinder {
	
	// Scanner Instance variable
	public Scanner reader;
	
	public static void main (String[] args) {
		
		// Creates SimpleGridPathFinder
		SimpleGridPathfinder pf = new SimpleGridPathfinder();
		
		// Initializes Scanner
		pf.reader = new Scanner(System.in);
		
		// Makes call and prints result
		System.out.println("There are " + pf.countPaths(pf.readInput(),pf.readInput()) + " paths.");
		
	}

	// Recursively counts paths
	public int countPaths (int street, int avenue) {
		
		// Uses ternary operator instead of if statement. Example of a place where it would be appropriate.
		return (street == 1 || avenue == 1 ? 1 : countPaths(street - 1, avenue) + countPaths(street, avenue - 1));
		
		
	}

	// Reads input
	public int readInput() {
		
		// Creates output variable
		int output;
		
		// Loops until a valid input is given
		do {
			
			System.out.print("Enter a number:\t");
			output = reader.nextInt();
			System.out.println();
			
		}
		while (output <=1);
		return output;
		
	}
		
	
}
