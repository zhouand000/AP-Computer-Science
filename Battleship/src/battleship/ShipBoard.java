package battleship;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The Board
 *
 */
public class ShipBoard extends Board {
	
	static Random random = new Random(0);
	
	Sector[][] grid;
	
	// Creates variables
	int size;
	
	ShipBoard (int size) {
		
		this.size = size;
		
	}
	
	/**
	 * Fills the board with ships
	 */
	public void fillBoard () {
		
		for (int i = 0; i < grid.length; i++) {
			
			for (int j = 0; i < grid[i].length; j++) {
				
				// TODO Finish
				grid[i][j] = null;
				
			}
			
		}
		
	}
	
	public void placeShip () {
		
		boolean sucess = false;
		while (!sucess) {
			
		}
		
	}
	
	public void placeShip (final ShipType type) {
		
		int shipSize = type.getSize();
		
	}
	
}
