/**
 * 
 */
package examples.stringfileio.vowelremover;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Andrew
 * 
 */
public class VowelRemover {
	
	// Fields
	Scanner sc = new Scanner(System.in);
	
	String input;
	
	String output;
	
	static final Pattern VOWEL_REGEX = Pattern.compile("[AEIOUaeiou]"); 
	
	
	/**
	 * 
	 */
	public VowelRemover () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new VowelRemover().run();
		
	}
	
	/**
	 * Run
	 */
	public void run () {
		
		System.out.println("Input");
		System.out.print(":");
		input = sc.nextLine();
		output = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println("Output:");
		System.out.println(output);
	}
	
}
