package examples.classes.odometer;

/**
 * @author Andrew
 *
 */
@SuppressWarnings("all")
public class Odometer {
	
	private double fuel;
	
	private double mileage;
	
	/**
	 * Initializes mileage and fuel variables
	 */
	public Odometer () {
		
		this.mileage = 0;
		this.fuel = 0;
		
	}
	
	/**
	 * Adds mileage. Mileage should be greater than 0;
	 * 
	 * @param mileage
	 *            Mileage
	 */
	public void addMiles (double mileage) {
		
		this.mileage += mileage;
		
	}
	
	/**
	 * Adds fuel. Fuel should be greater than 0.
	 * 
	 * @param fuel
	 *            Fuel
	 */
	public void addFuel (double fuel) {
		
		this.fuel += fuel;
		
	}
	
	/**
	 * Adds mileage and fuel used during trip
	 * 
	 * @param mileage
	 *            mileage to add
	 * @param fuel
	 *            fuel to add
	 */
	public void addTrip (double mileage, double fuel) {
		
		this.mileage += mileage;
		this.fuel += fuel;
		
	}
	
	/**
	 * Gets fuel efficiency
	 * 
	 * @return fuel efficiency
	 */
	public double getEfficiency () {
		
		return this.mileage / this.fuel;
		
	}
	
	/**
	 * Gets mileage
	 * 
	 * @return mileage
	 */
	public double getMileage () {
		
		return this.mileage;
		
	}
	
	/**
	 * Gets the amount of fuel used
	 * 
	 * @return the amount of fuel used
	 */
	public double getFuel () {
		
		return this.fuel;
		
	}
	
	/**
	 * Resets the odometer
	 */
	public void reset () {
		
		this.mileage = 0;
		this.fuel = 0;
		
	}
	
	/**
	 * Resets fuel
	 */
	public void resetFuel () {
		
		this.fuel = 0;
		
	}
	
	/**
	 * Resets mileage
	 */
	public void resetMilage () {
		
		this.mileage = 0;
		
	}
}
