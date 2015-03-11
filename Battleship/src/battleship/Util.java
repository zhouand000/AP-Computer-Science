package battleship;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class
 * 
 * @author Andrew
 *
 */
public class Util {
	
	/**
	 * Date formatter
	 */
	static final public SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd_HH:mm:ss");
	
	/**
	 * @param str
	 *            String to check
	 * @return true if str is a positive integer
	 */
	public static boolean isPositiveInteger (String str) {
		if (str == null) {
			return false;
		}
		int length = str.length();
		if (length == 0) {
			return false;
		}
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			if (c <= '/' || c >= ':') {
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * @param d
	 *            Date object
	 * @return the current time, formatted using sdf
	 */
	public static String formatTime (Date d) {
		
		return sdf.format(d);
		
	}
	
	/**
	 * Adds the ordinal suffix to a positive number
	 * 
	 * @param i
	 *            the number to add the suffix to
	 * @return A string with the i and the ordinal suffix
	 */
	public static String addOrdinalSuffix (int i) {
		
		if (i < 0) {
			
			throw new IllegalArgumentException("addOrdinalSuffix");
			
		}
		if (i % 100 == 11 || i % 100 == 12 || i % 100 == 13) {
			
			return i + "th";
			
		}
		
		switch (i % 10) {
		
			case 1:
				return i + "st";
			case 2:
				return i + "nd";
			case 3:
				return i + "rd";
			default:
				return i + "th";
		}
		
	}
	
}
