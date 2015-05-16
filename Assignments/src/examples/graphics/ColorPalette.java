/**
 * 
 */
package examples.graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Andrew
 * 
 */
@SuppressWarnings("serial")
public class ColorPalette extends JFrame {
	
	private JPanel panel;
	
	private Graphics canvas;
	
	private JButton button;
	
	private Random rng = new Random(0);
	
	/**
	 * 
	 */
	public ColorPalette () {
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		new ColorPalette().run();
		
	}
	
	/**
	 * 
	 */
	public void run () {
		
		setSize(400, 300);
		createGUI();
		try {
			Thread.sleep(25);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		fillPanel();
		
	}
	
	/**
	 * Creates GUI
	 */
	public void createGUI () {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		this.panel = new JPanel();
		this.panel.setPreferredSize(new Dimension(300, 225));
		this.panel.setBackground(Color.white);
		window.add(this.panel);
		
		this.button = new JButton("Display");
		window.add(this.button);
		this.button.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed (ActionEvent e) {
						
						fillPanel();
						
					}
					
				}
				);
		
		setVisible(true);
		
		this.canvas = this.panel.getGraphics();
		
	}
	
	/**
	 * Fills the panel
	 */
	public void fillPanel () {
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				fillTile(i * 75, j * 75);
				
			}
			
		}
	}
	
	/**
	 * Creates a square at the given x and y coordinates with width 75
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 * 
	 */
	public void fillTile (int x, int y) {
		
		this.canvas.setColor(new Color(this.rng.nextInt(256), this.rng.nextInt(256), this.rng.nextInt(256), this.rng.nextInt(256)));
		this.canvas.fillRect(x, y, 75, 75);
		
	}
	
}
