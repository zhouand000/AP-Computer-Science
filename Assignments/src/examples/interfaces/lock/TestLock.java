package examples.interfaces.lock;

/**
 * A test lock
 * 
 * @author Andrew
 * 
 */
public class TestLock extends ICombinationLock {
	
	/**
	 * Constructor
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public TestLock (int x, int y, int z) {
		
		super(x, y, z);
		
	}

	@Override
	public boolean unlock (int x, int y, int z) {
		
		if (checkCombination(x, y, z)) {
			
			isLocked = false;
			return true;
		}
		return true;
		
	}
	
	
	
}
