package arraylistexamples;

import java.util.*;
import java.util.regex.*;


@SuppressWarnings("javadoc")
public class NumberArrayList {
	
	// Fields
	static Scanner scanner = new Scanner(System.in);
	
	public ArrayList<Double> al = new ArrayList<Double>();
	
	static public Pattern numberPattern = Pattern.compile("^\\d*\\.?\\d*$");
	
	public static void main (String[] args) {
		
		new NumberArrayList().run();
		
	}
	
	// Run method
	/**
	 * Run method
	 */
	public void run () {
		
		// Runs through sequence
		readValues();
		printList();
		printSize();
		
		// Removes twos
		removeTwos();
		
		// Repeats sequence
		printList();
		printSize();
		
		
	}
	
	/**
	 * Reads values
	 */
	public void readValues () {
		
		// Gets number of values
		System.out.println("How many numbers?");
		double numberOfValues;
		do {
			System.out.print(":");
			numberOfValues = scanner.nextDouble();
		}
		while (numberOfValues <= 0);
		
		System.out.println("Enter a number");
		
		// Adds to al
		for (int i = 0; i < numberOfValues; i++) {
			
			al.add(readValue());
			
		}
		
	}
	
	/**
	 * Reads value
	 * @return a double value
	 */
	public double readValue () {
		System.out.print(":");
		return scanner.nextDouble();
		
	}
	
	/**
	 * Prints list
	 */
	public void printList () {
		
		System.out.println(al.toString());
		
	}
	
	/**
	 * Prints sizes
	 */
	public void printSize () {
		
		System.out.println("The size is: " + al.size());
	}
	
	/**
	 * Removes twos
	 */
	public void removeTwos () {
		
		System.out.println("Removing twos...");
		ArrayList<Double> temp = new ArrayList<Double>();
		temp.add(2d);
		al.removeAll(temp);
	
	}
	
	/**
	 * Reads arraylist
	 */
	public void readArrayList () {
		
		String str;
		boolean isNumber;
		System.out.println("Enter \"exit\" or \"done\" when finished");
		
		do {
			
			//System.out.print(":");
			str = scanner.nextLine();
			str = str.toLowerCase();
			isNumber = numberPattern.matcher(str).matches();
			
			if (isNumber) {
				
				al.add(Double.parseDouble(str));
				
			}
			
		}
		while (str != "exit" || str != "done");
		
	}
	
}
