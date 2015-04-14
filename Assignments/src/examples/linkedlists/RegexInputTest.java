package examples.linkedlists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

@SuppressWarnings("javadoc")
public class RegexInputTest {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println(loop());
		
		
	}
	
	public static ArrayList<Integer> loop() {
		
		boolean exit = false;
		String input;
		System.out.println("Enter exit to exit");
		
		Pattern pattern = Pattern.compile("exit|done");
		Pattern numberPattern = Pattern.compile("[+-]?\\d+");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		do {
			
			input = scanner.nextLine().toLowerCase();
			if (pattern.matcher(input).matches()) {
				
				exit = true;
				
			}
			else if (!numberPattern.matcher(input).matches()) {
				
				exit = false;
				
			}
			else al.add(Integer.parseInt(input));
			
			
		}
		while (!exit);
		return al;
		
		
	}
	
}
