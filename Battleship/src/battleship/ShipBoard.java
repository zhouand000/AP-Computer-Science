package battleship;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The Board
 *
 */
public class ShipBoard extends Board {
	
	/**
	 * Reference to the BattleshipGame
	 */
	final public BattleshipGame game = BattleshipGame.getInstance();
	
	Random random = game.random;
	
	/**
	 * The grid
	 */
	public Sector[][] grid;
	
	// Creates variables
	int size;
	
	/**
	 * @param size
	 *            the size
	 */
	public ShipBoard (int size) {
		
		System.err.println("DEBUG: Started ShipBoard constructor");
		
		this.size = size;
		this.grid = new Sector[size][size];
		System.err.println("DEBUG: About to loop and fill grid");
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				grid[i][j] = new Sector(i, j);
				
			}
			
		}
		System.err.println("DEBUG: Done with ShipBoard constructor");
	}
	
	
	/**
	 * Fills the board with ships
	 */
	/*
	public void fillBoard () {
		
		System.err.println("DEBUG: Entered fillBoard()");
		for (ShipType type : game.shipClassArray) {
			

			System.err.println("DEBUG: ShipBoard.fillBoard(): Placing " + type
					+ " class ship");
			game.shipArray.add(placeShip(type));
			System.err
					.println("DEBUG: ShipBoard.fillBoard(): placed a ship in the array, and in the grid");
			 
		}
		
	}
	*/
	
	
	/**
	 * @param xCoord
	 *            x coordinate
	 * @param yCoord
	 *            y coordinate
	 * @return true if a ship was hit
	 */
	public boolean hit (int xCoord, int yCoord) {
		
		grid[xCoord][yCoord].hit();
		return true;
		
	}
	
	@Override
	public void printBoard () {
		
		System.out.println(getString());
		
	}
	
	@Override
	public String getString () {
		
		String output = "  | ";
		
		for (int i = 0; i < size; i++) {
			
			output += i + " ";
			
		}
		
		output += "\n\u2012\u2012+";
		
		for (int i = 0; i < size; i++) {
			
			output += "\u2012\u2012";
			
		}
		
		output += "\n";
		
		for (int i = 0; i < size; i++) {
			output += i + " | ";
			for (int j = 0; j < size; j++) {
				
				output += grid[i][j].toChar() + " ";
				
			}
			output += "\n";
		}
		
		return output;
	}
	
}
