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
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getString () {
		// TODO Auto-generated method stub
		return null;
	}
	
}
