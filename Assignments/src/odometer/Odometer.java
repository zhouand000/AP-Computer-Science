package odometer;

/**
 * @author Andrew
 *
 */
public class Odometer {
	
	private double gas;
	
	private double mileage;
	
	/**
	 * Initializes mileage and gas variables
	 */
	public Odometer () {
		
		mileage = 0;
		gas = 0;
		
	}
	
	
	/**
	 * Adds mileage
	 * 
	 * @param mileage
	 *            Mileage
	 */
	public void addMiles (double mileage) {
		
		this.mileage += mileage;
		
	}
	
	/**
	 * Adds mileage and gas used during trip
	 * 
	 * @param mileage
	 *            mileage to add
	 * @param gas
	 *            gas to add
	 */
	public void addTrip (double mileage, double gas) {
		
		mileage += mileage;
		this.gas += gas;
		
	}
	
	/**
	 * Gets fuel efficiency
	 * 
	 * @return fuel efficiency
	 */
	public double getEfficiency () {
		
		return (double) mileage / (double) gas;
		
	}
	
	/**
	 * Gets the amount of gas used
	 * 
	 * @return the amount of gas used
	 */
	public double getGas () {
		
		return gas;
		
	}
	
	/**
	 * Resets the odometer
	 */
	public void reset () {
		
		mileage = 0;
		gas = 0;
		
	}
	
	/**
	 * Resets gas
	 */
	public void resetGas () {
		
		gas = 0;
		
	}
	
	/**
	 * Resets mileage
	 */
	public void resetMilage () {
		
		mileage = 0;
		
	}
}
