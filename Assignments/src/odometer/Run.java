package odometer;

import java.util.Scanner;


/**
 * This is the launcher class
 * 
 * @author zhouand000
 *
 */
public class Run {
	
	static Scanner reader = new Scanner(System.in);
	
	static Odometer odometer = new Odometer();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		// Initializes Run object
		Run r = new Run();
		
		while (r.mainMenu()){
			System.out.println("Press the enter key to continue...");
			reader.nextLine();
			reader.nextLine();
			}
		
	}
	
	/**
	 * Prints Main Menu text
	 */
	public void printMainMenu () {
		
		System.out.println();
		System.out.println("Main Menu:\n");
		System.out.println("Press 1 to add mileage");
		System.out.println("Press 2 to add fuel");
		System.out.println("Press 3 to add a trip");
		System.out.println("Press 4 to get the mileage");
		System.out.println("Press 5 to get the fuel usage");
		System.out.println("Press 6 to get the fuel efficiency");
		System.out.println("Press 7 to get all data");
		System.out.println("Press 8 to reset the mileage");
		System.out.println("Press 9 to reset the fuel usage");
		System.out.println("Press 10 to reset all");
		System.out.println("Press 11 to exit");
		System.out.println();
	}
	

	/**
	 * Main menu method. Designed to exist inside a while loop, and will always return true unless the exit command is entered.
	 * 
	 * @return true if the method should run again.
	 */
	public boolean mainMenu() {
		
		printMainMenu();
		// Gets option
		System.out.print(":");
		int mode = reader.nextInt();
		switch (mode) {
			
			case 1:
				addMiles();
				return true;
			case 2:
				addFuel();
				return true;
			case 3:
				addTrip();
				return true;
			case 4:
				getMileage();
				return true;
			case 5:
				getFuel();
				return true;
			case 6:
				getEfficiency();
				return true;
			case 7:
				getAll();
				return true;
			case 8:
				resetMileage();
				return true;
			case 9:
				resetFuel();
				return true;
			case 10:
				resetAll();
				return true;
			case 11:
				System.exit(0);
			default:
				System.err.println("Invalid option.");
				return true;
		}
		
	}
	
	/**
	 * Resets all odometer settings
	 */
	public void resetAll () {
		
		System.out.println("Resetting to factory defaults...");
		resetMileage();
		resetFuel();
		
	}

	/**
	 * Resets fuel usage
	 */
	public void resetFuel () {
		
		System.out.println("Resetting fuel...");
		odometer.resetFuel();
		
	}

	/**
	 * Resets mileage
	 */
	public void resetMileage () {
		
		System.out.println("Resetting mileage...");
		odometer.resetMilage();
		
	}
	
	/**
	 * Gets the mileage, fuel, and efficiency 
	 */
	public void getAll () {
		
		getMileage();
		getFuel();
		getEfficiency();
		
	}

	/**
	 * Gets fuel efficiency
	 */
	public void getEfficiency () {
		
		getMileage();
		getFuel();
		System.out.println(odometer.getFuel() != 0 ? "The efficiency is: " + odometer.getEfficiency() : "Please set the fuel usage first!");
		
	}

	/**
	 * Gets the fuel usage
	 */
	public void getFuel () {

		System.out.println("The fuel usage is: " + odometer.getMileage());
		
	}

	/**
	 * Gets the mileage
	 */
	public void getMileage () {
		
		System.out.println("The mileage is: " + odometer.getMileage());
		
	}
	
	/**
	 * Adds mileage and fuel usage
	 */
	public void addTrip () {

		addMiles();
		addFuel();
		
	}

	/**
	 * Adds fuel usage
	 */
	public void addFuel () {
		
		double fuel;
		do {
			System.out.println("Enter the fuel usage: ");
			fuel = reader.nextDouble();
			
		}
		while (fuel < 0);
		odometer.addFuel(fuel);
		
	}
	
	/**
	 * Adds mileage
	 */
	public void addMiles () {
		
		double mileage;
		do {
			
			System.out.println("Enter the mileage:");
			mileage = reader.nextDouble();
			
		}
		while (mileage < 0);
		
		odometer.addMiles(mileage);
		
	}
	
}
