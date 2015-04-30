/**
 * 
 */
package examples.sorting;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class InsertionSort {
	
	/**
	 * Count
	 */
	public static int count = 0;
	
	// public static boolean print = true;
	
	/**
	 * 
	 */
	public InsertionSort () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		byte[] arr = { 1, 3, 4, 2, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println();
		sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}
	
	/**
	 * 
	 * @param arr
	 */
	public static void sort (byte[] arr) {
		
		byte temp;
		
		for (int i = 0; i < arr.length; i++) {
			
			temp = arr[i];
			int j;
			
			for (j = i; j > 0 && arr[j - 1] > temp; j--) {
				
				arr[j] = arr[j - 1];
				// System.out.println(Arrays.toString(arr) + ", " + temp);
				
			}
			
			arr[j] = temp;
			count++;
			// System.out.println(Arrays.toString(arr));
			// System.out.println();
			
		}
		
		// System.out.println("Insertions: " + count);
		
	}
	
	/**
	 * Slightly optimized variant
	 * @param arr
	 */
	public static void optimizedSort (byte[] arr) {
		
		byte temp;
		int j;
		for (int i = 0; i < arr.length; i++) {
			
			temp = arr[i];
			
			for (j = i; j > 0 && arr[i - 1] > temp; j--) {
				
				arr[j] = arr[j - 1];
				
			}
			
			arr[j] = temp;
			
		}
		
	}
	
}
