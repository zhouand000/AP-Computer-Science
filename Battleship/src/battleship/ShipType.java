package battleship;

/**
 * @author zhouand000 All of the ship types
 */
public enum ShipType {
	
	/**
	 * Carrier Size 5
	 */
	CARRIER("CARRIER", 5),
	/**
	 * Battleship Size 5
	 */
	BATTLESHIP("Battleship", 5),
	/**
	 * Cruiser Size 4
	 */
	CRUISER("Cruiser", 4),
	/**
	 * Destroyer Size 3
	 */
	DESTROYER("Destroyer", 3),
	/**
	 * Frigate Size 2
	 */
	FRIGATE("Frigate", 2),
	/**
	 * Submarine Size 2
	 */
	SUBMARINE("Submarine", 2),
	/**
	 * Drone Size 1
	 */
	DRONE("Drone", 1),
	
	/**
	 * Debug Size 1
	 */
	DEBUG("Debug", 1),
	/**
	 * Custom
	 */
	CUSTOM("Custom", 0),
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
	 * @param name
	 *            the name
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/**
	 * @param size
	 *            the size
	 */
	public void setSize (int size) {
		this.size = size;
	}
	
	private String name;
	
	private int size;
	
}
