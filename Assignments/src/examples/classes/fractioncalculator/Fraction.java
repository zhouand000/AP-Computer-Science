package examples.classes.fractioncalculator;

/**
 * @author Andrew Fraction class
 */
public class Fraction {
	
	/**
	 * The numerator of the fraction
	 */
	private int numerator;
	
	/**
	 * The denominator of the fraction
	 */
	private int denominator;
	
	/**
	 * Class constructor
	 */
	
	Fraction () {
		
		setNumerator(0);
		setDenominator(1);
		
	}
	
	/**
	 * Converts the fraction into a string
	 * 
	 * @return the fraction as a string
	 */
	@Override
	public String toString () {
		return numerator + "/" + denominator;
	}
	
	/**
	 * Converts the fraction into a double
	 * 
	 * @return the fraction as a double
	 */
	public double toDouble () {
		
		return (double) numerator / (double) denominator;
		
	}
	
	/**
	 * Getter method for the numerator
	 * 
	 * @return the integer value of the numerator.
	 */
	public int getNumerator () {
		return numerator;
	}
	
	/**
	 * Setter method for the numerator
	 * 
	 * @param numerator
	 *            the new numerator
	 */
	public void setNumerator (int numerator) {
		this.numerator = numerator;
	}
	
	/**
	 * Getter method for the denominator
	 * 
	 * @return the integer value of the denominator
	 */
	public int getDenominator () {
		return denominator;
	}
	
	/**
	 * Setter method for the denominator
	 * 
	 * @param denominator
	 *            the new denominator
	 */
	public void setDenominator (int denominator) {
		this.denominator = denominator;
	}
	
}
