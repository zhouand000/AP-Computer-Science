package examples.interfaces.lock;

import java.util.Scanner;

/**
 * @author Andrew TestProgram
 */
public class TestProgram {
	
	TestLock lock;
	
	/**
	 * A scanner
	 */
	public Scanner scanner = new Scanner(System.in);
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new TestProgram().run();
		
	}
	
	/**
	 * Run
	 */
	public void run () {
		
		lock = new TestLock(0, 0, 0);
		setCombination();
		System.out.println("Unlocking lock");
		if (attemptUnlock()) {
			System.out.println("Unlocked");
		}
		else System.out.println("Still locked");
		
		
	}
	
	/**
	 * Sets combination
	 */
	public void setCombination () {
		System.out.println("Enter the combination");
		lock.setCombination(readInt(), readInt(), readInt());
	}
	
	/**
	 * @return true if unlocked
	 */
	public boolean attemptUnlock() {
		
		System.out.println("Enter the combination");
		return lock.unlock(readInt(), readInt(), readInt());
		
	}
	
	/**
	 * @return an int
	 */
	public int readInt () {
		
		System.out.print(":");
		return scanner.nextInt();
		
	}
	
}
