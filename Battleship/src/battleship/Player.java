package battleship;

/**
 * @author zhouand000
 *
 */
public class Player {
	
	/**
	 * The ship board
	 */
	public ShipBoard board;
	/**
	 * The hit board
	 */
	public HitBoard hitBoard;
	/**
	 * The name
	 */
	public String name;
	
	/**
	 * Default Constructor
	 */
	public Player () {
		
		this("Admiral");
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param name The name
	 */
	public Player(String name) {
		
		this.name = name;
		
	}
	
	/**
	 * Sets the name
	 * 
	 * @param name The name
	 */
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	/**
	 * Fires a shot
	 */
	public void fire() {
		
		
		
	}
	
}
