package asciiart;

import java.util.Scanner;

public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initializes Scanner
		Scanner reader = new Scanner(System.in);
		
		// Initializes width
		int width;
		
		// Gets input, and ensures that width is at least 2
		do {
		System.out.print("Enter the width: \n:");
		width = reader.nextInt();
		}
		while(width < 2);
		// 7 tall
		for (int i = 1; i <= 7; i++){
			
			// Asterisk at beginning
			System.out.print("*");
			
			// Adds '#'s
			for (int j = 0; j < width-2; j++){
				
				System.out.println("#");
				
			}
			
			// Asterisk at end
			System.out.print("*");
		
		}
		
		// Closes Scanner
		reader.close();
		
	}

}
