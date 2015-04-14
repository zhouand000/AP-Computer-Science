package examples.linkedlists;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Test Class
 * 
 * @author Andrew
 *
 */
public class TESTCLASS {
	
	/**
	 * The list
	 */
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	/**
	 * Static scanner
	 */
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TESTCLASS().run();
		
	}
	
	/**
	 * Run method
	 */
	public void run () {
		
		getInput();
		printList();
		removeDuplicates();
		System.out.println("Removing duplicates");
		printList();
		System.out.println("Reversing");
		printList();
		
	}
	
	/**
	 * Reverses the list
	 */
	public void reverse () {
		
		ListIterator<Integer> di = list.descendingIterator();
		LinkedList<Integer> temp = new LinkedList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			
			temp.add(di.next());
			
		}
		
		list = temp;
		
	}
	
	/**
	 * Prints the LinkedList
	 */
	public void printList () {
		
		System.out.println("The LinkedList contains:");
		System.out.println(list);
		
	}
	
	/**
	 * Gets input
	 */
	public void getInput () {
		
		// Sets up regex Patterns
		Pattern numberPattern = Pattern.compile("^\\d+$");
		Pattern exitPattern = Pattern.compile("exit");
		
		// Gets input
		System.out.println("Enter numbers. Enter 'exit' when done");
		String input;
		do {
			System.out.print(":");
			input = scanner.nextLine();
			if (input.equals("\n")) {
				continue;
			}
			if (exitPattern.matcher(input).matches()) {
				break;
			}
			if (numberPattern.matcher(input).matches()) {
				list.add(Integer.parseInt(input));
			}
			
		}
		while (true);
		
	}
	
	/**
	 * Removes duplicates
	 */
	public void removeDuplicates () {
		
		LinkedList<Integer> temp = new LinkedList<Integer>();
		
		for (Integer i : list) {
			
			if (!temp.contains(i)) {
				
				temp.add(i);
				
			}
			
		}
		list = temp;
		
	}
	
}
