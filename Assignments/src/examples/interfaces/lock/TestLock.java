package examples.interfaces.lock;

public class TestLock extends ICombinationLock {
	
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
