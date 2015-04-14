package util;

import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Input utilities
 * 
 * @author Andrew
 *
 */
public class InputUtilities {
	
	private static Scanner scanner = new Scanner(System.in);
	
	// Sets up regex Patterns
	/**
	 * Integer
	 */
	public static final Pattern INTEGER_PATTERN = Pattern.compile("^\\d+$");
	
	/**
	 * Double 
	 */
	public static final Pattern DOUBLE_PATTERN = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
	/**
	 * Exit
	 */
	public static final Pattern EXIT_PATTERN = Pattern.compile("exit");
	
	/**
	 * 
	 */
	public static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("[(?=(\\d{3}))(?=\\d{3}))]");
	
	public static final Pattern BLANK_PATTERN = Pattern.compile("^[\\h\\w\\v]*$");
	
	/**
	 * @return an int
	 */
	public int readInt () {
		
		System.out.print(":");
		return scanner.nextInt();
		
	}
	
	/**
	 * Gets input
	 * 
	 * @param collection
	 *            The collection to put input into
	 */
	public static void getIntegerInput (Collection<Integer> collection) {
		
		// Gets input
		System.out.println("Enter numbers. Enter 'exit' when done");
		String input;
		do {
			System.out.print(":");
			input = scanner.nextLine();
			if (input.equals("\n")) {
				continue;
			}
			if (EXIT_PATTERN.matcher(input).matches()) {
				break;
			}
			if (INTEGER_PATTERN.matcher(input).matches()) {
				collection.add(Integer.parseInt(input));
			}
			
		}
		while (true);
		
	}
	
	/**
	 * Gets input
	 * 
	 * @param collection
	 *            The collection to put input into
	 */
	public static void getDoubleInput (Collection<Double> collection) {
		
		// Gets input
		System.out.println("Enter numbers. Enter 'exit' when done");
		String input;
		do {
			System.out.print(":");
			input = scanner.nextLine();
			if (input.equals("\n")) {
				continue;
			}
			if (EXIT_PATTERN.matcher(input).matches()) {
				break;
			}
			if (DOUBLE_PATTERN.matcher(input).matches()) {
				collection.add(Double.parseDouble(input));
			}
			
		}
		while (true);
		
	}
	
}
