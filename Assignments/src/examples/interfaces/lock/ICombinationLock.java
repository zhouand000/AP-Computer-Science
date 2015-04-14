package examples.interfaces.lock;

/**
 * A combination lock
 * 
 * @author Andrew
 */
public abstract class ICombinationLock {
	
	protected boolean isLocked;
	
	/**
	 * The combination
	 */
	private int[] combination = new int[3];
	
	/**
	 * Creates a new lock with the combo
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public ICombinationLock(int x, int y, int z) {
		
		setCombination(x, y, z);
		
	}
	
	/**
	 * Sets combination
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * 
	 */
	public void setCombination (int x, int y, int z) {
		
		combination[0] = x;
		combination[1] = y;
		combination[2] = z;
		
	}
	
	/**
	 * @return true if the lock is locked
	 */
	public boolean isLocked ()
	{
		return isLocked;
	}
	
	public boolean checkCombination (int x, int y, int z) {
		
		return x == combination[0] && y == combination[1] && z == combination[2];
		
	}
	
	/**
	 * Checks combination
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return 
	 * 
	 */
	abstract public boolean unlock (int x, int y, int z);
	
	/**
	 * Locks
	 */
	public void lock () {
		
		isLocked = true;
		
	}
	
}
