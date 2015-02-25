package battleship;

/**
 * @author zhouand000
 * 
 * Sector of grid
 */
public class Sector {
	
	private boolean hasShip = false;
	private Ship ship;
	private Short position;
	
	Sector () {
		
		hasShip = false;
		setShip(null);
		position = -1;
		
	}
	
	Sector (Ship ship, short position) {
		
		hasShip = true;
		this.setShip(ship);
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
