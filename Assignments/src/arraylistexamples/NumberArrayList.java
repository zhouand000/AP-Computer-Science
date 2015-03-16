package arraylistexamples;

import java.util.*;
import java.util.regex.*;

@SuppressWarnings("javadoc")
public class NumberArrayList {
	
	static Scanner scanner = new Scanner(System.in);
	
	public ArrayList<Double> al = new ArrayList<Double>();
	
	static public Pattern numberPattern = Pattern.compile("^\\d*\\.?\\d*$");
	
	public static void main (String[] args) {
		
		new NumberArrayList().run();
		
	}
	
	public void run () {
		
		fillArrayList();
		System.out.println(al.toString());
		
	}
	
	public void fillArrayList () {
		
		String str;
		boolean isNumber;
		System.out.println("Enter \"exit\" or \"done\" when finished");
		
		do {
			
			//System.out.print(":");
			str = scanner.nextLine();
			str = str.toLowerCase();
			isNumber = numberPattern.matcher(str).matches();
			
			if (isNumber) {
				
				al.add(Double.parseDouble(str));
				
			}
			
		}
		while (str != "exit" || str != "done");
		
	}
	
}
