package minesweeper;

public enum Difficulty {
	// Creates difficulty levels, and sets the density 
	Easy (10, .05f),
	Normal (16, .1f),
	Hard (32, .15f),
	Veteran (64, .2f),
	Custom (0, 0f);
	
	// Creates density variable
	
	final float density;
	
	// Creates size
	final byte size;
	
	Difficulty (int size, float density) {
		
		this.density = density;
		this.size = (byte) size;
		
	}
}
