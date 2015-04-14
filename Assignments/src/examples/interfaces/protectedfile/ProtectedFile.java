package examples.interfaces.protectedfile;

/**
 * 
 * @author Andrew
 * 
 */
public interface ProtectedFile {
	
	/**
	 * Sets a password
	 * @param s 
	 */
	public void setPassword (String s);
	
	/**
	 * Checks a password
	 * @param s
	 * @return false if the check fails
	 */
	public boolean checkPassword (String s);
	
	/**
	 * Resets the password
	 */
	public void resetPassword ();
	
	/**
	 * Locks
	 */
	public void lock ();
	
	/**
	 * Unlocks
	 * @return true if unlocked
	 */
	public boolean unlock ();
	
}
