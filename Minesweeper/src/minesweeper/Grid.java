package minesweeper;

import java.util.Random;

public class Grid {
	
	// Initializes array of squares
	Square[][] squareArray;
	
	// Initializes size
	
	byte size;
	
	// Creates 2D array with size size*size
	public Grid(byte size) {
		
		this.squareArray = new Square[size][size];
		this.size = size;
				
	}
	
	public Grid (Difficulty difficulty) {
		
		this(difficulty.size);
		
		
	}

	// Fills grid
	private void fillGrid (Random random) {
		
		
		
		
	}
	
	public void fillGrid () {
		
		Random random;
				
		
	}
}
