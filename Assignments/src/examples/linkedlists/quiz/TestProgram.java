package examples.linkedlists.quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

import examples.linkedlists.LinkedList;

/**
 * Test Program
 * 
 * @author Andrew
 *
 */
public class TestProgram {
	
	/**
	 * Static Scanner
	 */
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Linked List
	 */
	public LinkedList<Integer> list = new LinkedList<Integer>();
	
	LinkedList<Integer> evenList = new LinkedList<Integer>();
	
	LinkedList<Integer> oddList = new LinkedList<Integer>();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TestProgram().run();
		
	}
	
	/**
	 * Run method
	 */
	public void run () {
		
		// Gets input
		getInput();
		
		// Prints results
		System.out.println("List:");
		System.out.println(list);
		
		// Divides by parity
		System.out.println("Splitting list...");
		splitParity();
		
		System.out.println("Even:");
		System.out.println(evenList);
		System.out.println("Odd:");
		System.out.println(oddList);
		
	}
	
	/**
	 * Gets input
	 */
	public void getInput () {
		
		// Initializers
		String input = "";
		Pattern numberPattern = Pattern.compile("^[+-]??\\d+$", Pattern.CASE_INSENSITIVE);
		Pattern exitPattern = Pattern.compile("^[\\s]*exit[\\s]*$", Pattern.CASE_INSENSITIVE);
		int output = 0;
		
		// Gets input
		System.out.println("#?");
		do {
			System.out.print(":");
			input = scanner.nextLine();
			// If the input matches "exit", or a variant, break out of the loop
			if (exitPattern.matcher(input).matches()) {
				
				break;
				
			}
			// If the input is a number, parse and add to list
			else if (numberPattern.matcher(input).matches()) {
				
				output = Integer.parseInt(input);
				list.add(output);
				
			}
			// Else do nothing and loop again
			else continue;
			
		}
		while (true);
	}
	
	/**
	 * Splits the list by parity
	 */
	public void splitParity () {
		
		for (Integer i : list) {
			
			if (i % 2 == 0) {
				
				evenList.add(i);
				
			}
			else oddList.add(i);
			
		}
		
	}
	
}
