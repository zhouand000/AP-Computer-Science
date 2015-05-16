/**
 * 
 */
package examples.search;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class BinarySearch {
	
	/**
	 * Count
	 */
	public static int count = 0;
	
	/**
	 * 
	 */
	public BinarySearch () {
		
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		byte[] arr = { 1, 3, 4, 2, 5 };
		System.out.println(Arrays.toString(arr));
		search(arr, (byte) 4);
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
	
	/**
	 * @param arr
	 * @param b
	 * @return the index where b is located. Else return -1
	 */
	public static int search (byte[] arr, byte b) {
		
		count = 0;
		
		int min = 0;
		int mid;
		int max = arr.length - 1;
		
		while (min < max) {
			
			mid = min + (min + max) / 2;
			if (b < arr[mid]) {
				
				count++;
				max = mid - 1;
				
			}
			else if (b > arr[mid]) {
				
				count += 2;
				min = mid + 1;
				
			}
			
			else {
				
				count += 3;
				return mid;
				
			}
			
		}
		
		return -1;
		
	}
}
