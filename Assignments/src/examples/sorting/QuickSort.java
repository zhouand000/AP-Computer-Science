/**
 * 
 */
package examples.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Andrew
 * 
 */
public class QuickSort {
	
	private static Random rng = new Random(0);
	
	/**
	 * Count
	 */
	public static int count = 0; 
	
	/**
	 * 
	 */
	public QuickSort () {
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
		System.out.println(count);
		
	}
	
	/**
	 * @param arr
	 */
	public static void sort (byte[] arr) {
		count = 0;
		quickSort(arr, 0, arr.length - 1);
		// System.out.println("Swaps: " + count);
	}
	
	/**
	 * @param arr
	 * @param start
	 *            Beginning of the range to sort
	 * @param end
	 *            End of the range to sort
	 */
	public static void quickSort (byte[] arr, int start, int end) {
		
		if (start < end) {
			
			int index = partition(arr, start, end);
			quickSort(arr, start, index - 1);
			quickSort(arr, index + 1, end);
			
		}
		
	}
	
	/**
	 * Partitions an array
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return the index of the pivot
	 */
	public static int partition (byte[] arr, int start, int end) {
		
		int index = start + rng.nextInt(end - start + 1);
		byte pivot = arr[index];
		swap(arr, index, end);
		for (int i = index = start; i < end; ++i) {
			
			if (arr[i] < pivot) {
				swap(arr, index++, i);
			}
			
		}
		swap(arr, index, end);
		return index;
		
	}
	
	/**
	 * Swaps the elements at i, j
	 * 
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
