package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MinesweeperGame {
	
	// Initializes variables
	Grid grid;
	Scanner reader = new Scanner(System.in);
	Random random = new Random(0);
	
	MinesweeperGame(){
		
		this(8);
		
	}
	
	MinesweeperGame(Difficulty difficulty) {
		
		this.grid = new Grid(difficulty);
		
	}

	
	public static void main(String[] args) {
		
		
		

	}
	
	public byte getCustom() {
		
		return reader
		
	}
	
	
}
