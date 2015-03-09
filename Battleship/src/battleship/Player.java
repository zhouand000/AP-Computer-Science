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
		shipBoard = new ShipBoard(game.size);
		initShipBoard();
		
	}
	
	/**
	 * Loads name
	 */
	public void loadName() {
		
		name = game.config.getPlayerName();
		
	}
	
	/**
	 * Initializes shipBoard
	 */
	public void initShipBoard() {
		
		shipBoard = new ShipBoard(game.size);
		shipBoard.fillBoard();
		
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
	 * @return true if a ship is at coordinates
	 */
	public boolean fire() {
		
		int[] coords = parseCoordinateString(BattleshipGame.scanner.nextLine().replaceAll("[\\s]", "").split(","));
		
		return shipBoard.hit(coords[0], coords[1]);
		
	}
	
	/**
	 * @param input string to parse
	 * @return an int[] with coordinates
	 */
	public int[] parseCoordinateString(String[] input) {
		
		int[] output = new int[2];
		output[0] = Integer.parseInt(input[0]);
		output[1] = Integer.parseInt(input[1]);
		
		return output;
	}
	
}
