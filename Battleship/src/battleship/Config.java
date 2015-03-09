package battleship;

import java.io.*;
import java.util.Scanner;

/**
 * @author Andrew Configuration file
 */
public class Config {
	
	final File configFile = new File("BattleshipGameConfig.txt");
	
	private boolean isNewConfig;
	
	private BufferedReader br;
	
	private BufferedWriter bw;
	
	private Scanner fileScanner;
	
	/**
	 * The Player's Name
	 */
	public String playerName;
	
	/**
	 * The RNG Seed
	 */
	public long seed;
	
	/**
	 * Constructor for configuration file
	 */
	public Config () {
		
		try {
			
			if (configFile.createNewFile()|| true) {
				
				isNewConfig = true;
				
			}
			configFile.createNewFile();
			br = new BufferedReader(new FileReader(configFile));
			bw = new BufferedWriter(new FileWriter(configFile, true));
			fileScanner = new Scanner(br);
			
			if (isNewConfig) {
				
				writeln("name = " + getPlayerName());
				writeln("seed = " + seed);
				
			}
			else {
				
			}
		}
		catch (IOException e) {
			
			System.err.println("Config could not be created.\n\n");
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * Writes a line to the config
	 * 
	 * @param s
	 * @throws IOException
	 */
	private void writeln (String s) throws IOException {
		
		bw.write(s + "\n");
		
	}
	
	
	
	/**
	 * @return Returns the Player Name
	 * 
	 */
	public String getPlayerName() {
		
		if (isNewConfig) {
			
			do {
				System.out.print("Please enter your name:\n:");
				playerName = BattleshipGame.scanner.nextLine();
			}
			while (playerName == "");
			
			
			
			writeConfig();
			
		}
		
		return playerName;
		
	}
	
	/**
	 * @return Returns the seed
	 */
	public long getSeed() {
		
		if (isNewConfig) {
			
			seed = (long) Math.random() * Long.MAX_VALUE;
			
		}
		
		return seed;
		
	}
	
	
	/**
	 * @throws IOException
	 */
	public void loadConfig() throws IOException {
		
		while (fileScanner.hasNextLine()) {
			
			String input = fileScanner.nextLine();
			if (input.contains(playerName)) {
				playerName = input.replaceAll("[\\s]", "").split("=")[1];
			}
			else if (input.contains(Long.toString(seed))) {
				
				seed = Long
						.parseLong(input.replaceAll("[\\s]", "").split("=")[1]);
				
			}
			
		}
	}
	
	/**
	 * Writes the current values to config
	 */
	public void writeConfig() {
		
		if (configFile.exists()) {
			configFile.delete();
		}
		
		try {
			configFile.createNewFile();
			bw.write("playerName = " + playerName + "\n");
			bw.write("seed = " + seed + "\n");
		}
		catch (IOException e) {
			
			System.err.println("Exception occured while writing to config");
			e.printStackTrace();
		}
		
	}
	
}
