/**
 * 
 */
package examples.search;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class SequentialSearch {
	
	/**
	 * Count
	 */
	public static int count = 0;
	
	/**
	 * 
	 */
	public SequentialSearch () {
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
		
		int index;
		
		for (index = 0; index < arr.length; index++) {
			
			count++;
			
			if (arr[index] == b) {
				
				return index;
				
			}
			
		}
		
		return -1;
		
	}
}
