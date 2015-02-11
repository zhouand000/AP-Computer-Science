package minesweeper;

public class Square {
	
	Type type;
	byte minesNear;
	
	// Initializes the square
	public Square() {
		
		this(Type.Unknown);
		
		
	}
	
	// Creates Square
	public Square(Type type) {
		
		
		this.type = type;
		
		
	}
	
	// Creates Square
	Square(Type type, byte minesNear) {
		
		this.type = type;
		
		
		
	}
	
	// Creates Square
	Square(boolean hasMine) {
		
		
		
	}
	
	public static void onSelect() {
		
		
		
	}
	
}
