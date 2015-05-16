package examples.stringfileio.hangman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Random;

import util.InputUtilities;

/**
 * @author Andrew Game
 */
public class HangmanGame {
	
	// Fields
	private boolean isFinished = false;
	
	private boolean isWon = false;
	
	private int numberOfGuesses = 0;
	
	private int maxGuesses = 10;
	
	/**
	 * The rng seed
	 */
	public long seed;
	
	/**
	 * Word dictionary
	 */
	public static final ArrayList<String> dictionary = new ArrayList<String>();
	
	static {
		char separator = FileSystems.getDefault().getSeparator().charAt(0);
		try {
			InputUtilities.getStringInput(dictionary, new FileInputStream(new File("."
					+ separator
					+ "src"
					+ separator
					+ "examples"
					+ separator
					+ "stringfileio"
					+ separator
					+ "hangman"
					+ separator
					+ "dictionary.txt")));
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * The letters that haven't been guessed
	 */
	public ArrayList<Character> guesses = new ArrayList<Character>(26);
	
	/**
	 * The word
	 */
	public char[] word;
	
	{
		Random random = new Random(this.seed);
		int x = random.nextInt(dictionary.size());
		this.word = dictionary.get(x).toCharArray();
	}
	
	/**
	 * Stores progress. True if the corresponding char was guessed.
	 */
	public boolean[] progress = new boolean[this.word.length];
	
	/**
	 * The alphabet
	 */
	public static final char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
		'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
		'U', 'V', 'W', 'X', 'Y', 'Z' };
	
	/**
	 * Default constructor
	 */
	public HangmanGame () {
		this.seed = 0;
	}
	
	/**
	 * @param seed
	 *            the RNG seed
	 */
	public HangmanGame (long seed) {
		
	}
	
	/**
	 * @return a string representation of progress
	 */
	public String getProgressString () {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < this.word.length; i++) {
			
			sb.append(this.progress[i] ? this.word[i] : "_");
			
		}
		
		return sb.toString();
		
	}
	
	/**
	 * @param c
	 *            The guessed character. Should be between 'A' and 'Z'.
	 */
	public void guess (char c) {
		
		this.numberOfGuesses++;
		// System.out.println(remainingLetters.get(c-'A'));
		// remainingLetters.remove(c - 0x40);
		
		for (int i = 0; i < this.word.length; i++) {
			// System.out.println("Word[" + i + "] = " + word[i]);
			this.progress[i] = this.progress[i] ? true : this.word[i] == c;
			
		}
		
		// Updates isFinished and isWon
		if (this.numberOfGuesses == this.maxGuesses - 1) {
			this.isFinished = true;
		}
		else {
			this.isFinished = this.isWon = checkForWin();
		}
		
	}
	
	/**
	 * Checks if won
	 * 
	 * @return
	 */
	private boolean checkForWin () {
		
		for (boolean b : this.progress) {
			if (!b) {
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * @return true if the game is finished
	 */
	public boolean isFinished () {
		
		return this.isFinished;
		
	}
	
	/**
	 * @return true if the player has succeeded
	 */
	public boolean isWon () {
		
		return this.isWon;
		
	}
	
	/**
	 * @return the number of guesses
	 */
	public int getNumberOfGuesses () {
		
		return this.numberOfGuesses;
		
	}
	
}
