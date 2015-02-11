package guessinggame;

import java.util.Scanner;

public class AddingMachine {
	
	public static void main (String args[]) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Prompts for first number
		System.out.println("Enter the first number");
		System.out.print(":");
		int num1 = reader.nextInt();
		
		// Prompts for last number
		System.out.println("Enter the last number");
		System.out.print(":");
		int num2 = reader.nextInt();
		
		// Initializes total outside of loop so that it does not go out of scope
		
		int total = 0;
		
		// For loop to find the total
		for (int i = num1; i <= num2; i++) {
			total += i;
		}
		
		// Prints results
		System.out.println("First number: " + num1);
		System.out.println("Last number: " + num2);
		System.out.println("Total: " + total);
		
		// Closes Scanner
		reader.close();
		
	}
	
}
