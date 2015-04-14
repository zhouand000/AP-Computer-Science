package examples.arraylist;

@SuppressWarnings("javadoc")
public enum Suit {
	
	SPADES("Spades", Color.BLACK),
	CLUBS("Clubs", Color.BLACK),
	HEARTS("Hearts", Color.RED),
	DIAMONDS("Diamonds", Color.RED);
	
	final public String name;
	final public Color color;
	
	Suit (String name, Color color) {
		
		this.name = name;
		this.color = color;
		
	}
	
	final static Suit[] SUITS = { SPADES, CLUBS, HEARTS, DIAMONDS };
	
}
