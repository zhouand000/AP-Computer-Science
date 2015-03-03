package battleship;

import java.util.ArrayList;

/**
 * @author Andrew
 * 
 *         The game
 *
 */
public class BattleshipGame {
	
	
	
	public ShipBoard playerShipBoard;
	
	public ShipBoard enemyShipBoard;
	
	public HitBoard playerHitBoard;
	
	public HitBoard computerHitBoard;
	
	public ArrayList<Ship> shipArray;
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		System.err.println("Not complete yet.");
		BattleshipGame game = new BattleshipGame();
		game.playerShipBoard = new ShipBoard(10);
		
		
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
	
}
