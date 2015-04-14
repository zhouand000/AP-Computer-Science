package examples.loops.asciiart;

@SuppressWarnings("javadoc")
public class AsteriskTriangles {
	
	public static void main (String[] args) {
		
		// Loops 3 times
		for (short i = 1; i <= 3; i++) {
			
			// Loops 3 times
			for (short j = 1; j <= 3; j++) {
				
				// Prints an asterisk
				System.out.print("*");
				
			}
			
			// Adds newline
			System.out.println();
			
		}
		
	}
	
}
