package arrays;

import java.util.Scanner;
import java.util.Random;

public class NumberList {
	
	public static void main(String[] args){
		
		// Creates Scanner and Random objects
		Scanner reader = new Scanner(System.in);
		Random random = new Random(0);
		
		// Creates array
		int[] numbers = new int[100];
		
		// Fills array
		for (int i = 0; i < 100; i++) {
			
			// Sets element i in numbers to a value from [1,100]; the + 1 is to move it from [0,99]
			numbers[i] = random.nextInt(100) + 1;
			
		}
		
		// Sorts array
		numbers = selectionSort(numbers);
		
		// Initializes count
		int[] count = new int[100];
		
		// Counts numbers
		for (int i = 0; i < 100; i++){
			
			count[numbers[i]]++;
			
		}
		
		// TODO print in order, print in reverse, print how many of each
		
		// Closes reader
		reader.close();
		
	}
	
	public static int[] selectionSort(int[] arr) {

		// Initializes variables used for sorting

		int smallIndex; // Index of the smallest number
		int pass; // Current sorting pass
		int j; // Index of smaller loop
		int length = arr.length; // Length of array
		int temp;

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
