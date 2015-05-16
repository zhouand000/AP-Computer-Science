package examples.interfaces.phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Test program
 * 
 * @author Andrew
 *
 */
public class TestProgram {
	
	/**
	 * STDIN
	 */
	public static final InputStream STDIN = System.in;
	
	/**
	 * Scanner
	 */
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * The directory
	 */
	public SecureClassifiedPages scp = new SecureClassifiedPages();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TestProgram().run();
		
	}
	
	/**
	 * Run
	 */
	public void run () {
		
		System.out.println("Reading information from archive...");
		try {
			this.scp.readInformation(new File("testInputFile.txt"));
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		while(runMainMenu()) {
			;
		}
		
	}
	
	/**
	 * Main menu
	 * 
	 * @return true if the loop should continue
	 */
	public boolean runMainMenu () {
		
		int selection = 0;
		
		System.out.println("Pick an option:");
		System.out.println("1: Search");
		System.out.println("2: Modify");
		System.out.println("3: Print");
		System.out.println("4: Exit");
		
		do {
			
			selection = readInt();
			
		}
		while (selection < 1 || selection > 4);
		
		switch (selection) {
			
			case 1:
				runSearchMenu();
				break;
			case 2:
				System.out.println("Error 1337: Please try again later.");
				break;
			case 3:
				System.out.println(this.scp);
				break;
			case 4:
				System.exit(0);
				return false;
			default:
				break;
				
		}
		return true;
		
	}
	
	/**
	 * Search menu
	 * 
	 * @return false if canceled
	 */
	public boolean runSearchMenu () {
		
		int selection = 0;
		System.out.println("Pick a search type:");
		System.out.println("1: Name");
		System.out.println("2: Phone Number");
		System.out.println("3: Cancel");
		
		do {
			
			System.out.print(":");
			selection = scanner.nextInt();
			
		}
		while (selection < 0 || selection > 3);
		
		switch (selection) {
			
			case 1:
				String name = readName();
				System.out.println("The number that matches your query is: ");
				System.out.println(this.scp.findNumber(name));
				return true;
			case 2:
				int number = readNumber();
				System.out.println("The person that matches your query is: ");
				System.out.println(this.scp.findName(number));
				return true;
			case 3:
			default:
				return false;
				
		}
		
	}
	
	/**
	 * @return an int
	 */
	public int readInt () {
		
		System.out.print(":");
		return scanner.nextInt();
		
	}
	
	/**
	 * Reads a line
	 * 
	 * @return the line
	 */
	public String readLine () {
		
		System.out.print(":");
		String input = scanner.nextLine().trim();
		if (input.equals("")||input.matches("[\n ]+")) {
			
			input = scanner.nextLine().trim();
			
		}
		return input == null ? "" : input;
		
	}
	
	/**
	 * Reads an ID number from System.in
	 * 
	 * @return an ID number
	 */
	public int readNumber () {
		
		int id;
		// Gets ID
		System.out.println("ID:");
		do {
			System.out.print(":");
			id = scanner.nextInt();
		}
		while (id < 0);
		return id;
		
	}
	
	/**
	 * Reads first name
	 * 
	 * @return the first name
	 */
	public String readName () {
		
		String name;
		
		// Gets first name
		System.out.println("Name:");
		do {
			String temp = readLine().trim();
			name = temp.length() == 0 ? scanner.nextLine() : temp;
		}
		while (!name.matches("^.+$"));
		return name;
		
	}
	
}
