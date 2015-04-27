/**
 * 
 */
package examples.sorting;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class BubbleSort {
	
	/**
	 * Count
	 */
	public static int count = 0;
	
	/**
	 * 
	 */
	public BubbleSort () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		byte[] arr = { 1, 3, 4, 2, 5 };
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * Sorts an integer array
	 * 
	 * @param arr
	 */
	public static void sort (byte[] arr) {
		
		count = 0;
		byte temp;
		boolean b;
		
		while (true) {
			
			b = false;
			
			for (int i = 0; i < arr.length - 1; i++) {
				
				if (arr[i] > arr[i + 1]) {
					
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					b = true;
					count++;
				}
				// System.out.println(Arrays.toString(arr));
				
			}
			// System.out.println();
			if (!b) {
				// System.out.println("Swaps: " + count);
				break;
			}
		}
		
	}
	
}
