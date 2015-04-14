package examples.loops.primegenerator;

@SuppressWarnings("javadoc")
public class PrimeGenerator {
	
	public static void main (String[] args) {
		
		// Limit of search
		int limit = 100;
		
		// Initializes array of primes, the 101 is so that the coding is easier
		boolean[] compositeArray = new boolean[limit + 1];
		
		// Assumes all numbers are not composite until proven composite. If
		// true, then composite.
		
		// Marks 1 as not a prime
		compositeArray[1] = true;
		
		// Initializes primesFound
		short primesFound = 0;
		
		for (short i = 2; i <= limit; i++) {
			
			// If the element at index i is false, then i is a prime
			if (!compositeArray[i]) {
				
				// Increment primesFound
				primesFound++;
				
				// Print out that i is Prime
				System.out.println(i + " is Prime.");
				
				// Flag the multiples of i as Composite
				for (short j = i; i * j <= limit; j++) {
					
					// Flag the element at index i*j as Composite
					compositeArray[i * j] = true;
					
				}
				
			}
			else {
				
				// Print out "i is Composite"
				System.out.println(i + " is composite.");
				
			}
			
		}
		
		// Print out statistics
		System.out.println("There are " + primesFound + " primes less than "
				+ limit + ".");
		
	}
	
}
