package battleship;

import java.util.ArrayList;

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
	
	public ShipType type;
	
	private ArrayList<Sector> locationArray = new ArrayList<Sector>();
	
	/**
	 * @param type
	 *            Type of ship
	 */
	public Ship (ShipType type) {
		
		// Sets the field size to size
		this.size = type.getSize();
		
		// Initializes the hit array
		this.hits = new Short[size];
		
		// Initializes the hasDamage array
		this.hasDamage = new boolean[size];
		
		// Sets name
		this.name = type.getName();
		
		// Sets type
		this.type = type;
		
	}
	
	/**
	 * @param position
	 *            Position should be between 0 and size, and correspond with the
	 *            array indices
	 * 
	 *            Changes the status of the ship.
	 * 
	 */
	public void hit (int position) {
		
		this.hits[position]++;
		this.hasDamage[position] = true;
		if (isSunk()) {
			
			onSink();
			
		}
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
	
	/**
	 * Will run when the ship is sunk
	 */
	public void onSink () {
		
		System.out.println("You have sunk the " + type.getName() + " " + name
				+ "!");
		
		
		
	}
	
}
