package battleship;

/**
 * @author zhouand000 All of the ship types
 */
public enum ShipType {
	
	/**
	 * Carrier
	 */
	CARRIER("CARRIER", 5),
	/**
	 * Battleship
	 */
	BATTLESHIP("Battleship", 5),
	/**
	 * Cruiser
	 */
	CRUISER("Cruiser", 4),
	/**
	 * Destroyer
	 */
	DESTROYER("Destroyer", 3),
	/**
	 * Frigate
	 */
	FRIGATE("Frigate", 2),
	/**
	 * Submarine 
	 */
	SUBMARINE("Submarine", 2),
	/**
	 * Custom
	 */
	CUSTOM("Custom",0),
	/**
	 * Other
	 */
	OTHER("Other", 0),
	/**
	 * Invalid
	 */
	INVALID("Invalid", 0);
	
	ShipType (String name, int size) {
		
		this.name = name;
		this.size = size;
		
	}
	
	/**
	 * @return the size of the ship class
	 */
	public int getSize () {
		return size;
	}

	/**
	 * @return the name of the ship class
	 */
	public String getName () {
		return name;
	}

	/**
	 * @param name the name
	 */
	public void setName (String name) {
		this.name = name;
	}

	/**
	 * @param size the size
	 */
	public void setSize (int size) {
		this.size = size;
	}

	private String name;
	
	private int size;
	
	
}
