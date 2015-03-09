package battleship;

import java.util.Random;

/**
 * @author Andrew
 * 
 *         The Board
 *
 */
public class ShipBoard extends Board {
	
	BattleshipGame game = BattleshipGame.getInstance();
	
	static Random random = new Random(0);
	
	private Sector[][] grid;
	
	// Creates variables
	int size;
	
	ShipBoard (int size) {
		
		this.size = size;
		this.grid = new Sector[size][size];
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				grid[i][j] = new Sector(i,j);
				
			}
			
		}
		
	}
	
	/**
	 * Fills the board with ships
	 */
	public void fillBoard () {
		
		for (ShipType type : game.shipClassArray) {
			
			game.shipArray.add(placeShip(type));
			
		}
		
	}
	
	/**
	 * @param type
	 *            the type of ship to place
	 * @return a ship with valid coordinates
	 */
	public Ship placeShip (final ShipType type) {
		
		boolean sucess = false;
		Ship ship = new Ship(type);
		
		while (!sucess) {
			int shipSize = type.getSize();
			int xCoord = random.nextInt(size);
			int yCoord = random.nextInt(size);
			Direction direction = (byte) random.nextInt(2) == 0
					? Direction.DOWN
					: Direction.RIGHT;
			sucess = checkDirection(direction, shipSize, xCoord, yCoord);
			
			if (sucess) {
				
				switch (direction) {
					case DOWN:
						
						for (int i = 0; i < shipSize; i++) {
							
							Sector sector = new Sector(xCoord, yCoord + i);
							sector.setShip(ship);
							sector.setPosition(i);
							ship.addSector(sector);
							
						}
					break;
					case RIGHT:
						for (int i = 0; i < shipSize; i++) {
							
							Sector sector = new Sector(xCoord + i, yCoord);
							sector.setShip(ship);
							sector.setPosition(i);
							ship.addSector(sector);
							
						}
					
					break;
				
				}
				
			}
			
		}
		return ship;
	}
	
	/**
	 * @param xCoord
	 *            xCoord to check
	 * @param yCoord
	 *            yCoord to check
	 * @return true if the coord is valid and empty
	 */
	public boolean checkCoord (int xCoord, int yCoord) {
		
		// Checks if the conditions are not valid
		if (xCoord >= size || xCoord < 0 || yCoord >= size || yCoord < 0
				|| grid[xCoord][yCoord].hasShip()) {
			
			return false;
			
		}
		else return true;
	}
	
	/**
	 * @param direction
	 *            The direction to check
	 * @param shipSize
	 * @param xCoord
	 * @param yCoord
	 * @return True if the direction is valid
	 */
	public boolean checkDirection (Direction direction, int shipSize,
			int xCoord, int yCoord) {
		
		boolean result;
		
		switch (direction) {
			case DOWN:
				
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					result = checkCoord(xCoord, yCoord + i);
					if (result == false) {
						return false;
					}
					
				}
			break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					result = checkCoord(xCoord + i, yCoord);
					if (result == false) {
						return false;
					}
				}
			
			break;
		
		}
		return true;
		
	}
	
	@Override
	public void printBoard () {
		
		System.out.println(getString());
		
	}
	
	@Override
	public String getString () {
		
		String output;
		
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				
				// TODO FINISH
				
			}
			
		}
		
		return output;
	}
	
}
