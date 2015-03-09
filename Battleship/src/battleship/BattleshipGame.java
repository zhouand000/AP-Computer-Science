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
		
		random = new Random(config.getSeed());
		
		shipClassArray = new ArrayList<ShipType>();
		
		shipClassArray.add(ShipType.BATTLESHIP);
		shipClassArray.add(ShipType.CARRIER);
		shipClassArray.add(ShipType.CRUISER);
		shipClassArray.add(ShipType.CRUISER);
		shipClassArray.add(ShipType.DESTROYER);
		shipClassArray.add(ShipType.DESTROYER);
		shipClassArray.add(ShipType.FRIGATE);
		shipClassArray.add(ShipType.FRIGATE);
		
		player = new Player(config.getPlayerName());
		computer = new ComputerPlayer();
		
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		BattleshipGame game = new BattleshipGame();
		game.init();
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
	public void run(){
		
		int hitCount = 0;
		boolean win = false;
		while(!win) {
			
			computer.shipBoard.printBoard();
			if (player.fire()) {
				
				hitCount++;
				
			}
			
		}
		
	}
	
	/**
	 * Initializes game
	 */
	public void init () {
		
		// TODO Finish init()
		
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
