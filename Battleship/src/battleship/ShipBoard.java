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
		this.grid = new Sector[size][size];
		
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
	
	/**
	 * Places ship
	 */
	public void placeShip () {
		
		boolean sucess = false;
		while (!sucess) {
			
		}
		
	}
	
	/**
	 * @param type the type of ship to place
	 */
	public void placeShip (final ShipType type) {
		
		boolean sucess = false;
		
		
		while (!sucess) {
			int shipSize = type.getSize();
			int xCoord = random.nextInt(size);
			int yCoord = random.nextInt(size);
			byte direction = (byte) random.nextInt(2);
			sucess = checkDirection((direction == 0 ? Direction.DOWN
					: Direction.RIGHT), shipSize, xCoord, yCoord);
			
		}
		
	}
	
	/**
	 * @param direction The direction to check
	 * @param shipSize
	 * @param xCoord
	 * @param yCoord
	 * @return True if the direction is valid
	 */
	public boolean checkDirection (Direction direction, int shipSize,
			int xCoord, int yCoord) {
		
		switch (direction) {
			case DOWN:
				
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					if (yCoord + i >= size || grid[xCoord][yCoord + i] != null) {
						
						return false;
						
					}
					
				}
			break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					if (xCoord + i >= size || grid[xCoord + i][yCoord] != null) {
						
						return false;
						
					}
					
				}
			
			break;
		
		}
		return true;
		
	}
	
	@Override
	public void printBoard () {
		
		System.out.println(getString());
		
		
	}
	
	@Override
	public String getString () {
		// TODO Auto-generated method stub
		return null;
	}
	
}
