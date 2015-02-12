package unitconverter;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class UnitConverter {
	
	public static void main (String[] args) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creates mode variable
		String input;
		String mode;
		String unit;
		
		do {
			
			// Gets input
			System.out.println("Enter unit type: ");
			input = reader.nextLine().toLowerCase();
			
			// Gets unit type
			switch (input) {
				
				case "length": case "weight": case "power":
					mode = input;
					break;
					
				default:
					mode = "invalid";
					break;
					
			}
			
		}
		while (mode != "invalid");
		
		
		
		
		reader.close();
		
		
		
	}
	
	public String getUnit(String input) {
		String unit;
		// Sets unit
		switch (input) {
			
			case "foot": case "feet": case "ft":  
				unit = "ft";
				break;
			case "mile": case "miles": case "mi":
				unit = "mi";
				break;
			case "pound": case "pounds": case "lb": case "lbs":
				unit = "lb";
				break;
			case "ounce": case "ounces": case "oz":
				unit = "oz";
			case "kilometer": case "kilometers": case "km": 
				unit = "km";
				break;
				
		}
		return unit;
	}
}
