package examples.interfaces.lock;

/**
 * A combination lock
 * 
 * @author Andrew
 */
public abstract class ICombinationLock {
	
	boolean isLocked;
	
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
		
		this.combination[0] = x;
		this.combination[1] = y;
		this.combination[2] = z;
		
	}
	
	/**
	 * @return true if the lock is locked
	 */
	public boolean isLocked ()
	{
		return this.isLocked;
	}
	
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @return true if the combination is correct
	 */
	public boolean checkCombination (int x, int y, int z) {
		
		return x == this.combination[0] && y == this.combination[1] && z == this.combination[2];
		
	}
	
	/**
	 * Checks combination
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return true if unlocked
	 * 
	 */
	abstract public boolean unlock (int x, int y, int z);
	
	/**
	 * Locks
	 */
	public void lock () {
		
		this.isLocked = true;
		
	}
	
}
