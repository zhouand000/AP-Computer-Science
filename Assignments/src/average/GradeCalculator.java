package average;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class GradeCalculator {
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Index of double[] array
		int index;
		
		// Asks for the number of scores, which will be used as the array length
		System.out.print("Enter the number of scores: ");
		index = reader.nextInt();
		
		// Creates the array that will store the scores
		double[] array = new double[index];
		
		// Sum of all of the scores
		double total = 0;
		
		// Loops through and reads all the scores
		
		for (int i = 0; i < index; i++) {
			
			System.out.print("Enter the score: ");
			array[i] = reader.nextDouble();
			total += array[i];
			
		}
		
		// Prints average
		System.out.println("The average is: " + total / index);
		
		// Closes reader to prevent memory leaks
		reader.close();
		
		/*
		 * // Sorts the array, smallest to largest array = selectionSort(array);
		 */
		
		// Uses the sorted array and prints results
		System.out.println("The smallest number is: " + array[0]);
		System.out.println("The largest number is: " + array[array.length - 1]);
		
		// Prints the grades
		
	}
	
	public static void printGrade (double percent) {
		
		String output;
		
		if (percent >= 90) {
			output = "A";
		}
		else if (percent >= 80) {
			output = "B";
		}
		else if (percent >= 70) {
			output = "C";
		}
		else if (percent >= 60) {
			output = "D";
		}
		else if (percent >= 50) {
			output = "F";
		}
		else {
			output = "Invalid grade.";
		}
		
		System.out.println(output);
		
	}
	
	public static double[] selectionSort (double[] arr) {
		
		// Initializes variables used for sorting
		
		int smallIndex; // Index of the smallest number
		int pass; // Current sorting pass
		int j; // Index of smaller loop
		int length = arr.length; // Length of array
		double temp;
		
		// Loop.
		// The first pass finds the smallest, the second pass finds the second
		// smallest, etc.
		// Will not be affected by duplicates
		for (pass = 0; pass < (length - 1); pass++) {
			
			// Sets the index of the smallest to the current pass
			smallIndex = pass;
			
			// Finds the smallest element in the pass
			for (j = pass + 1; j < length; j++) {
				
				if (arr[j] < arr[smallIndex]) {
					
					smallIndex = j;
					
				}
				
			}
			// Switches the nth smallest number with the nth number
			temp = arr[pass];
			arr[pass] = arr[smallIndex];
			arr[smallIndex] = temp;
			
		}
		
		// Returns the array
		return arr;
		
	}
}
