/**
 * 
 */
package util;

import java.util.Scanner;

/**
 * @author Andrew
 * 
 */
public class FilePathConverter {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 */
	public FilePathConverter () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		 
		String input = sc.nextLine();
		System.out.println(input.replaceAll("/", "//"));
		System.out.println("\"" + input.replaceAll("/", "\" + separator + \"") + "\"");
		 
		 
		
	}
	
}
