package minesweeper;

import java.util.Random;
import java.util.Scanner;

/**
 * @author andrew
 * 
 *         The game
 *
 */
public class MinesweeperGame {
	
	// Initializes variables
	Grid grid;
	
	Scanner reader = new Scanner(System.in);
	
	Random random = new Random(0);
	
	MinesweeperGame (Difficulty difficulty) {
		
		this.grid = new Grid(difficulty);
		
	}
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
	}
	
	/**
	 * @return Size of grid
	 */
	public short getCustomSize () {
		
		short output;
		do {
			
			System.out.println("Enter size");
			output = reader.nextShort();
		}
		while (output < 0 || output > 100);
		
		return output;
		
	}
	
	/**
	 * @return Custom Mine Density
	 */
	public float getCustomDensity () {
		
		float output;
		do {
			
			System.out.println("Enter mine density");
			output = reader.nextFloat();
		}
		while (output < 0f || output > .75f);
		
		return output;
		
	}
	
}
