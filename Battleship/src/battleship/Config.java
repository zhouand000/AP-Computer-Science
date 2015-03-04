package battleship;

import java.io.*;
import java.util.Scanner;


public class Config {
	
	final File config = new File("BattleshipGameConfig.txt");
	private boolean isNewConfig;
	private BufferedReader br;
	private BufferedWriter bw;
	private Scanner scanner;
	
	public String name;
	
	
	
	
	public void init(){
		
		try {
			
			if(config.createNewFile()){
				
				isNewConfig = true;
								
			}
			
			br = new BufferedReader(new FileReader(config));
			bw = new BufferedWriter(new FileWriter(config));
			scanner = new Scanner(br);
			if (isNewConfig){
				
				writeln("name = " + name);
				
			}
		}
		catch (IOException e) {
			
			System.err.println("Config could not be created.\n\n");
			e.printStackTrace();
		}
		
	}
	
	
	
	public Config(){
		
	}
	
	public void writeln(String s) throws IOException{
		
		bw.write(s + "\n");
		
	}
	
	public boolean getConfig(){
		
		
		
	}



	public boolean isNewConfig () {
		return isNewConfig;
	}



	public void setNewConfig (boolean isNewConfig) {
		this.isNewConfig = isNewConfig;
	}
	
	
}
