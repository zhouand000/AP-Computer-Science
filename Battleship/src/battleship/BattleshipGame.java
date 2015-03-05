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
	
	public int size;
	
	public ShipBoard playerShipBoard;
	
	public ShipBoard enemyShipBoard;
	
	public HitBoard playerHitBoard;
	
	public HitBoard computerHitBoard;
	
	public ArrayList<Ship> shipArray;
	
	static public Scanner reader = new Scanner(System.in);
	
	static public Random random = new Random();
	
	public Config config;
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		
		BattleshipGame game = new BattleshipGame();
		game.init();
		game.playerShipBoard = new ShipBoard(10);
		
		
		
	}
	
	public void init() {
		
		config = new Config();
		
		
		
	}
	
	/**
	 * @param x x coord
	 * @param y y coord
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @return true if a ship is hit
	 */
	public boolean fire(int x, int y) {
		
		
		
		
		return false;
				
	}
	
	
	public int[] getCoordinates() {
		
		int[] output = new int[2];
		
		System.out.println("Enter coordinates: ");
		System.out.print(":");
		
		
		return output;
		
		
		
	}
	
	
	public boolean validateCoordinates(int[] coordinates){
		
		if (coordinates[0] < size && coordinates[1] < size && coordinates[0] >= 0 && coordinates[1] >= 0) {
			return true;
		}
		else return false;
		
	}
}
