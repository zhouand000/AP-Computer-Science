package unitconverter;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class UnitConverter {
	
	public static void main (String[] args) {
		// Creates UnitConverter
		UnitConverter uc = new UnitConverter();
		
		// Creates Scanner
		uc.reader = new Scanner(System.in);
		
		// Gets unit and type
		uc.getInput();
		
		// Gets amount
		System.out.print("Input number of unit: ");
		uc.amount = uc.reader.nextDouble();
		
		uc.printConversions();
		
		uc.reader.close();
		
	}
	
	double amount;
	
	// Creates variables
	String inputType;
	
	String inputUnit;
	
	Scanner reader;
	
	Unit unit = null;
	
	UnitType unitType;
	
	// Gets unit
	
	public void getInput () {
		do {
			
			// Gets unit type
			System.out.print("Enter unit type: ");
			inputType = reader.nextLine().toLowerCase();
			
			// Gets unit type
			switch (inputType.toLowerCase()) {
				case "exit":
					System.exit(0);
					unitType = null;
					break;
				case "length":
				case "l":
				case "distance":
				case "d":
					unitType = UnitType.LENGTH;
					
					// Gets unit
					do {
						unit = readLengthUnit();
					}
					while (unit == Unit.INVALID);
					break;
				case "weight":
				case "w":
				case "mass":
				case "m":
					unitType = UnitType.MASS;
					// Gets unit
					do {
						unit = readMassUnit();
					}
					while (unit == Unit.INVALID);
					break;
				case "power":
				case "p":
					unitType = UnitType.POWER;
					// Gets unit
					do {
						unit = readPowerUnit();
					}
					while (unit == Unit.INVALID);
					break;
				default:
					unitType = UnitType.INVALID;
					break;
			
			}
			
		}
		while (unitType == UnitType.INVALID);
	}
	
	// Gets unit of Length
	public Unit getLengthUnit (String input) {
		
		// Sets output
		switch (input.toLowerCase()) {
		
			case "foot":
			case "feet":
			case "ft":
				return Unit.FT;
			case "mile":
			case "miles":
			case "mi":
				return Unit.MI;
			case "kilometer":
			case "kilometre":
			case "kilometers":
			case "kilometres":
			case "km":
				return Unit.KM;
			case "inch":
			case "inches":
			case "in":
				return Unit.IN;
			case "centimeter":
			case "centimetre":
			case "centimeters":
			case "centimetres":
			case "cm":
				return Unit.CM;
			default:
				return Unit.INVALID;
		}
		
	}
	
	// Gets unit of weight
	public Unit getMassUnit (String input) {
		
		// Uses switch statement to find unit
		switch (input.toLowerCase()) {
		
			case "pound":
			case "pounds":
			case "lb":
				return Unit.LB;
			case "ounce":
			case "ounces":
			case "oz":
				return Unit.OZ;
			default:
				return Unit.INVALID;
		}
		
	}
	
	// Gets unit of power
	public Unit getPowerUnit (String input) {
		
		// Uses switch statement to find unit
		switch (input.toLowerCase()) {
		
			case "kilowatthour":
			case "kilowatthours":
			case "kwh":
				return Unit.KWH;
			case "horsepower":
			case "hp":
				return Unit.HP;
			default:
				return Unit.INVALID;
		}
		
	}
	
	// Gets unit
	public String getUnit (String input) {
		
		// Initializes output
		String output;
		// Sets output
		switch (input.toLowerCase()) {
		
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
	
	// Prints conversions
	public void printConversions () {
		
		// Does conversions
		switch (unitType) {
		
			case LENGTH:
				switch (unit) {
				
					case FT:
						System.out.println(amount + " " + Unit.FT + " = "
								+ amount * 5280d + " " + Unit.MI);
						break;
					case MI:
						System.out.println(amount + " " + Unit.MI + " = "
								+ amount * 5280d + " " + Unit.MI);
						System.out.println(amount + " " + Unit.MI + " = "
								+ amount * 0.62137119d + " " + Unit.KM);
						break;
					case KM:
						System.out.println(amount + " " + Unit.KM + " = "
								+ amount / 0.62137119d + " " + Unit.MI);
						break;
					case IN:
						System.out.println(amount + " " + Unit.IN + " = "
								+ amount * 2.54d + " " + Unit.CM);
						break;
					case CM:
						System.out.println(amount + " " + Unit.CM + " = "
								+ amount / 2.54d + " " + Unit.IN);
						break;
					default:
						throw new IllegalArgumentException("Unit invalid");
				}
				break;
			case MASS:
				switch (unit) {
				
					case LB:
						System.out.println(amount + " " + Unit.LB + " = "
								+ amount / 16 + " " + Unit.OZ);
						break;
					case OZ:
						System.out.println(amount + " " + Unit.OZ + " = "
								+ amount * 16 + " " + Unit.LB);
						break;
					default:
						throw new IllegalArgumentException("Unit invalid");
				}
			case POWER:
				switch (unit) {
				
					case KWH:
						System.out.println(amount + " " + Unit.KWH + " = "
								+ amount * 1.341003d + " " + Unit.HP);
						break;
					case HP:
						System.out.println(amount + " " + Unit.HP + " = "
								+ amount / 1.341003d + " " + Unit.KWH);
						break;
					default:
						throw new IllegalArgumentException("Unit invalid");
						
				}
				break;
			default:
				break;
		
		}
		
	}
	
	// Reads input for unit of Length
	public Unit readLengthUnit () {
		
		// Initializes output
		Unit input;
		
		// Loops until valid
		do {
			
			// Makes call
			System.out.print("Enter a unit: ");
			input = getLengthUnit(reader.nextLine().toLowerCase());
			
			// If the input is invalid
			if (input == Unit.INVALID) {
				
				System.out.println("Input invalid");
				
			}
			
		}
		while (input == Unit.INVALID);
		
		return input;
		
	}
	
	// Reads input for unit of Mass
	public Unit readMassUnit () {
		
		// Initializes output
		Unit input;
		
		// Loops until valid
		do {
			
			// Makes call
			System.out.print("Enter a unit: ");
			input = getMassUnit(reader.nextLine().toLowerCase());
			
			// If the input is invalid
			if (input == Unit.INVALID) {
				
				System.out.println("Input invalid");
				
			}
			
		}
		while (input == Unit.INVALID);
		
		return input;
		
	}
	
	// Reads input for unit of Power
	
	public Unit readPowerUnit () {
		
		// Initializes output
		Unit input;
		
		// Loops until valid
		do {
			
			// Makes call
			System.out.print("Enter a unit: ");
			input = getPowerUnit(reader.nextLine().toLowerCase());
			
			// If the input is invalid
			if (input == Unit.INVALID) {
				
				System.out.println("Input invalid");
				
			}
			
		}
		while (input == Unit.INVALID);
		
		return input;
		
	}
}
