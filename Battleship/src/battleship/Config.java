package battleship;

import java.io.*;
import java.util.Random;
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
	 * Regex expression that matches the config file line that gives the playerName
	 */
	public static final String PLAYER_NAME_REGEX = "(playerName)\\p{Blank}+=\\p{Blank}+\\p{Alnum}+\\n";
	
	/**
	 * Regex expression that matches the config file line that gives the seed
	 */
	public static final String SEED_REGEX = "(seed)\\p{Blank}+=\\p{Blank}+\\p{Digit}+\\n";
	
	/**
	 * Constructor for configuration file
	 */
	public Config () {
		
		try {
			
			if (!configFile.exists()) {
				System.err
				.println("DEBUG: Config.Config(): Config file doesn't exist, creating new file");
				configFile.createNewFile();
				isNewConfig = true;
				System.err.println("DEBUG: Creating new config file");
				
			}
			
			br = new BufferedReader(new FileReader(configFile));
			fileScanner = new Scanner(br);
			bw = new BufferedWriter(new FileWriter(configFile, true));
			loadConfig();
			
			
			
			if (!fileScanner.hasNext(PLAYER_NAME_REGEX)) {
				
				writeln("playerName = " + getPlayerName());
				
			}
			if (!fileScanner.hasNext(SEED_REGEX)) {
				
				writeln("seed = " + getSeed());
				
			}
			bw.flush();
			
		}
		catch (IOException e) {
			
			System.err.println("Config could not be created.\n\n");
			e.printStackTrace();
		}
		writeConfig();
		isNewConfig = false;
		System.err.println("DEBUG: Finished config constructor");
		
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
	public String getPlayerName () {
		
		if (isNewConfig || playerName == null) {
			
			do {
				System.out.print("Please enter your name:\n:");
				playerName = BattleshipGame.scanner.nextLine();
			}
			while (playerName.replaceAll("[\\s]", "") == ""
					|| playerName.matches("[\\s]"));
			
			System.err.println("DEBUG: exited validation loop");
			
			writeConfig();
			
		}
		
		return playerName;
		
	}
	
	/**
	 * @return Returns the seed
	 */
	public long getSeed () {
		
		if (isNewConfig) {
			
			seed = new Random(0).nextLong();
			
		}
		
		return seed;
		
	}
	
	/**
	 * @throws IOException
	 */
	public void loadConfig () throws IOException {
		
		boolean hasPlayerName = false;
		boolean hasSeed = false;
		
		while (fileScanner.hasNextLine()) {
			
			String input = fileScanner.nextLine();
			if (input.matches(PLAYER_NAME_REGEX)) {
				playerName = input.replaceAll("[\\s]", "").split("=")[1];
				hasPlayerName = true;
			}
			else if (input.matches(SEED_REGEX)) {
				
				seed = Long
						.parseLong(input.replaceAll("[\\s]", "").split("=")[1]);
				hasSeed = true;
			}
			
		}
		if (!hasPlayerName) {
			
			getPlayerName();
			
		}
		
		if (!hasSeed) {
			
			getSeed();
		}
	}
	
	/**
	 * Writes the current values to config
	 */
	public void writeConfig () {
		System.err.println("DEBUG: Config.writeConfig(): In writeConfig()");
		if (configFile.exists()) {
			configFile.delete();
		}
		
		try {
			configFile.createNewFile();
			bw.write("playerName = " + playerName + "\n");
			bw.write("seed = " + seed + "\n");
			bw.flush();
		}
		catch (IOException e) {
			
			System.err.println("Exception occured while writing to config");
			e.printStackTrace();
		}
		
	}
	
}
