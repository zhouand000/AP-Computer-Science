package battleship;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The Board
 *
 */
public class Board {
	
	Board(int size){
		
		this.size = size;
		
	}
	
	static Random random = new Random(0);
	
	// Creates variables
	int size;
	
	Sector[][] grid;
	
	
	public void placeShip (ShipType) {
		
		
		
	}
	
	/**
	 * Fills the board with ships
	 */
	public void fillBoard() {
		
		
		
		
		for (int i = 0; i < grid.length; i ++) {
			
			for (int j = 0; i < grid[i].length; j++) {
				
				// TODO Finish
				grid[i][j] = null;
				
			}
			
		}
		
		
		
	}
	
	
	
}
