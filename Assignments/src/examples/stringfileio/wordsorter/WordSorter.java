package examples.stringfileio.wordsorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Andrew
 */
public class WordSorter {
	
	// Fields
	static final InputStream stdin = System.in;
	
	static Scanner sysin = new Scanner(System.in);
	
	private char s = FileSystems.getDefault().getSeparator().charAt(0);
	
	File inputFile = new File("." + this.s + "src" + this.s + "examples" + this.s
			+ "stringfileio" + this.s + "wordsorter" + this.s + "inputFile.txt");
	
	File outputFile = new File("." + this.s + "src" + this.s + "examples" + this.s
			+ "stringfileio" + this.s + "wordsorter" + this.s + "outputFile.txt");
	
	{
		
		if (!this.outputFile.exists()) {
			
			try {
				this.outputFile.createNewFile();
			}
			catch (IOException e) {
				
				e.printStackTrace();
				Math.random();
			}
			
		}
		
	}
	
	Scanner fileScanner;
	{
		try {
			this.fileScanner = new Scanner(this.inputFile);
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	FileWriter fw;
	{
		try {
			this.fw = new FileWriter(this.outputFile, false);
		}
		catch (IOException e) {
			
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
		
		if (!this.inputFile.exists()) {
			
			System.out.println("The inputFile does not exist.");
			try {
				System.out.println("The inputFile should be at "
						+ this.inputFile.getCanonicalPath());
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Exiting...");
			System.exit(404);
			
		}
		if (!this.outputFile.exists()) {
			
			System.out.println("The outputFile does not exist.");
			try {
				System.out.println("The outputFile should be at "
						+ this.outputFile.getCanonicalPath());
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Exiting...");
			System.exit(404);
			
		}
		readFile();
		System.out.println("The input is: ");
		System.out.println(Arrays.toString(this.inputArray));
		System.out.println("Sorting...");
		Arrays.sort(this.inputArray);
		System.out.println("The sorted input is: ");
		System.out.println(Arrays.toString(this.inputArray));
		outputFile();
		
	}
	
	/**
	 * Reads and parses the file
	 */
	public void readFile () {
		
		System.out.println("Reading file...");
		
		for (int i = 0; i < this.inputArray.length; i++) {
			
			this.inputArray[i] = this.fileScanner.nextLine();
			
		}
		System.out.println("Finished reading input");
		
	}
	
	/**
	 * Prints to the output file
	 */
	public void outputFile () {
		
		try {
			
			for (int i = 0; i < this.inputArray.length; i++) {
				
				this.fw.write(this.inputArray[i] + "\n");
				
			}
			this.fw.flush();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("File saved.");
	}
	
}
