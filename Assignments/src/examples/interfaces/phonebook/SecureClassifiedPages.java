package examples.interfaces.phonebook;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * A phonebook class
 * 
 * @author Andrew
 *
 */
public class SecureClassifiedPages implements Phonebook {
	
	/**
	 * Stores names and numbers
	 */
	public HashMap<String, Integer> db = new HashMap<String, Integer>();
	
	/**
	 * Stores entries
	 */
	public Set<Map.Entry<String, Integer>> set = db.entrySet();
	
	/**
	 * Adds information from a file
	 * 
	 * @param f
	 *            the file
	 * @throws FileNotFoundException
	 */
	public void readInformation (File f) throws FileNotFoundException {
		if (!f.exists())
			throw new FileNotFoundException(f + " does not exist.");
		else {
			
			Scanner sc = new Scanner(f);
			String input;
			String[] inputArray;
			Pattern blank = Pattern.compile("^[ ]*$");
			while (sc.hasNextLine()) {
				input = sc.nextLine();
				if (blank.matcher(input).matches())
					continue;
				inputArray = input.split("[ ]*;[ ]*");
				this.addInformation(inputArray[0].trim(), Integer.parseInt(inputArray[1].trim()));
				
			}
			
			sc.close();
			
		}
		
	}
	
	@Override
	public int findNumber (String name) {
		
		Integer i = db.get(name);
		
		return i == null ? -1 : i.intValue();
		
	}
	
	@Override
	/**
	 * @returns null if there is not a match
	 */
	public String findName (int number) {
		
		String output = null;
		for (Map.Entry<String, Integer> e : set) {
			
			if (e.getValue() == number) {
				output = e.getKey();
				continue;
			}
		}
		return output;
	}
	
	@Override
	public void addInformation (int number, String name) {
		
		db.put(name, number);
		
	}
	
	@Override
	public void addInformation (String name, int number) {
		
		db.put(name, number);
		
	}
	
	@Override
	public String toString () {
		
		return db.toString();
		
	}
	
}
