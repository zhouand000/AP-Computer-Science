package battleship;

/**
 * @author Andrew
 *
 */
public class Ship {
	
	// Initializes fields
	final Short size;
	
	private Short[] hits;
	
	private boolean[] hasDamage;
	
	private boolean isSunk = false;
	
	// Creates a ship with size size
	Ship (Short size) {
		
		// Sets the field size to size
		this.size = size;
		
		// Initializes the hit array
		this.hits = new Short[size];
		
		// Initializes the hasDamage array
		this.hasDamage = new boolean[size];
		
	}
	
	/**
	 * @param position
	 *            Position should be between 0 and size, and correspond with the
	 *            array indices
	 * 
	 *            Changes the status of the ship.
	 * 
	 */
	public void hit (Short position) {
		
		this.hits[position]++;
		this.hasDamage[position] = true;
		
	}
	
	// Checks if the ship is sunk;
	/**
	 * @return If the ship is sunk, return true.
	 */
	public boolean isSunk () {
		
		if (isSunk) {
			return true;
		}
		for (boolean value : hasDamage) {
			
			if (!value) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
}
