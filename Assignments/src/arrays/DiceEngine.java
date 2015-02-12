package arrays;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("javadoc")
public class DiceEngine {
	
	public static void main (String[] args) {
		
		// Creates Scanner and Random
		Scanner reader = new Scanner(System.in);
		Random random = new Random(0);
		
		// Gets number of rolls
		System.out.print("Number of rolls: \n:");
		int rolls = reader.nextInt();
		
		// Gets number of dice
		System.out.print("Number of Dice: \n:");
		int dice = reader.nextInt();
		
		// Closes Scanner
		reader.close();
		
		// Creates array
		int[][] rollArray = new int[rolls][dice];
		
		// Creates stringArrayList and countArrayList
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		
		ArrayList<Integer> countArrayList = new ArrayList<Integer>();
		
		// Loops and gets rolls and prints, and counts the number of each
		// combination
		System.out.println("The rolls were: ");
		for (int i = 0; i < rolls; i++) {
			
			// Loops and gets individual dice rolls and prints
			for (int j = 0; j < dice; j++) {
				
				// The +1 is to move from [0,5] to [1,6]
				rollArray[i][j] = random.nextInt(5) + 1;
				
			}
			
			// Sorts the dice
			Arrays.sort(rollArray[i]);
			
			// Creates String to output
			String output = Arrays.toString(rollArray[i]);
			
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
		
		// Prints out the frequency table
		System.out.println("There was/were: ");
		for (int i = 0; i < stringArrayList.size(); i++) {
			
			System.out.print(countArrayList.get(i).toString() + " x "
					+ stringArrayList.get(i) + "\n");
			
		}
		
		// System.out.println(Arrays.deepToString(stringArray));
		
	}
	
	// Compares two arrays, and sees if they are combinations
	public static boolean isCombinationEqual (int[] a, int[] b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (a == b) {
			
			return true;
			
		}
		else return false;
		
	}
	
}
