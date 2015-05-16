package examples.overloading;

import java.util.Scanner;

/**
 * Account
 * 
 * @author Andrew
 *
 */
@SuppressWarnings("all")
public class Account {
	
	static Scanner scanner = new Scanner(System.in);
	
	private String username;
	
	private String password;
	
	private int maxTries;
	
	private boolean expires;
	
	private int maxUses;
	
	@SuppressWarnings("unused")
	private short accessLevel;
	
	/**
	 * @param username
	 *            Username
	 * @param password
	 *            Password
	 */
	public Account (String username, String password) {
		
		this(username, password, -1);
		
	}
	
	/**
	 * @param username
	 *            Username
	 * @param password
	 *            Password
	 * @param maxTries
	 *            The maximum number of tries for the password
	 */
	public Account (String username, String password, int maxTries) {
		
		this(username, password, maxTries, false, -1);
		
	}
	
	/**
	 * @param username
	 *            Username
	 * @param password
	 *            Password
	 * @param maxTries
	 *            The maximum number of tries for the password
	 * @param expires
	 *            If the password expires after maxUses uses
	 * @param maxUses
	 *            The number of uses before the password expires
	 */
	public Account (String username, String password, int maxTries,
			boolean expires, int maxUses) {
		
		this(username, password, maxTries, expires, maxUses, (short) 0);
		
	}
	
	/**
	 * @param username
	 *            Username
	 * @param password
	 *            Password
	 * @param accessLevel
	 *            The access level
	 */
	public Account (String username, String password, short accessLevel) {
		
		this(username, password, -1, false, -1, (short) 0);
		
	}
	
	/**
	 * @param username
	 *            Username
	 * @param password
	 *            Password
	 * @param maxTries
	 *            The maximum number of tries for the password
	 * @param expires
	 *            If the password expires after maxUses uses
	 * @param maxUses
	 *            The number of uses before the password expires
	 * @param accessLevel
	 *            The access level
	 */
	public Account (String username, String password, int maxTries,
			boolean expires, int maxUses, short accessLevel) {
		
		this.username = username;
		this.password = password;
		this.maxTries = maxTries;
		this.expires = expires;
		this.maxUses = maxUses;
		this.accessLevel = accessLevel;
		
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 *            Command line args
	 */
	public static void main (String[] args) {
		
	}
	
	/**
	 * @return true if successful
	 */
	public boolean login () {
		
		System.out.print("Password:\n:");
		String password = scanner.nextLine();
		
		return login (this.username, password);
		
	}
	
	/**
	 * @param username
	 * @param password
	 * @return true if login successful
	 */
	public boolean login (String username, String password) {
		
		assert (this.username == username);
		if (this.password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @return the username
	 */
	public String getUsername () {
		
		return this.username;
		
	}
	
	/**
	 * @param login
	 *            the login to set
	 */
	public void setUsername (String login) {
		
		this.username = login;
		
	}
	
	/**
	 * @return the password
	 */
	@SuppressWarnings("unused")
	private String getPassword () {
		
		return this.password;
		
	}
	
	/**
	 * @param password
	 *            the password to set
	 */
	@SuppressWarnings("unused")
	private void setPassword (String password) {
		
		this.password = password;
		
	}
	
	/**
	 * @return the maximum number of tries
	 */
	public int getMaxTries () {
		
		return this.maxTries;
		
	}
	
	/**
	 * @param maxTries
	 *            the new maximum number of tries
	 */
	public void setMaxTries (int maxTries) {
		
		this.maxTries = maxTries;
		
	}
	
	/**
	 * @return the expires
	 */
	public boolean isExpires () {
		
		return this.expires;
		
	}
	
	/**
	 * @param expires
	 *            the expires to set
	 */
	public void setExpires (boolean expires) {
		
		this.expires = expires;
		
	}
	
	/**
	 * @return the maxUses
	 */
	public int getMaxUses () {
		
		return this.maxUses;
		
	}
	
	/**
	 * @param maxUses
	 *            the maxUses to set
	 */
	public void setMaxUses (int maxUses) {
		
		this.maxUses = maxUses;
		
	}
	
}
