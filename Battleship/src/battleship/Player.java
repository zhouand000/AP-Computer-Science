package battleship;

/**
 * @author zhouand000
 *
 */
public class Player {
	
	/**
	 * Reference to game
	 */
	public BattleshipGame game = BattleshipGame.getInstance();
	
	/**
	 * The ship board
	 */
	public ShipBoard shipBoard;
	
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
	 * @param name
	 *            The name
	 */
	public Player (String name) {
		
		this.name = name;
		
	}
	
	/**
	 * Loads name
	 */
	public void loadName () {
		
		name = game.config.getPlayerName();
		
	}
	
	/**
	 * Initializes shipBoard
	 */
	public void initShipBoard() {
		
		shipBoard = new ShipBoard(game.size);
		
	}
	
	/**
	 * Sets the name
	 * 
	 * @param name
	 *            The name
	 */
	public void setName (String name) {
		
		this.name = name;
		
	}
	
	/**
	 * Fires a shot
	 */
	public void fire () {
		
	}
	
}
