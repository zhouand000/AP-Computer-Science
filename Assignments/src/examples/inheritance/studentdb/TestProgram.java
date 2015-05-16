package examples.inheritance.studentdb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Andrew
 *
 */
public class TestProgram {
	
	/**
	 * System.in, at the time of class initialization.
	 */
	public static final InputStream stdin = System.in;
	
	// Fields
	private Scanner scanner;
	
	private StudentDatabase db = new StudentDatabase();
	
	private static boolean debug = false;
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		debug = args.length != 0;
		new TestProgram().run();
		
	}
	
	/**
	 * 
	 * Run method
	 */
	public void run () {
		
		File inputFile = new File("inputFile.txt");
		if (inputFile.exists() && debug) {
			try {
				System.setIn(new FileInputStream(inputFile));
			}
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		
		this.scanner = new Scanner(System.in);
		System.out.println("Creating students...");
		for (int i = 0; i < 5; i++) {
			
			this.db.add(createNewStudent());
			
		}
		this.scanner.close();
		this.scanner = new Scanner(stdin);
		System.setIn(stdin);
		while (runMainMenu()) {
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
				System.out.println("The database is currently locked in read-only mode.");
				break;
			case 3:
				System.out.println(this.db);
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
		System.out.println("1: ID");
		System.out.println("2: Grade");
		System.out.println("3: Age");
		System.out.println("4: Cancel");
		
		do {
			
			System.out.print(":");
			selection = this.scanner.nextInt();
			
		}
		while (selection < 0 || selection > 4);
		
		switch (selection) {
			
			case 1:
				int id = readID();
				System.out.println("The student that matches your query is: ");
				System.out.println(this.db.findID(id));
				return true;
			case 2:
				int grade = readGrade();
				System.out.println("The students that match your query are: ");
				System.out.println(this.db.findGrade(grade));
				return true;
			case 3:
				int age = readAge();
				System.out.println("The students that match your querty are: ");
				System.out.println(this.db.findAge(age));
				return true;
			case 4:
			default:
				return false;
				
		}
		
	}
	
	/**
	 * Creates a student using input from System.in
	 * 
	 * @return a new Student
	 */
	public Student createNewStudent () {
		
		return new Student(readID(), readFirstName(), readLastName(), readGrade(), readAge());
		
	}
	
	/**
	 * @return an int
	 */
	public int readInt () {
		
		System.out.print(":");
		return this.scanner.nextInt();
		
	}
	
	/**
	 * Reads a line
	 * 
	 * @return the line
	 */
	public String readLine () {
		
		System.out.print(":");
		return this.scanner.nextLine().trim();
		
	}
	
	/**
	 * Reads an ID number from System.in
	 * 
	 * @return an ID number
	 */
	public int readID () {
		
		int id;
		// Gets ID
		System.out.println("ID:");
		do {
			System.out.print(":");
			id = this.scanner.nextInt();
		}
		while (id < 0);
		return id;
		
	}
	
	/**
	 * Reads first name
	 * 
	 * @return the first name
	 */
	public String readFirstName () {
		
		String firstName;
		
		// Gets first name
		System.out.println("First Name:");
		do {
			String temp = readLine().trim();
			firstName = temp.length() == 0 ? this.scanner.nextLine() : temp;
		}
		while (!firstName.matches("^\\p{IsAlphabetic}+$"));
		return firstName;
		
	}
	
	/**
	 * @return the lastName
	 */
	public String readLastName () {
		
		String lastName;
		// Gets last name
		System.out.println("Last Name:");
		do {
			System.out.print(":");
			lastName = this.scanner.nextLine();
			
		}
		while (!lastName.matches("^\\p{IsAlphabetic}+$"));
		
		return lastName;
		
	}
	
	/**
	 * @return the grade
	 */
	public int readGrade () {
		
		int grade;
		
		// Gets grade
		System.out.println("Grade:");
		do {
			System.out.print(":");
			grade = this.scanner.nextInt();
		}
		while (grade < 0);
		
		return grade;
		
	}
	
	/**
	 * @return the age
	 */
	public int readAge () {
		
		int age;
		
		// Gets age
		System.out.println("Age:");
		do {
			System.out.print(":");
			age = this.scanner.nextInt();
		}
		while (age < 0);
		
		return age;
		
	}
	
}
