package examples.interfaces.phonebook;

import java.io.File;

/**
 * A phonebook
 * 
 * @author Andrew
 *
 */
public interface Phonebook {
	
	/**
	 * Adds information
	 * 
	 * @param number
	 *            the number
	 * @param name
	 *            the name
	 */
	public void addInformation (int number, String name);
	
	/**
	 * Adds information
	 * 
	 * @param name
	 *            the name
	 * @param number
	 *            the number
	 */
	public void addInformation (String name, int number);
	
	/**
	 * @param name
	 * @return the number associated with that name
	 */
	public int findNumber (String name);
	
	/**
	 * @param number
	 * @return the name associated with that number
	 */
	public String findName (int number);
	
}
