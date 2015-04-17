package examples.stringfileio.hangman;

import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

import util.InputUtilities;

public class HangmanGame {
	
	
	public ArrayList<String> dictionary = new ArrayList<String>();
	
	{
		char c = FileSystems.getDefault().getSeparator().charAt(0);
		try {
			InputUtilities.getStringInput(dictionary, new FileInputStream(new File("." + c + "src" + c + "examples" + c + "stringfileio" + c + "dictionary.txt")));
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Character> guesses = new ArrayList<Character>(26);
	
	/**
	 * The word
	 */
	public ArrayList<Character> word;
	
	{
		Random random = new Random(0);
		int x = random.nextInt(dictionary.size());
		// word = Arrays.asList(dictionary.get(x).toCharArray());
	}
	
	public boolean[] progress = new boolean[word.size()];
	
	
	
	/**
	 * @return a string representation of progress
	 */
	public String getProgressString () {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < word.length; i++) {
			
			sb.append(progress[i] ? word[i] : "_");
			
		}
		
		return sb.toString();
		
	}
	
	public void guess(char c) {
		
		
		
	}
	
	
	
}
