package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

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
		
		// Creates array
		int[][] rollArray = new int[rolls][dice];
		
		// Loops and gets rolls
		for (int i = 0; i < rolls; i++) {
			
			// Loops and gets individual dice rolls
			for (int j = 0; j < dice; j++) {
				
				// The +1 is to move from [0,5] to [1,6]
				rollArray[i][j] = random.nextInt(5) + 1;
				
			}
			
		}
		
		// Prints out array
		System.out.println("The rolls are: ");
		// System.out.println(Arrays.deepToString(rollArray));
		
		for (int i = 0; i < rolls; i++) {
			
			System.out.println(Arrays.toString(rollArray[i]));
			
		}
		
		Arrays.sort(rollArray, new Comparator<int[]>() {
			
			@Override
			public int compare (int[] i, int[] j) {
				// Sorts the array
				Arrays.sort(i);
				Arrays.sort(j);
				
				// If statement to compare the two
				if (i[0] < j[0]) {
					
					// Tells sort to put i first
					return -1;
					
				}
				else if (i[0] > j[0]) {
					
					// Tells sort to put j first
					return 1;
					
				}
				else if (i.length > 1 && j.length > 1) {
					
					if (i[1] < j[1]) {
						
						// Tells sort to put i first
						return -1;
						
					}
					else if (i[1] > j[1]) {
						
						// Tells sort to put j first
						return 1;
						
					}
					else {
						
						return 0;
						
					}
				}
				else
					return 0;
			};
		});
		
		// Creates array to print out
		
		String[][] stringArray = new String[rolls-1][2];
		
		ArrayList<int[]> temp = new ArrayList<int[]>(Arrays.asList(rollArray));
		
		// Prints out numbers
		for (int pass = 0; pass < temp.size(); pass++) {
			
			int total = 1;
			for (int j = pass; j < temp.size(); j++) {
				
				System.out.println(Arrays.toString(temp.get(pass)).equals(
						Arrays.toString(temp.get(j))));
				if (Arrays.toString(temp.get(pass)).equals(
						Arrays.toString(temp.get(j)))) {
					
					total++;
					temp.remove(j);
					
					stringArray[pass][1] = Arrays.toString(temp.get(pass));
				}
				else {
					
					stringArray[pass][1] = Arrays.toString(temp.get(pass));
					
				}
				stringArray[pass][0] = Integer.toString(total);
			}
			
		}
		System.out.println("There is/are: ");
		for (int i = 0; i < stringArray.length; i++) {
			
			System.out.println(stringArray[i][0] + " x " + stringArray[i][1]);
			
		}
		
		// System.out.println(Arrays.deepToString(stringArray));
		
		// Closes Scanner
		reader.close();
		
	}
}
