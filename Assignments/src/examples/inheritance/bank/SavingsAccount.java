package examples.inheritance.bank;

/**
 * A savings account
 * 
 * @author Andrew
 *
 */
public class SavingsAccount extends Account {
	
	/**
	 * Creates a new Savings Account with $100
	 */
	public SavingsAccount () {
		
		super (100);
		
	}
	
	/**
	 * Creates a new Savings Account with $d
	 * @param d the amount
	 */
	public SavingsAccount (double d) {
		
		super (d);
		
	}
	
	public void withdraw (double d) {
		
		balance = balance - d < 0 ? balance : balance - d; 
		
	}
	
}
