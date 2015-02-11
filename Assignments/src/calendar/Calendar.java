package calendar;

import java.util.Scanner;

public class Calendar {
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		// Creates Scanner
		// Sorry for the lack of exception handling
		Scanner reader = new Scanner(System.in);
		int month;
		int year;
		
		// Gets month
		// Loops to make sure that the input is valid
		do {
			System.out.println("Enter a month");
			System.out.print(":");
			month = reader.nextInt();
			if (month < 0) {
				System.out.println("Please enter a valid month");
			}
		}
		while (month <= 0 || month > 12);
		
		// Gets year
		do {
			System.out.println("Enter a year");
			System.out.print(":");
			year = reader.nextInt();
			if (year < 0) {
				System.out.println("Please enter a valid year");
			}
		}
		while (year < 0);
		
		// Closes reader
		reader.close();
		
		// Finds the month
		String name;
		int days;
		// Switch
		switch (month) {
			case 1:
				name = "January";
				days = 31;
			break;
			case 2:
				name = "Febuary";
				
				// Determines if there is a leap day
				if (year % 4 != 0) {
					days = 28;
				}
				else if (year % 100 != 0) {
					days = 29;
				}
				else if (year % 400 != 0) {
					days = 28;
				}
				else {
					days = 29;
				}
			break;
			case 3:
				name = "March";
				days = 31;
			break;
			case 4:
				name = "April";
				days = 30;
			break;
			case 5:
				name = "May";
				days = 31;
			break;
			case 6:
				name = "June";
				days = 30;
			break;
			case 7:
				name = "July";
				days = 31;
			break;
			case 8:
				name = "August";
				days = 31;
			break;
			case 9:
				name = "September";
				days = 30;
			break;
			case 10:
				name = "October";
				days = 31;
			break;
			case 11:
				name = "November";
				days = 30;
			break;
			case 12:
				name = "December";
				days = 31;
			break;
			default:
				name = "Not a valid input";
				days = -1;
		}
		
		// Print out results
		System.out.println("Month: " + name);
		System.out.println("Days: " + days);
		
	}
	
}
