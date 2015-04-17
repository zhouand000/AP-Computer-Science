package examples.stringfileio.hangman;

import java.io.*;

public class Run {
	
	HangmanGame game = new HangmanGame();
	
	public static void main (String[] args) {
		
		System.out.println(new File("asdf.txt").getAbsolutePath());
		
	}
	
	public void run () {
		
	}
	
	public void runIteration() {
		
		System.out.println(game.getProgressString());
		
	}
	
}
