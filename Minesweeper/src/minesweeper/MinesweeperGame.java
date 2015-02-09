package minesweeper;

public class MinesweeperGame {
	
	int size;
	int mineCount;
	
	MinesweeperGame(){
		
		this(8);
		
	}
	
	MinesweeperGame(int size) {
		
		this(size,size*size/4);
		
	}
	
	MinesweeperGame(int size, int mineCount) {
		
		this.size = size;
		this.mineCount = mineCount;
		
	}
	
	public static void main(String[] args) {
		
		
		

	}
	
	
}
