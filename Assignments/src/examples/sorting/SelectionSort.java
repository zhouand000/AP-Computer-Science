/**
 * 
 */
package examples.sorting;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class SelectionSort {
	
	/**
	 * The number of swaps
	 */
	public static int count = 0;
	
	/**
	 * 
	 */
	public SelectionSort () {
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
		sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
	
	/**
	 * @param arr
	 */
	public static void sort (byte[] arr) {
		
		count = 0;
		int smallIndex;
		int pass;
		int j;
		int length = arr.length;
		
		for (pass = 0; pass < (length - 1); pass++) {
			
			smallIndex = pass;
			
			for (j = pass + 1; j < length; j++) {
				
				if (arr[j] < arr[smallIndex]) {
					
					smallIndex = j;
					
				}
				
			}
			
			swap(arr, pass, smallIndex);
			
		}
		
	}
	
	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap (byte[] arr, int i, int j) {
		
		count++;
		byte temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
