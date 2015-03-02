package battleship;

public class HitBoard extends Board {
	
	boolean[][] board;
	
	public HitBoard(int size) {
		
		super(size);
		board = new boolean[size][size];
		
	}
	
}
