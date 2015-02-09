package minesweeper;
import java.awt.Color;

public enum MinesNear {
	
	Zero(0, Color.WHITE),
	One(1, Color.BLUE),
	Two(2, Color.GREEN),
	Three(3, Color.RED),
	Four(4, Color.MAGENTA),
	Five(5, new Color(.5f,0f,0f)),
	Six(6, Color.CYAN),
	Seven(7, Color.BLACK),
	Eight(8, Color.GRAY);
	
	int mines;
	Color color;
	
	MinesNear(int mines, Color color) {
		
		this.mines = mines;
		this.color = color;
		
	}
}
