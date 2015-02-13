package unitconverter;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class UnitConverter {
	
	public static void main (String[] args) {
		
		// Creates Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creates UnitConverter
		UnitConverter uc = new UnitConverter();
		
		// Creates mode variable
		String input;
		String unitType;
		String unit;
		String inputUnit;
		String outputUnit;
		
		do {
			
			// Gets input
			System.out.println("Enter unit type: ");
			input = reader.nextLine().toLowerCase();
			
			// Gets unit type
			switch (input) {
			
				case "length":
				case "l":
				case "distance":
				case "d":				
					unitType = "length";
				break;
				case "weight":
				case "w":
				case "power":
				case "p":
					unitType = input;
				break;
				default:
					unitType = "invalid";
				break;
			
			}
			
		}
		while (unitType == "invalid");
		
		// Calls readDistanceUnit()
		inputUnit = uc.readDistanceUnit(reader);
		// outputUnit = uc.readDistanceUnit(reader);
		
		System.out.println("Input number of unit:");
		double amount = reader.nextDouble();
		
		// Does conversions
		switch (unitType) {
			
			case "length":
				switch (inputUnit) {
					
					case "ft":
						System.out.println(amount + " ft = " + (double) amount / 5280d + " mi");
					break;
					case "mi":
						System.out.println(amount + " mi = " + (double) amount * 5280d + " ft");
						System.out.println(amount + " mi = " + (double) amount * 0.62137119d + " km");
					break;
					case "km":
						System.out.println(amount + " km = " + (double) amount / 0.62137119d + " mi");
					break;
					case "in":
						System.out.println(amount + " in = " + (double) amount * 2.54d + " cm");
					break;
					case "cm":
						System.out.println(amount + " cm = " + (double) amount / 2.54d + " in");
					break;
				}
				break;
			case "weight":
				switch (inputUnit) {
					
					
					
				}
			
		}
		
		
		System.out.println();
		
		reader.close();
		
	}
	
	
		
		
		
	
	
	// Gets input for unit of distance
	public String readDistanceUnit (Scanner reader) {
		
		// Initializes output
		String output;
		
		// Loops until valid
		do {
			
			// Makes call
			System.out.println("Enter a unit:");
			output = getDistanceUnit(reader.nextLine());
			if (output == "invalid") {
				
				System.out.println("Input invalid");
				
			}
		}
		while (output == "invalid");
		
		return output;
		
	}
	
	// Gets unit of distance
	public String getDistanceUnit (String input) {
		
		// Initializes output
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
	
	// Gets unit of weight
	public String getWeightUnit ()
	
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
			break;
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
