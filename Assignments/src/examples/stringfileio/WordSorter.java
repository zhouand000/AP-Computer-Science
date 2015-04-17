package examples.stringfileio;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

/**
 * @author Andrew
 */
public class WordSorter {
	
	// Fields
	static final InputStream stdin = System.in;
	
	static Scanner sysin = new Scanner(System.in);
	
	File inputFile;
	
	File outputFile;
	
	Scanner fileScanner;
	
	FileWriter fw;
	
	String[] inputArray = new String[10];
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		System.out.println("Starting up...");
		
		new WordSorter().run();
		
	}
	
	/**
	 * Run
	 */
	public void run () {
		
		readFile();
		System.out.println("The input is: ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println("Sorting...");
		Arrays.sort(inputArray);
		System.out.println("The sorted input is: ");
		System.out.println(Arrays.toString(inputArray));
		
	}
	
	/**
	 * Reads and parses the file
	 */
	public void readFile () {
		
		System.out.println("Reading file...");
		if (!inputFile.exists()) {
			
			System.out.println("The inputFile does not exist.");
			try {
				System.out.println("The inputFile can be found at "
						+ inputFile.getCanonicalPath());
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Exiting...");
			System.exit(404);
			
		}
		
		for (int i = 0; i < inputArray.length; i++) {
			
			inputArray[i] = fileScanner.next();
			
		}
		System.out.println("Finished reading input");
		
	}
	
	/**
	 * Prints to the output file
	 */
	public void outputFile () {
		
		try {
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}
			
			for (int i = 0; i < inputArray.length; i++) {
				
				fw.write(inputArray[i]);
				
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
