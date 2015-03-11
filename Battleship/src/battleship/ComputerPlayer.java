package battleship;

import java.util.*;

/**
 * @author Andrew
 *
 */
public class ComputerPlayer extends Player {
	
	private Random random = game.random;
	
	private ArrayList<Ship> shipList = new ArrayList<Ship>();
	
	/**
	 * Constructor
	 */
	public ComputerPlayer () {
		
		name = "Computer";
		fillBoard();
		
	}
	
	/**
	 * Fills the board with ships
	 */
	public void fillBoard () {
		
		// System.err.println("DEBUG: ComputerPlayer.fillBoard(): Entered fillBoard()");
		for (ShipType type : game.shipClassArray) {
			
			// System.err.println("DEBUG:ComputerPlayer.fillBoard(): Placing " + type + " class ship");
			Ship ship = placeShip(type);
			if (ship.locationArray != null) {
				
				shipList.add(ship);
				game.shipArray.add(ship);
				
			}
			// System.err.println("DEBUG: ComputerPlayer.fillBoard(): placed a ship in the array, and in the grid");
			
		}
		
	}
	
	/**
	 * @param type
	 *            the type of ship to place
	 * @return a ship with valid coordinates
	 */
	public Ship placeShip (final ShipType type) {
		// System.err.println("err.println Entered ComputerPlayer.placeShip(): Starting method");
		boolean sucess = false;
		// System.err.println("DEBUG: ComputerPlayer.placeShip(): Creating new ship");
		Ship ship = new Ship(type);
		// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished creating new ship");
		int counter = 0;
		Direction direction = random.nextBoolean()
				? Direction.DOWN
				: Direction.RIGHT;
		// System.err.println("DEBUG: ComputerPlayer.placeShip(): About to call getSize()");
		int shipSize = type.getSize();
		// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished getSize() call");
		
		int xCoord = 0;
		int yCoord = 0;
		
		while (!sucess && counter < 200) {
			counter++;
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): In while loop, counter = " + counter);
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Getting direction");
			direction = random.nextBoolean()
					? Direction.DOWN
					: Direction.RIGHT;
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished getting direction, direction = " + direction.toString());
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Getting coords");
			xCoord = random.nextInt(shipBoard.size);
			yCoord = random.nextInt(shipBoard.size);
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished getting coords, coords are: " + xCoord + "," + yCoord);
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Checking direction");
			sucess = checkDirection(direction, shipSize, xCoord, yCoord);
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished initial direction check, checkDirection() returned " + sucess);
			
			if (!sucess) {
				direction = direction == Direction.DOWN ? Direction.RIGHT
						: Direction.DOWN;
				sucess = sucess ? sucess : checkDirection(direction
						, shipSize, xCoord, yCoord);
				// System.err.println("DEBUG: ComputerPlayer.placeShip(): Finished secondary direction check, direction = " + direction);
				// System.err.println("DEBUG: ComputerPlayer.placeShip(): checkDirection() returned "+ sucess);
			}
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): Coordinates are: " + "(" + xCoord + ',' + yCoord + ")");
			// System.err.println("DEBUG:ComputerPlayer.placeShip(): " + "Direction is:" + direction);
			// System.err.println("DEBUG: ComputerPlayer.placeShip(): The shipType is " + type);
			
		}
		// System.err.println("DEBUG: ComputerPlayer.placeShip(): In 'if' statement");
		switch (direction) {
			case DOWN:
				
				for (int i = 0; i < shipSize; i++) {
					
					Sector sector = new Sector(xCoord, yCoord + i);
					sector.setShip(ship, i);
					sector.setPosition(i);
					ship.addSector(sector);
					shipBoard.grid[xCoord][yCoord + i] = sector;
					// System.err.println("DEBUG: ComputerPlayer.placeShip(): Done with one for loop interation: i = " + i);
				}
				break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					Sector sector = new Sector(xCoord + i, yCoord);
					sector.setShip(ship, i);
					sector.setPosition(i);
					ship.addSector(sector);
					shipBoard.grid[xCoord + i][yCoord] = sector;
					// System.err.println("DEBUG: ComputerPlayer.placeShip(): Done with one for loop interation: i = " + i);
					
				}
			default:
				throw new NullPointerException("Something went wrong in ComputerPlayer.placeShip(), probably in the logic");
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
		
		// System.err.println("DEBUG: ComputerPlayer.checkCoord(): Coordinates are: " + "(" + xCoord + "," + yCoord + ")");
		
		if (xCoord >= shipBoard.size || xCoord < 0 || yCoord >= shipBoard.size
				|| yCoord < 0) {
			// System.err.println("DEBUG: ComputerPlayer.checkCoord(): Failed first test");
			return false;
		}
		// System.err.println("DEBUG:In checkCoord(): " + shipBoard.grid[xCoord][yCoord].hasShip());
		
		// Checks if the conditions are valid
		// shipBoard.grid[xCoord][yCoord].hasShip() will return true if it has a
		// ship, so we want to negate that
		if (!shipBoard.grid[xCoord][yCoord].hasShip()) {
			// System.err.println("DEBUG: ComputerPlayer.checkCoord(): Failed test 2");
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
		
		// System.err.println("DEBUG: ComputerPlayer.checkDirection(): The shipSize is " + shipSize);
		
		switch (direction) {
			case DOWN:
				
				for (int i = 0; i < shipSize; i++) {
					// Checks if the conditions are valid
					if (checkCoord(xCoord, yCoord + i) == false) {
						return false;
					}
					
				}
				break;
			case RIGHT:
				for (int i = 0; i < shipSize; i++) {
					
					// Checks if the conditions are valid
					if (checkCoord(xCoord + i, yCoord) == false) {
						return false;
					}
				}
				
				break;
		
		}
		return true;
		
	}
	
}
