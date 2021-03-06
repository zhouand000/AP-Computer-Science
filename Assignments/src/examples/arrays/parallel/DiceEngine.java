package examples.arrays.parallel;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("javadoc")
public class DiceEngine {
	
	// Initializer for Scanner and Random
	Scanner reader = new Scanner(System.in);
	
	Random random = new Random(0);
	
	private int rolls;
	
	private int dice;
	
	// Initializer
	{
		// Gets number of rolls
		System.out.print("Number of rolls: \n:");
		rolls = reader.nextInt();
		
		// Gets number of dice
		System.out.print("Number of Dice: \n:");
		dice = reader.nextInt();
	}
	
	private int[][] rollArrays = new int[rolls][dice];
	
	// Creates stringArrayList and countArrayList
	private ArrayList<String> stringArrayList = new ArrayList<String>();
	
	private ArrayList<Integer> countArrayList = new ArrayList<Integer>();
	
	public static void main (String[] args) {
		
		// Creates DiceEngine
		new DiceEngine().run();
		
	}
	
	public void readConfig () {
		
	}
	
	public void getRolls () {
		
		// Loops and gets rolls and prints, and counts the number of each
		// combination
		System.out.println("The rolls were: ");
		for (int i = 0; i < rolls; i++) {
			
			// Loops and gets individual dice rolls and prints
			for (int j = 0; j < dice; j++) {
				
				// The +1 is to move from [0,5] to [1,6]
				rollArrays[i][j] = random.nextInt(5) + 1;
				
			}
			
			// Sorts the dice
			Arrays.sort(rollArrays[i]);
			
			// Creates String to output
			String output = Arrays.toString(rollArrays[i]);
			
			// Prints the dice roll
			System.out.println(output);
			
			// Gets the index of the dice roll, if it already exists. If not,
			// then index = -1
			int index = stringArrayList.indexOf(output);
			
			// Basically checks if the dice roll already exists in the array. If
			// not, then:
			if (index == -1) {
				
				// Adds dice roll to the outputArrayList
				stringArrayList.add(output);
				
				// Since the dice roll exists once, then set the counter to 1
				countArrayList.add(1);
				
			}
			
			// Should only happen if the dice roll exists. If that happens,
			else {
				
				// Increment the dice roll's counter. Since it exists, it should
				// be at index
				countArrayList.set(index, countArrayList.get(index) + 1);
				
			}
			
		}
		
	}
	
	public void printResults () {
		// Prints out the frequency table
		System.out.println("There was/were: ");
		for (int i = 0; i < stringArrayList.size(); i++) {
			
			System.out.print(countArrayList.get(i).toString() + " x "
					+ stringArrayList.get(i) + "\n");
			
		}
	}
	
	public void run () {
		
		readConfig();
		getRolls();
		printResults();
		
	}
	
	// Compares two arrays, and sees if they are combinations
	public boolean isCombinationEqual (int[] a, int[] b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (a == b) {
			
			return true;
			
		}
		else return false;
		
	}
	
}
