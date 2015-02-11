package battleship;


public class Ship {
	
	// Initializes fields
	Short size;
	Short[] hits;
	boolean[] hasDamage;
	boolean isSunk = false;
	
	// Creates a ship with size size
	Ship(Short size) {
		
		// Sets the field size to size
		this.size = size;
		
		// Initializes the hit array
		this.hits = new Short[size];
		
		// Initializes the hasDamage array
		this.hasDamage = new boolean[size];
				
	}
	
	// Changes the status of the ship. Position should be between 0 and size
	public void hit(Short position) {
		
		this.hits[position]++;
		this.hasDamage[position] = true;
				
	}
	
	// Checks if the ship is sunk;
	public boolean isSunk() {
		
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
