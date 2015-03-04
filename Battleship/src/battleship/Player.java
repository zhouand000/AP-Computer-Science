package battleship;

public class Player {
	
	public ShipBoard board;
	public HitBoard hitBoard;
	public String name;
	
	public Player () {
		
		this("Admiral");
		
	}
	
	public Player(String name) {
		
		this.name = name;
				
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void fire() {
		
		
		
	}
	
}
