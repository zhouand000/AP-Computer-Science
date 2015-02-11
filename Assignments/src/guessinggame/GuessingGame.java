package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main (String[] args) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creates Random
		Random random = new Random(0);
		
		// Creates number to guess; the +1 is to move the range from [0,19] to
		// [1,20].
		int number = random.nextInt(20) + 1;
		
		// Just for testing
		// System.out.println(number);
		
		// Creates guess
		int guess = -1;
		
		// Sets number of attempts to 0
		int attempts = 0;
		
		// Loops until the guess is correct
		while (guess != number) {
			
			// Increments the counter
			attempts++;
			
			// Gets guess
			System.out.print("Guess a number:\n:");
			guess = reader.nextInt();
			
			// Gives information about guess
			if (guess > number) {
				System.out.println("Your guess was too high.");
			}
			else if (guess < number) {
				System.out.println("Your guess was too low.");
			}
			if (guess != number) {
				System.out.println("Try again.");
			}
			
		}
		
		// Prints out statistics
		System.out.println("Your guess was correct.");
		System.out.println("You guessed the number correctly after " + attempts + " attempts.");
		
		// Closes Scanner
		reader.close();
		
	}
}
