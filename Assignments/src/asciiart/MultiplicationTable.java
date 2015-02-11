package asciiart;

public class MultiplicationTable {
	
	public static void main (String[] args) {
		
		// Prints a blank line
		printBlankLine();
		
		// Special case; will print out the row
		System.out.print("\n    |");
		for (int i = 1; i <= 12; i++) {
			
			System.out.print(" " + String.format("%5d", i) + " ");
			
		}
		
		printBlankLine();
		// Adds newline
		System.out.println("");
		// Prints the body
		for (int i = 0; i < 12; i++) {
			
			// Prints the appropriate line
			System.out.println(getLine(i + 1));
			
		}
		
	}
	
	// Will get the string for a line
	public static String getLine (int row) {
		
		// Creates String to output
		String output;
		// Checks if row has >1 digit and compensates
		if ((row) / 10 >= 1) {
			output = (row + "  |");
		}
		else {
			output = (row + "   |");
		}
		// Adds the numbers in the table body
		for (int i = 1; i <= 12; i++) {
			
			// Concatenates the numbers to output
			output = output.concat(String.format(" " + "%5d", row * i) + " ");
			
		}
		
		// Returns output
		return output;
		
	}
	
	// Prints a line to divide the rows
	public static void printBlankLine () {
		
		// First part before the +
		System.out.print("\n\u2014\u2014\u2014\u2014");
		System.out.print("+");
		// Loops through and prints the rest
		for (int i = 0; i < 89; i++) {
			
			System.out.print("\u2014");
			
		}
		
	}
	
}
