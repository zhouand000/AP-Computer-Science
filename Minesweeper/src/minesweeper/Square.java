package minesweeper;

public class Square {
	
	Type type;
	byte minesNear;
	
	// Initializes the square
	public Square() {
		
		this(Type.Unknown);
		
		
	}
	
	public Square(Type type) {
		
		
		this.type = type;
		
		
	}
	Square(Type type, byte minesNear) {
		
		this.type = type;
		
		
	}
	
	public static void onSelect() {
		
		
		
	}
	
}
