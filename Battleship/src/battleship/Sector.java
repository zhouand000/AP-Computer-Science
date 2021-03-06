package battleship;

/**
 * @author zhouand000
 * 
 *         Sector of grid
 */
public class Sector {
	
	private boolean hasShip = false;
	
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
	public Sector () {
		
		hasShip = false;
		xCoord = -1;
		yCoord = -1;
		position = -1;
		hasHit = false;
		
	}
	
	/**
	 * @param xCoord
	 * @param yCoord
	 */
	public Sector (int xCoord, int yCoord) {
		
		hasShip = false;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		position = -1;
		hasHit = false;
		
	}
	
	/**
	 * @param ship
	 *            The ship at this location
	 * @param xCoord
	 *            The xCoord of the sector
	 * @param yCoord
	 *            The yCoord of the Sector
	 * @param position
	 *            The position of the ship on the
	 */
	public Sector (Ship ship, int xCoord, int yCoord, int position) {
		
		hasShip = true;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.position = position;
		
	}
	
	/**
	 * Adds a hit to the ship at the current position
	 * 
	 * @return true if the ship was hit
	 */
	public boolean hit () {
		
		hasHit = true;
		
		if (hasShip) {
			
			return getShip().hit(position);
			
		}
		else return false;
		
	}
	
	/**
	 * @return The instance of Ship that is in this sector
	 */
	public Ship getShip () {
		return ship;
	}
	
	/**
	 * @param ship
	 * @param position
	 *            Position along ship
	 */
	public void setShip (Ship ship, int position) {
		
		this.ship = ship;
		hasShip = true;
		this.position = position;
	}
	
	/**
	 * @return true if the sector has a ship
	 */
	public boolean hasShip () {
		
		return hasShip;
		
	}
	
	/**
	 * @param position
	 *            the position
	 */
	public void setPosition (int position) {
		
		this.position = position;
		
	}
	
	/**
	 * @return a char representation of the sector
	 */
	public char toChar () {
		
		return hasHit ? (hasShip ? '*' : '~') : '?';
		
	}
	
	/**
	 * @return A string representation of the coordinates
	 */
	public String getCoordinateString () {
		
		return "(" + xCoord + "," + yCoord + ")";
		
	}
	
}
