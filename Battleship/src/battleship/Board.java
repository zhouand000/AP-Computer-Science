package battleship;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The Board
 *
 */
public class Board {
	
	static Random random = new Random(0);
	
	// Creates variables
	short size;
	
	Sector[][] grid;
	
	Board (int i) {
		
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
