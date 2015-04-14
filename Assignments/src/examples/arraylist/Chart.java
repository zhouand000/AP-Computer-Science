package examples.arraylist;

import java.util.*;
import java.util.regex.Pattern;

/**
 * 
 * @author Andrew
 *
 */
public class Chart {
	
	/**
	 * Map with the 10 ArrayLists
	 */
	public TreeMap<Integer, ArrayList<Integer>> listMap = new TreeMap<Integer, ArrayList<Integer>>();
	static Scanner scanner = new Scanner (System.in);
	{
		for (int i = 1; i <= 10; i++) {
			
			listMap.put(i, new ArrayList<Integer>());
			
		}
		
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new Chart().run();
		
	}
	
	/**
	 * Run method
	 */
	public void run () {
		
		getInput();
		System.out.println(getChartString());
		
	}
	
	/**
	 * Gets input
	 */
	public void getInput () {
		
		String input = "";
		Pattern numberPattern = Pattern.compile("^\\d+$", Pattern.CASE_INSENSITIVE);
		Pattern exitPattern = Pattern.compile("exit", Pattern.CASE_INSENSITIVE);
		int output = 0;
		System.out.println("#?");
		do {
			System.out.print(":");
			input = scanner.nextLine();
			if (exitPattern.matcher(input).matches()) {
				
				break;
				
			}
			else if (numberPattern.matcher(input).matches()) {
				
				output = Integer.parseInt(input);
				if (output < 1 | output > 100) {
					
					break;
					
				}
				else {
					
					insert (output);
					continue;
					
				}
				
			}
			else continue;
			
		}
		while (true);
	}
	
	/**
	 * Inserts a number into the proper location in map
	 * 
	 * @param i
	 *            number to insert
	 */
	public void insert (int i) {
		
		if (i > 100 || i < 1) {
			
			throw new IllegalArgumentException("i: " + i);
			
		}
		
		int key = (i - 1) % 10 + 1;
		
		listMap.get(key).add(i);
		
	}
	
	/**
	 * @return a string representation of the chart
	 */
	public String getChartString () {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			
			sb.append(i).getClass();
			sb.append('-');
			sb.append(10 * i);
			sb.append("\t");
			sb.append('|');
			sb.append(listMap.get(i).isEmpty() ? "" : getAstrisks(listMap.get(i).size()));
			sb.append("\n");
			
		}
		return sb.toString();
		
	}
	
	/**
	 * @param i
	 * @return a string with the appropriate number of astrisks
	 */
	public String getAstrisks (int i) {
		
		switch (i) {
			case 0:
				return "";
			case 1:
				return "*";
			case 2:
				return "**";
			case 3:
				return "***";
			case 4:
				return "****";
			case 5:
				return "*****";
			case 6:
				return "******";
			case 7:
				return "*******";
			case 8:
				return "********";
			case 9:
				return "*********";
			case 10:
				return "**********";
			default:
				throw new IllegalArgumentException("i = " + i);
			
			
		}
		
		
		
	}
	
}
