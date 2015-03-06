package battleship;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Log {
	
	final public SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	final public File log = new File("BattleshipGameLog_" + sdf.format(new Date()));
		
	private BufferedReader br;
	
	private BufferedWriter bw;
		
	private Scanner scanner;
	
	
	
	public Log () {
		
		init();
		
	}
	
	/**
	 * Initializes log
	 */
	public void init() {
		
		try {
			
			log.createNewFile();
			
			bw = new BufferedWriter(new FileWriter(log, true));
			scanner = new Scanner(br);
			
			
			
			
		}
		catch (IOException e) {
			
			System.err.println("Log could not be created.\n\n");
			e.printStackTrace();
		}
		
	}
	
	
	
	public void print(String str) {
		
		System.out.print(str);
		try {
			bw.write(str);
		}
		catch (IOException e) {

			System.err.println("Writing to log failed.");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void write(String str) {
		
		try {
			bw.write(str);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeln(String str) {
		
		write (str + "\n");
		
	}
	

}
