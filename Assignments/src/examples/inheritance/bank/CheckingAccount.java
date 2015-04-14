package examples.inheritance.bank;

/**
 * Checking account
 * 
 * @author Andrew
 *
 */
public class CheckingAccount extends Account {
	
	/**
	 * Creates a new account with $d
	 * 
	 * @param d
	 *            the amount
	 */
	public CheckingAccount (double d) {
		
		super(d);
		
	}
	
	public void withdraw (double d) {
		
		balance -= balance - d - 1 < 0 ? balance - d - 11 : balance - d - 1;
		
	}
	
}
