package battleship;

/**
 * @author zhouand000
 * 
 * Sector of grid
 */
public class Sector {
	
	private boolean hasShip;
	private Ship ship;
	/**
	 * The X coordinate
	 */
	public int xCoord;
	/**
	 * The y coordinate
	 */
	public int yCoord;
	/**
	 * The position of the sector along the ship
	 */
	public int position;
	/**
	 * If the sector has been hit
	 */
	public boolean hasHit;
	
	/**
	 * Default Constructor
	 */
	public Sector() {
		
		hasShip = false;
		setShip(null);
		xCoord = -1;
		yCoord = -1;
		position = -1;
		hasHit = false;
		
	}
	
	public Sector (int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		setShip(null);
		position = -1;
		hasHit = false;
		
	}
	
	/**
	 * @param ship The ship at this location
	 * @param xCoord The xCoord of the sector
	 * @param yCoord The yCoord of the Sector
	 * @param position The position of the ship on the 
	 */
	public Sector (Ship ship, int xCoord, int yCoord, int position) {
		
		hasShip = true;
		this.setShip(ship);
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.position = position;
		
	}
	
	/**
	 * Adds a hit to the ship at the current position
	 */
	public void hit() {
		
		if (hasShip){
			
			getShip().hit(position);
			
		}
		
		
	}
	
	/**
	 * @return The instance of Ship that is in this sector
	 */
	public Ship getShip () {
		return ship;
	}

	/**
	 * @param ship
	 */
	public void setShip (Ship ship) {
		
		this.ship = ship;
		
	}
	
}
