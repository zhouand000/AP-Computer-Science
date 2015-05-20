package examples.linkedlists.linkedlistinterface;

import java.util.*;

import util.IOUtilities;

/**
 * The test program
 * 
 * @author Andrew
 *
 */
public class TestProgram {
	
	/**
	 * The Scanner
	 */
	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * The list
	 */
	LinkedList<Double> list = new LinkedList<Double>();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TestProgram().run();
		
	}
	
	/**
	 * The run method
	 */
	public void run () {
		
		// Call to prewritten utility code
		IOUtilities.getDoubleInput(list);
		
		System.out.println("List:");
		System.out.println(list);
		reverse();
		System.out.println("Reversed List:");
		System.out.println(list);
		
		
	}
	
	/**
	 * Reverses the list
	 */
	public void reverse () {
		
		Iterator<Double> di = list.descendingIterator();
		LinkedList<Double> temp = new LinkedList<Double>();
		
		for (int i = 0; i < list.size(); i++) {
			
			temp.add(di.next());
			
		}
		
		list = temp;
		
	}
}
