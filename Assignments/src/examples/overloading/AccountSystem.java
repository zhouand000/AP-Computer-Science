package examples.overloading;

import java.util.*;

/**
 * Account System
 * 
 * @author Andrew
 *
 */
public class AccountSystem {
	
	// Static scanner
	static Scanner scanner = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	private Account currentAccount;
	
	// private Account root;
	
	// HashMap of accounts
	private HashMap<String, Account> AccountDB = new HashMap<String, Account>();
	
	/**
	 * Constructor
	 */
	public AccountSystem () {
		
		/*
		 * root = createRootAccount(); AccountList.add(root);
		 */
	}
	
	/**
	 * @param args
	 *            Arguments
	 */
	public static void main (String[] args) {
		
		AccountSystem as = new AccountSystem();
		as.run();
		
	}
	
	/**
	 * The run method
	 */
	public void run () {
		
		// Various text
		System.out.println("AdminConsole:~ root$ initNetadminDashboard --reset");
		sleep(100);
		System.out.println("Initializing AdminDashboard...");
		sleep(100);
		System.out.println("New installation detected...");
		sleep(100);
		System.out.println("Running initDashboard...\n");
		sleep(100);
		System.out.print("(root): ");
		sleep(100);
		System.out.println("mkusr -i");
		sleep(100);
		
		// Creates account
		createNewAccount();
		
		changeCurrentUser();
		
		System.out.print("Doing stuff:");
	}
	
	// Sleep method
	private void sleep (int ms) {
		
		try {
			Thread.sleep((long) ms);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// Sleep method
	@SuppressWarnings("unused")
	private boolean sleep () {
		
		try {
			Thread.sleep((long) 100);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	/**
	 * Creates a new account
	 * 
	 * @return
	 */
	private Account createNewAccount () {
		
		String username, password, x, y;
		
		do {
			System.out.print("Username:\n:");
			username = scanner.nextLine();
			System.out.print("Confirm:\n:");
			x = scanner.nextLine();
			// System.out.println(!username.equals(x) || username == "" || username.contains(" "));
		}
		while (!username.equals(x) || username == "" || username.contains(" "));
		do {
			System.out.print("Password:\n:");
			password = scanner.nextLine();
			System.out.print("Confirm:\n:");
			y = scanner.nextLine();
		}
		while (!password.equals(y) || password == "" || password.contains(" "));
		
		return new Account(username, password);
		
	}
	
	/**
	 * Login method
	 * 
	 * @return
	 */
	private boolean changeCurrentUser () {
		
		System.out.print("Username:\n:");
		String username = scanner.nextLine();
		if (changeCurrentUser(username)) {
			
			return true;
			
		}
		else return false;
		
	}
	
	/**
	 * Changes current user
	 * 
	 * @param username
	 * @return
	 */
	private boolean changeCurrentUser (String username) {
		
		// Checks db
		Account account = AccountDB.get(username);
		
		if (account == null) {
			
			return false;
			
		}
		
		// Login seq
		if (account.login()) {
			
			currentAccount = account;
			
			System.out.println("Sucessfully logged in to "
					+ account.getUsername());
			return true;
			
		}
		else return false;
		
	}
	
	@SuppressWarnings("unused")
	private Account createRootAccount () {
		
		Account account = new Account("root", "password", Short.MAX_VALUE);
		AccountDB.put("root", account);
		changeCurrentUser("root");
		return account;
		
	}
	
}
