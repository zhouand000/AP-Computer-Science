package minesweeper;

/**
 * @author andrew
 * 
 *         The various difficulty levels
 * 
 */
public enum Difficulty {
	@SuppressWarnings("javadoc")
	// Creates difficulty levels, and sets the density
	Easy(10, .05f),
	@SuppressWarnings("javadoc")
	Normal(16, .1f),
	@SuppressWarnings("javadoc")
	Hard(32, .15f),
	@SuppressWarnings("javadoc")
	Veteran(64, .2f),
	@SuppressWarnings("javadoc")
	Custom(0, 0f);
	
	// Creates density variable
	
	final float density;
	
	// Creates size
	final byte size;
	
	Difficulty (int size, float density) {
		
		this.density = density;
		this.size = (byte) size;
		
	}
}
