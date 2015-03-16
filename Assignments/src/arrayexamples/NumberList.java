package arrayexamples;

import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("javadoc")
public class NumberList {
	
	// Initializers
	// Creates Scanner and Random objects
	Scanner reader = new Scanner(System.in);
	
	Random random = new Random(0);
	
	// Creates arrays
	Integer[] numbers = new Integer[100];
	
	// Initializes count and set every value to 0
	int[] count = new int[numbers.length];
	
	String[] countOutput = new String[numbers.length];
	
	{
		for (int i : count) {
			
			count[i] = 0;
			
		}
	}
	
	public static void main (String[] args) {
		
		NumberList nl = new NumberList();
		nl.run();
		
	}
	
	public static String tmp (int i) {
		
		return (i % 10 == 9 && i != 0 ? "\n" : "\t");
	}
	
	public void count () {
		
		// Counts numbers
		for (int i : numbers) {
			
			count[i]++;
			
		}
		
	}
	
	public void initCountOutputArray () {
		
		// This is the array that will get printed out
		
		for (int i = 0; i < numbers.length; i++) {
			
			countOutput[i] = "There "
					+ (count[i] > 1 || count[i] == 0 ? "are " : "is one ")
					+ (count[i] == 1 ? "" : (count[i] == 0 ? "zero " : String
							.valueOf(count[i]) + " ")) + String.valueOf(i)
					+ (count[i] > 1 || count[i] == 0 ? "s" : "") + ".";
			
		}
		
	}
	
	public void initNumbersArray () {
		
		// Fills array
		for (int i = 0; i < numbers.length; i++) {
			
			// Sets element i in numbers to a value from [1,100]; the + 1 is to
			// move it from [0,99]
			numbers[i] = random.nextInt(100) + 1;
			
		}
		
		// Sorts array
		numbers = selectionSort(numbers);
		
	}
	
	public void printArray (int[] array) {
		
		// Uses for loop to print everything
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ","
					+ tmp(i));
			
		}
		System.out.println();
	}
	
	public void printArray (Integer[] array) {
		
		// Uses for loop to print everything
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ","
					+ tmp(i));
			
		}
		System.out.println();
	}
	
	public <T> void printArray (T[] array) {
		
		// Uses for loop to print everything
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + "\n");
			
		}
		
	}
	
	public int[] reverseArray (Integer[] array) {
		
		// Creates temporary array
		int[] temp = new int[array.length];
		
		// Loops through and assigns an element to array.length-i
		for (int i = 0; i < array.length; i++) {
			
			temp[array.length - i - 1] = array[i];
			
		}
		
		return temp;
		
	}
	
	public void run () {
		
		// Initializes stuff
		initNumbersArray();
		count();
		initCountOutputArray();
		
		// Prints sorted array
		printArray(numbers);
		
		// Prints reversed array
		printArray(reverseArray(numbers));
		
		// Prints the # of each number
		printArray(countOutput);
		
		// Closes reader
		reader.close();
		
	}
	
	public <T extends Comparable<? super T>> T[] selectionSort (T[] arr) {
		
		// Initializes variables used for sorting
		
		int smallIndex; // Index of the smallest number
		int pass; // Current sorting pass
		int j; // Index of smaller loop
		int length = arr.length; // Length of array
		T temp;
		
		// Loop.
		// The first pass finds the smallest, the second pass finds the second
		// smallest, etc.
		// Will not be affected by duplicates
		for (pass = 0; pass < (length - 1); pass++) {
			
			// Sets the index of the smallest to the current pass
			smallIndex = pass;
			
			// Finds the smallest element in the pass
			for (j = pass + 1; j < length; j++) {
				
				if (arr[j].compareTo(arr[smallIndex]) < 0) {
					
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
