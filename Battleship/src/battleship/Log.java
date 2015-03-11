package battleship;

import java.io.*;
import java.util.*;

/**
 * @author Andrew
 *
 */
public class Log {
	
	private Date creationTime = new Date();
	
	/**
	 * Actual file
	 */
	final public File log = new File("BattleshipGameLog_"
			+ Util.formatTime(creationTime) + ".txt");
	
	private BufferedReader br;
	
	private BufferedWriter bw;
	
	@SuppressWarnings("unused")
	private Scanner scanner;
	
	/**
	 * 
	 */
	public BattleshipGame game = BattleshipGame.getInstance();
	
	/**
	 * Default constructor
	 */
	public Log () {
		
		try {
			
			log.createNewFile();
			br = new BufferedReader(new FileReader(log));
			bw = new BufferedWriter(new FileWriter(log, true));
			scanner = new Scanner(br);
			
		}
		catch (IOException e) {
			
			System.err.println("Log could not be created.\n\n");
			e.printStackTrace();
		}
		// System.err.println("DEBUG:Finished Log constructor");
	}
	
	/**
	 * Prints a string and sends to log
	 * 
	 * @param str
	 *            The string to print
	 */
	public void print (String str) {
		
		System.out.print(str);
		try {
			bw.write(str);
		}
		catch (IOException e) {
			
			System.err.println("Writing to log failed.");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Creates the log file's header
	 */
	public void writeHeader () {
		
		writeln(Util.formatTime(creationTime));
		writeln("Player name: " + game.player.name);
		writeln("Seed: " + game.config.seed);
		writeln("Board size: " + game.size);
		if (game.isCheatModeOn) {
			
			writeln("Cheat mode is enabled");
			
		}
		write("\n");
		write("\n");
		
	}
	
	/**
	 * @param str
	 *            The string to write
	 */
	public void write (String str) {
		
		try {
			bw.write(str);
			bw.flush();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Writes str and appends a newline
	 * 
	 * @param str
	 *            The string to write
	 */
	public void writeln (String str) {
		
		write(str + "\n");
		
	}
	
	/**
	 * Writes a newline
	 */
	public void writeln () {
		
		write("\n");
	}
	
}
