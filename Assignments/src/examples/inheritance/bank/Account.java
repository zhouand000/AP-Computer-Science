package examples.inheritance.bank;

/**
 * Account
 * 
 * @author Andrew
 *
 */
@SuppressWarnings("all")
public abstract class Account {
	
	protected double balance;
	
	/**
	 * Constructor
	 */
	public Account () {
		
		this.balance = 0;
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param d Starting balance
	 */
	public Account (double d) {
		
		this.balance = d;
		
	}
	
	
	/**
	 * @param d the amount
	 * Adds balance
	 */
	public void deposit (double d) {
		
		if (d > 0) {
			this.balance += d;
		}
		
	}
	
	/**
	 * @param d the amount
	 */
	public void withdraw (double d) {
		
		if (d > 0) {
			
			this.balance -= d;
			
		}
		
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance () {
		return this.balance;
	}
	
}
