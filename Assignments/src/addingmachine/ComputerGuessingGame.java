package guessinggame;

import java.util.Random;

// import java.util.Scanner;

@SuppressWarnings("javadoc")
public class ComputerGuessingGame {
	
	public static void main (String[] args) {
		
		// Scanner not necessary
		
		// Creates Random
		Random random = new Random(0);
		
		System.out.println("The JVM will do the guessing.");
		
		// Creates number to guess; the +1 is to move the range from
		// [0,upperLimit-1] to [1,upperLimit].
		int number = random.nextInt(20) + 1;
		
		// Just for testing
		// System.out.println(number);
		
		// Creates guess
		int guess;
		
		// Sets number of attempts to 0
		int attempts = 0;
		
		// Loops until the guess is correct
		
		do {
			// Increments the counter
			attempts++;
			guess = random.nextInt(20);
			System.out.println("Guess a number:\n:" + guess);
			if (guess > number) {
				System.out.println("The guess was too high.");
			}
			else if (guess < number) {
				System.out.println("The guess was too low.");
			}
			if (guess != number) {
				System.out.println("Try again.");
			}
			
		}
		while (guess != number);
		
		// Prints out statistics
		System.out.println("The JVM's guess was correct.");
		System.out.println("The JVM guessed the number correctly after "
				+ attempts + " attempts.");
		
	}
	
}
