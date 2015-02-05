package arrays;

import java.util.Scanner;

public class SpeedingStatistics {

	public static void main(String[] args) {

		// Initializes reader
		Scanner reader = new Scanner(System.in);

		// Initializes array
		double[] speedArray = new double[10];

		// Fills array with inputs
		for (int i = 0; i < 10; i++) {

			// Sets element i to input
			System.out.println("Input speed: \n:");
			speedArray[i] = reader.nextDouble();

		}

		// Sorts speedArray
		speedArray = selectionSort(speedArray);

		// Prints highest element
		System.out.println("The highest speed is: " + speedArray[9]);

		// Prints lowest element
		System.out.println("The lowest speed is: " + speedArray[0]);

		// Initializes total
		double total = 0;

		// Gets average
		for (int i = 0; i < 10; i++) {

			// Adds the speed at index i to total
			total += speedArray[i];

		}

		// Prints average
		System.out.println("The average speed is: "
				+ (double) ((double) total / 10f));

		// Gets the number of people with a speed 0-10 over, etc.
		System.out.println("The number of people with a speed 0-10 uph over the speed limit is: " + numberInRange(55, 65, speedArray));
		System.out.println("The number of people with a speed 10-20 uph over the speed limit is: " + numberInRange(65, 75, speedArray));
		System.out.println("The number of people with a speed 20 uph or greater over the speed limit is: " + numberInRange(55, Integer.MAX_VALUE, speedArray));
		
		// Closes reader
		reader.close();
	}

	public static int numberInRange(int low, int high, double[] array) {
		
		// Initializes number
		int number = 0;
		for (int i = 0; i < 10; i++) {

			// Checks if the element is above or equal to low and lower or equal to high
			if (array[i] >= low && array[i] <= high) {
				
				number++;
				
			}

		}
		
		return number;
		
	}

	public static double[] selectionSort(double[] arr) {

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
