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
			
				case "length":
				case "weight":
				case "power":
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
	
	
	// Gets unit of distance
	public String getDistanceUnit (String input) {
		String output;
		// Sets output
		switch (input) {
		
			case "foot":
			case "feet":
			case "ft":
				output = "ft";
			break;
			case "mile":
			case "miles":
			case "mi":
				output = "mi";
			break;
			case "pound":
			case "pounds":
			case "lb":
			case "lbs":
				output = "lb";
			break;
			case "ounce":
			case "ounces":
			case "oz":
				output = "oz";
			case "kilometer":
			case "kilometre":
			case "kilometers":
			case "kilometres":
			case "km":
				output = "km";
			break;
			case "inch":
			case "inches":
			case "in":
				output = "in";
			break;
			case "centimeter":
			case "centimetre":
			case "centimeters":
			case "centimetres":
			case "cm":
				output = "cm";
			break;
			default:
				output = "invalid";
			break;
		}
		return output;
		
	}
	
	// Gets unit
	public String getUnit (String input) {
		String output;
		// Sets output
		switch (input) {
		
			case "foot":
			case "feet":
			case "ft":
				output = "ft";
			break;
			case "mile":
			case "miles":
			case "mi":
				output = "mi";
			break;
			case "pound":
			case "pounds":
			case "lb":
			case "lbs":
				output = "lb";
			break;
			case "ounce":
			case "ounces":
			case "oz":
				output = "oz";
			case "kilometer":
			case "kilometers":
			case "km":
				output = "km";
			break;
			case "inch":
			case "inches":
			case "in":
				output = "in";
			break;
			case "centimeter":
			case "centimetre":
			case "centimeters":
			case "centimetres":
			case "cm":
				output = "cm";
			break;
			case "kwh":
				output = "kwh";
			break;
			case "horsepower":
			case "hp":
				output = "hp";
			break;
			default:
				output = "invalid";
			break;
		}
		return output;
	}
}
