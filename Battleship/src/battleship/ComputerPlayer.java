package battleship;

import java.util.Random;

/**
 * @author Andrew
 *
 */
public class ComputerPlayer extends Player {
	
	
	Random random = game.random;
	
	/**
	 * Constructor
	 */
	public ComputerPlayer() {
		
		name = "Computer";
		shipBoard.fillBoard();
		for(ShipType type : game.shipClassArray) {
			
			placeShip(type);
			
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
			int xCoord = random.nextInt(shipBoard.size);
			int yCoord = random.nextInt(shipBoard.size);
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
	 * Prints the board
	 */
	public void printShipBoard() {
		
		shipBoard.printBoard();
		
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
					result = shipBoard.checkCoord(xCoord, yCoord + i);
					if (result == false) {
						return false;
					}
					
				}
			break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					result = shipBoard.checkCoord(xCoord + i, yCoord);
					if (result == false) {
						return false;
					}
				}
			
			break;
		
		}
		return true;
		
	}
	
	
}
