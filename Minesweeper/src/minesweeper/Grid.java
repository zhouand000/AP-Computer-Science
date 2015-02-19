package minesweeper;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The grid of squares.
 *
 */
public class Grid {
	
	// Initializes array of squares
	Square[][] squareArray;
	
	// Initializes size
	
	byte size;
	
	// Creates 2D array with size size*size
	/**
	 * @param size
	 *            The size of the grid
	 * 
	 *            Creates size * size grid
	 * 
	 */
	public Grid (byte size) {
		
		this.squareArray = new Square[size][size];
		this.size = size;
		
	}
	
	/**
	 * @param difficulty
	 *            Difficulty of game
	 * 
	 *            Creates Grid with given difficulty
	 * 
	 */
	public Grid (Difficulty difficulty) {
		
		this(difficulty.size);
		
	}
	
	/**
	 * @param random
	 *            Instance of random to use
	 * 
	 *            Fills grid
	 * 
	 */
	public void fillGrid (Random random) {
		
		for (int i = 0; i < this.size; i++) {
			
			for (int j = 0; j < this.size; j++) {
				
				// Creates Square
				squareArray[i][j] = new Square();
				
			}
			
		}
		
	}
	
	/**
	 * Fills grid
	 */
	public void fillGrid () {
		
		Random random = new Random(0);
		fillGrid(random);
		
	}
}
