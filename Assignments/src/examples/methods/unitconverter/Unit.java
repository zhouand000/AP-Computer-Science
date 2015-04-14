package examples.methods.unitconverter;

@SuppressWarnings("javadoc")
// Enum for Units
public enum Unit {
	
	// Declares units
	MI("mile", "miles", "mi", UnitType.LENGTH),
	FT("foot", "feet", "ft", UnitType.LENGTH),
	KM("kilometer", "kilometers", "km", UnitType.LENGTH),
	IN("inch", "inches", "in", UnitType.LENGTH),
	CM("centimeter", "centimeters", "cm", UnitType.LENGTH),
	LB("pound", "pounds", "lb", UnitType.MASS),
	OZ("ounce", "ounces", "oz", UnitType.MASS),
	KWH("kilowatt hour", "kilowatt hours", "kWh", UnitType.POWER),
	HP("horsepower", "horsepower", "hp", UnitType.POWER),
	INVALID("", "", "", UnitType.INVALID);
	
	// Sets name and abbreviation
	public final String NAME;
	
	public final String PLURAL;
	
	public final String ABBREVIATION;
	
	public final UnitType UNIT_TYPE;
	
	Unit (String name, String plural, String abbreviation, UnitType type) {
		this.NAME = name;
		this.PLURAL = plural;
		this.ABBREVIATION = abbreviation;
		this.UNIT_TYPE = type;
	}
	
	// Gets unit
	
	public String getUnit (double quantity) {
		
		return (quantity == 1 ? this.NAME : this.PLURAL);
		
	}
	
	// Gets quantity + unit
	
	public String getQuantity (double quantity) {
		
		return quantity + " " + getUnit(quantity);
		
	}
	
	// Prints quantity + unit
	public void printQuantity (double quantity) {
		
		// Uses ternary operator to decide what to print.
		System.out
				.println(quantity + " "
						+ (quantity == 1 ? this.NAME : this.PLURAL));
		
	}
	
	@Override
	public String toString () {
		
		return this.ABBREVIATION;
		
	}
	
}
