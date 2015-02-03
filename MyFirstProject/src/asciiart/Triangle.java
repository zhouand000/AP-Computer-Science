package asciiart;
import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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

		// Loops through
		for (int i = 0; i < 2 * width - 1; i++) {

			// Creates a row
			for (int j = 0; j < i; j++){
				
				// Prints question marks
				System.out.print("?");
				
			}
			
			// Prints #'s
			System.out.println("#");
			
		}
		
		reader.close();
		
	}

}
