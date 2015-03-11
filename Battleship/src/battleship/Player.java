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
		
		// System.err.println("DEBUG:Started player constructor");
		this.name = name;
		// System.err.println("DEBUG:About to create shipBoard");
		shipBoard = new ShipBoard(game.size);
		// System.err.println("DEBUG:Finished creating shipBoard");
		
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
	public void initShipBoard () {
		
		// System.err.println("DEBUG:in initShipBoard()");
		// shipBoard = new ShipBoard(game.size);
		
		// TODO The exception is here
		// shipBoard.fillBoard();
		
		// System.err.println("DEBUG:exiting initShipBoard()");
		
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
	 * 
	 * @return true if a ship is at coordinates
	 */
	public boolean fire () {
		
		// System.err.println("DEBUG:Player.fire(): Entered fire()");
		System.out.print("Enter a coordinate:\n:");
		int[] coords = getCoordinates();
		System.out.println();
		
		return game.computer.shipBoard.hit(coords[0], coords[1]);
		
	}
	
	/**
	 * 
	 * @return an int[] with coordinates
	 */
	public int[] getCoordinates () {
		
		// System.err.println("DEBUG: Player.getCoordinates(): In getCoordinates()");
		String[] input;
		int[] output;
		boolean isValid = false;
		
		do {
			// System.err.println("DEBUG:Player.getCoordinates(): In do loop");
			input = BattleshipGame.scanner.nextLine()
					.replaceAll("[\\s\\(\\)]", "")
					.split(",");
			output = new int[2];
			// System.err.println("DEBUG: Player.getCoordinates(): About to parse ints");
			if (Util.isPositiveInteger(input[0])
					&& Util.isPositiveInteger(input[1])) {
				
				output[0] = Integer.parseInt(input[0]);
				output[1] = Integer.parseInt(input[1]);
				isValid = true;
			}
			
			if (output[0] < 0 || output[1] < 0 || output[0] > game.size
					|| output[1] > game.size) {
				
				isValid = false;
				
			}
			
			// System.err.println("DEBUG: Player.getCoordinates(): finished parsing");
		}
		while (!isValid);
		return output;
	}
	
}
