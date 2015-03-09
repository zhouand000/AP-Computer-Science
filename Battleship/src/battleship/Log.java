package battleship;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Andrew
 *
 */
public class Log {
	
	/**
	 * Date formatter
	 */
	final public SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss:SSS");
	
	/**
	 * Actual file
	 */
	final public File log = new File("BattleshipGameLog_"
			+ getTimeString() + ".txt");
	
	private BufferedReader br;
	
	private BufferedWriter bw;
	
	@SuppressWarnings("unused")
	private Scanner scanner;
	
	/**
	 * Default constructor
	 */
	public Log () {
		
		init();
		
	}
	
	/**
	 * Initializes log
	 */
	private void init () {
		
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
	 * @return the current time, formatted using sdf
	 */
	public String getTimeString() {
		
		return sdf.format(new Date());
		
	}
	
	/**
	 * @param str
	 *            The string to write
	 */
	public void write (String str) {
		
		try {
			bw.write(str);
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @param str
	 *            The string to write
	 */
	public void writeln (String str) {
		
		write(str + "\n");
		
	}
	
}
