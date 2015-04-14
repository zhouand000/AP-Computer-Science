package examples.overloading;

import java.util.Scanner;

/**
 * Calculator class
 * 
 * @author Andrew
 *
 */
public class Calculator {
	
	// Static scanner
	static private Scanner scanner = new Scanner(System.in);
	
	// Precision
	int precision = getPrecision();
	
	char op = getOperation();
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new Calculator().run();
		
	}
	
	/**
	 * The run method
	 */
	public void run () {
		
		// The local variables used for computation
		double x, y;
		
		// Gets input
		x = getInput();
		y = getInput();
		
		// Creates string representations
		String xStr = Double.toString(x); // (double) x % 1 == 0 ? Integer.toString((int) x) : Double.toString(x);
		String yStr = Double.toString(y); // (double) (x % 1) == 0 ? Integer.toString((int) y) : Double.toString(y);
		
		// Creates output string
		String output = "";
		output += xStr
				+ " "
				+ Character.toString(op)
				+ " "
				+ yStr
				+ " = "
				+ (precision == 1 || (x % 1 == 0 && y % 1 == 0)
						? runOp((int) x, (int) y) : runOp(x, y));
		System.out.println(output);
		
	}
	
	/**
	 * 
	 * Runs an op
	 * 
	 * @param x
	 * @param y
	 * @return a String representation of the result of the op
	 * 
	 */
	public String runOp (double x, double y) {
		
		// Temp var
		double temp = 0;
		
		switch (op) {
		
			case '+':
				temp = x + y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '-':
				temp = x - y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '*':
				temp = x * y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '/':
				temp = x / y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			default:
				return "error";
		}
		
	}
	
	/**
	 * Runs an op with ints
	 * 
	 * @param x
	 * @param y
	 * @return A string with the result of the op
	 */
	public String runOp (int x, int y) {
		
		// Temp var
		double temp = 0;
		
		switch (op) {
		
			case '+':
				temp = x + y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '-':
				temp = x - y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '*':
				temp = x * y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			case '/':
				temp = x / y;
				return temp % 1 == 0 ? Integer.toString((int) temp)
						: Double.toString(temp);
			default:
				return "error";
		}
		
	}
	
	/**
	 * Gets op
	 * 
	 * @return the op
	 */
	public char getOperation () {
		
		// Chooses op
		int option;
		do {
			
			System.out.println("Choose an operation:");
			System.out.println("1: +");
			System.out.println("2: -");
			System.out.println("3: *");
			System.out.println("4: /");
			System.out.print(":");
			option = scanner.nextInt();
			
		}
		while (option < 1 || option > 4);
		
		// Op switch
		switch (option) {
			case 1:
				return '+';
			case 2:
				return '-';
			case 3:
				return '*';
			case 4:
				return '/';
			default:
				return ' ';
		}
		
	}
	
	/**
	 * Gets input
	 * 
	 * @return a double input
	 */
	public double getInput () {
		
		System.out.print("Enter a number:\n:");
		return scanner.nextDouble();
		
	}
	
	/**
	 * Chooses precision level
	 * 
	 * @return the precision level to use
	 */
	public int getPrecision () {
		
		// Chooses precision
		System.out.println("Choose a precision level: ");
		System.out.println("1: Integer");
		System.out.println("2: Float");
		System.out.println("3: Double");
		int mode = 0;
		do {
			System.out.print(":");
			mode = scanner.nextInt();
			
		}
		while (mode > 3 || mode < 1);
		
		return mode;
		
	}
	
}
