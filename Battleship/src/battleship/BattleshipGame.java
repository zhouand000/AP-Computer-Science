package battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Andrew
 * 
 *         The game
 *
 */
public class BattleshipGame {
	
	/**
	 * Size of board
	 */
	public int size;
	
	/**
	 * Player
	 */
	public Player player;
	
	/**
	 * ComputerPlayer
	 */
	public ComputerPlayer computer;
	
	/**
	 * Array of ships
	 */
	public ArrayList<Ship> shipArray = new ArrayList<Ship>();
	
	/**
	 * Array of ship types
	 */
	public ArrayList<ShipType> shipClassArray;
	
	/**
	 * Scanner
	 */
	static public Scanner scanner = new Scanner(System.in);
	
	/**
	 * RNG
	 */
	public Random random;
	
	/**
	 * Config file
	 */
	public Config config;
	
	/**
	 * The log file
	 */
	public Log log;
	
	static private BattleshipGame game;
	
	private BattleshipGame () {
		
		// Sets game, the instance returned by getInstance()
		game = this;
		
		// Initializes config and log
		config = new Config();
		log = new Log();
		
		this.size = 10;
		
		System.err.println("DEBUG: About to create RNG");
		random = new Random(config.getSeed());
		System.err.println("DEBUG: Finished creating RNG");
		
		shipClassArray = new ArrayList<ShipType>();
		
		shipClassArray.add(ShipType.BATTLESHIP);
		shipClassArray.add(ShipType.CARRIER);
		shipClassArray.add(ShipType.CRUISER);
		shipClassArray.add(ShipType.DESTROYER);
		shipClassArray.add(ShipType.FRIGATE);
		
		System.err.println("DEBUG: Finished creating shipClassArray");
		
		// TODO DEBUG, the error is here
		player = new Player(config.getPlayerName());
		System.err.println("DEBUG: Finished creating player");
		
		computer = new ComputerPlayer();
		
		System.err.println("DEBUG: Finished creating ComputerPlayer");
		
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		BattleshipGame game = new BattleshipGame();
		System.err.println("DEBUG: Finished BG Constructor");
		game.run();
		
	}
	
	/**
	 * @return The instance of BattleshipGame
	 */
	public static BattleshipGame getInstance () {
		
		return game;
		
	}
	
	/**
	 * 
	 */
	public void run () {
		System.err.println("DEBUG: In run()");
		int hitCount = 0;
		boolean win = false;
		while (!win) {
			
			computer.shipBoard.printBoard();
			if (player.fire()) {
				System.err.println("DEBUG: BattleshipGame.run(): fire() returned true");
				hitCount++;
				
			}
			
		}
		
	}
	
	/**
	 * @param x
	 *            x coord
	 * @param y
	 *            y coord
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @return true if a ship is hit
	 */
	public boolean fire (int x, int y) {
		
		return false;
		
	}
	
	/**
	 * @return coordinates in a int[]
	 */
	public int[] getCoordinates () {
		
		int[] output = new int[2];
		
		System.out.println("Enter coordinates: ");
		System.out.print(":");
		
		return output;
		
	}
	
	/**
	 * @param coordinates
	 * @return true if the coordinates are valid
	 */
	public boolean validateCoordinates (int[] coordinates) {
		
		if (coordinates[0] < size && coordinates[1] < size
				&& coordinates[0] >= 0 && coordinates[1] >= 0) {
			return true;
		}
		else return false;
		
	}
}
