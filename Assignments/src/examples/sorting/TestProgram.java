/**
 * 
 */
package examples.sorting;

import java.util.Arrays;
import java.util.Random;

import util.InputUtilities;

/**
 * @author Andrew
 * 
 */
public class TestProgram {
	
	// Fields
	
	Random rng = new Random(0);
	
	int quantity;
	
	byte[] numbers;
	
	/**
	 * 
	 */
	public TestProgram () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TestProgram().run();
		
	}
	
	/**
	 * Run
	 */
	public void run () {
		
		System.out.println("#?");
		
		quantity = InputUtilities.readInt();
		
		numbers = new byte[quantity];
		randomFill(numbers);
		byte[] a1 = numbers.clone();
		byte[] a2 = numbers.clone();
		
		System.out.println("Sorting using Bubble Sort");
		BubbleSort.sort(a1);
		System.out.println(Arrays.toString(a1));
		System.out.println("Sorting using Insertion Sort");
		InsertionSort.sort(a2);
		System.out.println(Arrays.toString(a2));
		
	}
	
	/**
	 * Randomly fills a given array
	 * 
	 * @param arr
	 */
	public void randomFill (byte[] arr) {
		
		rng.nextBytes(arr);
		
	}
	
}
