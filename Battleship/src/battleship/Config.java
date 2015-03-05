package battleship;

import java.io.*;
import java.util.Scanner;


public class Config {
	
	final File config = new File("BattleshipGameConfig.txt");
	private boolean isNewConfig;
	private BufferedReader br;
	private BufferedWriter bw;
	private Scanner scanner;
	
	public String playerName;
	public long seed;
	
	
	
	public void init(){
		
		try {
			
			if(config.createNewFile()){
				
				isNewConfig = true;
								
			}
			
			br = new BufferedReader(new FileReader(config));
			bw = new BufferedWriter(new FileWriter(config, true));
			scanner = new Scanner(br);
			
			
			if (isNewConfig){
				
				writeln("name = " + playerName);
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
	
	
	
	public Config(){
		
		init();
		
	}
	
	public void writeln(String s) throws IOException{
		
		bw.write(s + "\n");
		
	}
	
	public String getPlayerName(){
		
		return playerName;
		
	}



	public boolean isNewConfig () {
		return isNewConfig;
	}

	public void readConfig() throws IOException {
		
		while (scanner.hasNextLine()){
			
			String input = scanner.nextLine();
			if (input.contains(playerName)) {
				playerName = input.replaceAll("[\\s]", "").split("=")[1];
			}
			else if (input.contains(Long.toString(seed))) {
				
				seed = Long.parseLong(input.replaceAll("[\\s]", "").split("=")[1]);
				
			}
			
		}
	}
	
	public void setConfig() {
		
		
		
	}
	
	public void setNewConfig (boolean isNewConfig) {
		this.isNewConfig = isNewConfig;
	}
	
	
}
