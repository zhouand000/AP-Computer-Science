package battleship;

/**
 * @author Andrew Abstract board class
 */
public abstract class Board {
	
	/**
	 * Abstract printBoard method
	 */
	public abstract void printBoard ();
	
	/**
	 * Abstract logBoard method
	 */
	public abstract void logBoard ();
	
	/**
	 * Returns a string representation of the board
	 * 
	 * @return A string representation of the board
	 */
	public abstract String getString ();
	
}
