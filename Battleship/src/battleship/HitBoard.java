package battleship;

/**
 * @author Andrew
 *
 */
public class HitBoard extends Board {
	
	boolean[][] board;
	
	/**
	 * @param size
	 */
	public HitBoard (int size) {
		
		board = new boolean[size][size];
		
	}
	
	@Override
	public void printBoard () {
		
	}
	
	@Override
	public String getString () {
		
		return null;
	}
	
	@Override
	public void logBoard () {
		
	}
	
}
