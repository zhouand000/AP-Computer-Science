package battleship;

public class HitBoard extends Board {
	
	boolean[][] board;
	
	public HitBoard(int size) {
		
		board = new boolean[size][size];
		
	}
	
}
