package examples.stringfileio.wordsorter;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.nio.file.FileSystems;

/**
 * @author Andrew
 */
public class WordSorter {
	
	// Fields
	static final InputStream stdin = System.in;
	
	static Scanner sysin = new Scanner(System.in);
	
	private char s = FileSystems.getDefault().getSeparator().charAt(0);
	
	File inputFile = new File("." + s + "src" + s + "examples" + s
			+ "stringfileio" + s + "wordsorter" + s + "inputFile.txt");
	
	File outputFile = new File("." + s + "src" + s + "examples" + s
			+ "stringfileio" + s + "wordsorter" + s + "outputFile.txt");
	
	{
		
		if (!outputFile.exists()) {
			
			try {
				outputFile.createNewFile();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	Scanner fileScanner;
	{
		try {
			fileScanner = new Scanner(inputFile);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	FileWriter fw;
	{
		try {
			fw = new FileWriter(outputFile, false);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
		
		if (!inputFile.exists()) {
			
			System.out.println("The inputFile does not exist.");
			try {
				System.out.println("The inputFile should be at "
						+ inputFile.getCanonicalPath());
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Exiting...");
			System.exit(404);
			
		}
		if (!outputFile.exists()) {
			
			System.out.println("The outputFile does not exist.");
			try {
				System.out.println("The outputFile should be at "
						+ outputFile.getCanonicalPath());
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Exiting...");
			System.exit(404);
			
		}
		readFile();
		System.out.println("The input is: ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println("Sorting...");
		Arrays.sort(inputArray);
		System.out.println("The sorted input is: ");
		System.out.println(Arrays.toString(inputArray));
		outputFile();
		
	}
	
	/**
	 * Reads and parses the file
	 */
	public void readFile () {
		
		System.out.println("Reading file...");
		
		for (int i = 0; i < inputArray.length; i++) {
			
			inputArray[i] = fileScanner.nextLine();
			
		}
		System.out.println("Finished reading input");
		
	}
	
	/**
	 * Prints to the output file
	 */
	public void outputFile () {
		
		try {
			
			for (int i = 0; i < inputArray.length; i++) {
				
				fw.write(inputArray[i] + "\n");
				
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File saved.");
	}
	
}
