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
	public ComputerPlayer () {
		
		name = "Computer";
		fillBoard();
		for (ShipType type : game.shipClassArray) {
			
			placeShip(type);
			
		}
		
	}
	
	/**
	 * Fills the board with ships
	 */
	public void fillBoard () {
		
		System.err
				.println("DEBUG: ComputerPlayer.fillBoard(): Entered fillBoard()");
		for (ShipType type : game.shipClassArray) {
			
			System.err.println("DEBUG: ComputerPlayer.fillBoard(): Placing "
					+ type
					+ " class ship");
			Ship ship = placeShip(type);
			if (ship.locationArray != null) {
				
				game.shipArray.add(ship);
				
			}
			System.err
					.println("DEBUG: ComputerPlayer.fillBoard(): placed a ship in the array, and in the grid");
			
		}
		
	}
	
	/**
	 * @param type
	 *            the type of ship to place
	 * @return a ship with valid coordinates
	 */
	public Ship placeShip (final ShipType type) {
		System.err
				.println("DEBUG: Entered ComputerPlayer.placeShip(): Starting method");
		boolean sucess = false;
		System.err
				.println("DEBUG: ComputerPlayer.placeShip(): Creating new ship");
		Ship ship = new Ship(type);
		System.err
				.println("DEBUG: ComputerPlayer.placeShip(): Finished creating new ship");
		int counter = 0;
		
		while (!sucess && counter < 200) {
			counter++;
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): In while loop, counter = "
							+ counter);
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): About to call getSize()");
			int shipSize = type.getSize();
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Finished getSize() call");
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Getting direction");
			Direction direction = random.nextInt(2) == 0
					? Direction.DOWN
					: Direction.RIGHT;
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Finished getting direction, direction = "
							+ direction.toString());
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Getting coords");
			int xCoord = random.nextInt(shipBoard.size);
			int yCoord = random.nextInt(shipBoard.size);
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Finished getting coords, coords are: "
							+ xCoord + "," + yCoord);
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Checking direction");
			sucess = checkDirection(direction, shipSize, xCoord, yCoord);
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Finished initial direction check, checkDirection() returned "
							+ sucess);
			
			if (!sucess) {
				direction = direction == Direction.DOWN ? Direction.RIGHT
						: Direction.DOWN;
				sucess = sucess ? sucess : checkDirection(direction
						, shipSize, xCoord, yCoord);
				if (sucess) {
					
					
					
				}
				System.err
						.println("DEBUG: ComputerPlayer.placeShip(): Finished secondary direction check, checkDirection() returned "
								+ sucess);
			}
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): Coordinates are: "
							+ "("
							+ xCoord
							+ ','
							+ yCoord
							+ ")");
			System.err.println("DEBUG: ComputerPlayer.placeShip(): "
					+ "Direction is:" + direction);
			System.err
					.println("DEBUG: ComputerPlayer.placeShip(): The shipType is "
							+ type);
			if (sucess) {
				
				System.err
						.println("DEBUG: ComputerPlayer.placeShip(): In 'if' statement");
				switch (direction) {
					case DOWN:
						
						for (int i = 0; i < shipSize; i++) {
							
							Sector sector = new Sector(xCoord, yCoord + i);
							sector.setShip(ship, i);
							sector.setPosition(i);
							ship.addSector(sector);
							shipBoard.grid[xCoord][yCoord + i] = sector;
							System.err
									.println("DEBUG: ComputerPlayer.placeShip(): Done with one for loop interation: i = "
											+ i);
						}
					break;
					case RIGHT:
						for (int i = 0; i < shipSize; i++) {
							
							Sector sector = new Sector(xCoord + i, yCoord);
							sector.setShip(ship, i);
							sector.setPosition(i);
							ship.addSector(sector);
							shipBoard.grid[xCoord + i][yCoord] = sector;
							System.err
									.println("DEBUG: ComputerPlayer.placeShip(): Done with one for loop interation: i = "
											+ i);
							
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
		if (xCoord >= shipBoard.size || xCoord < 0 || yCoord >= shipBoard.size
				|| yCoord < 0
				|| !shipBoard.grid[xCoord][yCoord].hasShip()) {
			
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
		
		switch (direction) {
			case DOWN:
				
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					if (checkCoord(xCoord, yCoord + i)) {
						return false;
					}
					
				}
			break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are not valid
					if (checkCoord(xCoord + i, yCoord)) {
						return false;
					}
				}
			
			break;
		
		}
		return true;
		
	}
	
}
