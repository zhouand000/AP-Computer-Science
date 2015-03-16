package battleship;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	/**
	 * Determines if cheat mode is enabled
	 */
	public boolean isCheatModeOn;
	
	static private BattleshipGame game;
	
	private BattleshipGame (boolean isCheatModeOn) {
		
		this.isCheatModeOn = isCheatModeOn;
		
		// Sets game, the instance returned by getInstance()
		game = this;
		
		// Initializes config and log
		config = new Config();
		log = new Log();
		
		this.size = 1;
		
		// System.err.println("DEBUG:About to create RNG");
		random = new Random(config.getSeed());
		// System.err.println("DEBUG:Finished creating RNG");
		
		shipClassArray = new ArrayList<ShipType>();
		
		shipClassArray.add(ShipType.DEBUG);
		
		// System.err.println("DEBUG:Finished creating shipClassArray");
		
		player = new Player(config.getPlayerName());
		// System.err.println("DEBUG:Finished creating player");
		
		computer = new ComputerPlayer();
		if (isCheatModeOn) {
			
			System.out.println("The debug ship is at: "
					+ shipArray.get(0).locationArray.get(0).getCoordinateString());
		}
		// System.err.println("DEBUG:Finished creating ComputerPlayer");
		
		log.writeHeader();
		
	}
	
	private BattleshipGame () {
		
		// Sets game, the instance returned by getInstance()
		game = this;
		
		// Initializes config and log
		config = new Config();
		log = new Log();
		
		this.size = 10;
		
		// System.err.println("DEBUG:About to create RNG");
		random = new Random(config.getSeed());
		// System.err.println("DEBUG:Finished creating RNG");
		
		shipClassArray = new ArrayList<ShipType>();
		
		shipClassArray.add(ShipType.BATTLESHIP);
		shipClassArray.add(ShipType.CARRIER);
		shipClassArray.add(ShipType.CRUISER);
		shipClassArray.add(ShipType.DESTROYER);
		shipClassArray.add(ShipType.FRIGATE);
		
		// System.err.println("DEBUG:Finished creating shipClassArray");
		
		player = new Player(config.getPlayerName());
		// System.err.println("DEBUG:Finished creating player");
		
		computer = new ComputerPlayer();
		
		// System.err.println("DEBUG:Finished creating ComputerPlayer");
		
		log.writeHeader();
		
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		System.out.println("Starting Battleship Simulator…");
		boolean cheatModeOn = false;
		// int mode = 0;
		
		if (args.length > 0) {
			
			cheatModeOn = Arrays.binarySearch(args, "--c") != -1;
			boolean reset = Arrays.binarySearch(args, "--r") != -1;
			if (cheatModeOn) {
				
				System.out.println("Activating cheat mode");
				
			}
			if (reset) {
				
				System.out.println("Resetting config");
				if (Config.configFile.exists()) {
					Config.configFile.delete();
				}
			}
			
		}
		BattleshipGame game;
		if (cheatModeOn) {
			game = new BattleshipGame(true);
		}
		else game = new BattleshipGame();
		// System.err.println("DEBUG:Finished BG Constructor");
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
		
		int totalOccupiedSectors = 0;
		for (ShipType type : shipClassArray) {
			
			totalOccupiedSectors += type.getSize();
			
		}
		// System.err.println("DEBUG:In run()");
		int hitCount = 0;
		int shotCount = 0;
		boolean win = false;
		while (!win) {
			
			String output = computer.shipBoard.getString();
			System.out.println("\n" + output);
			if (player.fire()) {
				// System.err.println("DEBUG: BattleshipGame.run(): fire() returned true");
				hitCount++;
				System.out.println("Hit!");
				
			}
			else {
				System.out.println("Miss!");
			}
			shotCount++;
			if (totalOccupiedSectors == hitCount) {
				
				win = true;
				
			}
			
		}
		
		// Code to run on win
		System.out.println("You have sunk all enemy ships.");
		System.out.println("You used " + shotCount + " shots.");
		System.out.println("Your accuracy is " + (float) totalOccupiedSectors
				/ shotCount * 100 + "%.");
	}
	
}
