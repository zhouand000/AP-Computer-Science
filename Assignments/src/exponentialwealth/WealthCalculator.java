package exponentialwealth;

@SuppressWarnings("javadoc")
public class WealthCalculator {
	
	public static void main (String[] args) {
		
		// Initializes wealth and week
		int wealth = 50000;
		int week = 0;
		
		// Loop to calculate wealth over time
		do {
			
			// Increments week
			week++;
			
			// Doubles wealth
			wealth *= 2;
			
			// Prints out information
			System.out.println("Week: " + week);
			System.out.println("Wealth: " + wealth);
			
		}
		while (wealth <= 100000000);
		
		// Prints out information
		System.out.println("After " + week
				+ " weeks, the founder will have over 100 million dollars.");
		
	}
	
}
