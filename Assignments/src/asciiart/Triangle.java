package asciiart;

import java.util.Scanner;

public class Triangle {
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Initializes width
		int width;
		
		// Gets input, and ensures that width is at least 1
		do {
			
			System.out.print("Enter the width: \n:");
			width = reader.nextInt();
			
		}
		while (width < 2);
		
		// Loops through, creating the first half
		for (int i = 0; i < width - 1; i++) {
			
			// Creates a row
			for (int j = 0; j < i; j++) {
				
				// Prints question marks
				System.out.print("?");
				
			}
			
			// Prints #'s
			System.out.println("#");
			
		}
		
		// Loops through, creating the second half
		for (int i = width - 1; i > 0; i--) {
			
			// Creates a row
			for (int j = 0; j < i; j++) {
				
				// Prints question marks
				System.out.print("?");
				
			}
			
			// Prints #'s
			System.out.println("#");
			
		}
		reader.close();
		
	}
	
}
