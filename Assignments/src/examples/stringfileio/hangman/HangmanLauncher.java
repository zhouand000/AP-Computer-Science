package examples.stringfileio.hangman;

import java.util.*;

/**
 * @author Andrew Run
 */
public class HangmanLauncher {
	
	// Fields
	
	static Scanner scanner = new Scanner(System.in);
	
	HangmanGame game = new HangmanGame();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		System.out.println("Starting up...");
		HangmanLauncher hl = new HangmanLauncher();
		do {
			
			hl.newGame();
			hl.run();
			System.out.println("Play again?");
			
		}
		while (hl.requestYN());
		
	}
	
	/**
	 * Run
	 * 
	 */
	public void run () {
		
		// System.out.println(Arrays.toString(game.word));
		while (runIteration())
			;
		
		if (game.isWon()) {
			
			System.out.println("Victory!");
			
		}
		
		else System.out.println("Failure.");
		
	}
	
	/**
	 * Iteration
	 * 
	 * @return true if the game should continue
	 */
	public boolean runIteration () {
		
		System.out.println(game.getProgressString());
		game.guess(readChar());
		return !game.isFinished();
		
	}
	
	/**
	 * @return a char between 'a' and 'z'
	 */
	public char readChar () {
		
		char c = 0;
		
		String input;
		
		do {
			
			System.out.print(":");
			input = scanner.nextLine().trim().toLowerCase();
			if (input.length() != 1)
				continue;
			c = input.charAt(0);
			
		}
		while (c < 'a' || c > 'z');
		
		return c;
		
	}
	
	/**
	 * @return true if 'y' is input. Otherwise, returns false
	 */
	public boolean requestYN () {
		
		char c = 0;
		
		String input;
		
		do {
			
			System.out.print(":");
			input = scanner.nextLine().trim().toLowerCase();
			if (input.length() != 1)
				continue;
			c = input.charAt(0);
			
		}
		while (c != 'y' && c != 'n');
		
		return c == 'y';
		
	}
	
	/**
	 * Creates a new game
	 */
	public void newGame () {
		
		game = new HangmanGame(game == null ? 0
				: (game.seed * 0x5DEECE66DL + 0xBL) & 1L << 48 - 1);
		
	}
	
}
