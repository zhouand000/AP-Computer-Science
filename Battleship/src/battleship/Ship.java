package battleship;

/**
 * @author Andrew
 *
 */
public class Ship {
	
	private boolean[] hasDamage;
	
	private Short[] hits;
	
	private boolean isSunk = false;
	
	// Initializes fields
	public final int size;
	public final String name;
	
	
	/**
	 * @param type Type of ship
	 */
	public Ship (ShipType type) {
		
		this (type.getSize(), type.getName());
		
		
		
		
	}
	
	/**
	 * @param size Size of ship
	 */
	public Ship (int size, String name) {
		
		// Sets the field size to size
		this.size = size;
		
		// Initializes the hit array
		this.hits = new Short[size];
		
		// Initializes the hasDamage array
		this.hasDamage = new boolean[size];
		
		// Sets name
		this.name = name;
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
