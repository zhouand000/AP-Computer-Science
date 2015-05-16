/**
 * 
 */
package examples.graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Andrew
 * 
 */
@SuppressWarnings({ "javadoc", "serial" })
public class HouseDisplay extends JFrame {
	
	private JButton button;
	
	private JPanel panel;
	
	private Graphics canvas;
	
	/**
	 * 
	 */
	public HouseDisplay () {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		
		new HouseDisplay().run();
		
	}
	
	public void run () {
		
		setSize(400, 300);
		createGUI();
		draw();
		
	}
	
	private void createGUI () {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 200));
		panel.setBackground(Color.white);
		window.add(panel);
		
		button = new JButton("Display");
		window.add(button);
		button.addActionListener(new Listener());
		
		setVisible(true);
		
		canvas = panel.getGraphics();
		
	}
	
	public void draw () {
		
		canvas.setColor(Color.BLACK);
		canvas.drawRect(125, 100, 50, 50);
		canvas.drawPolygon(new int[] {100, 150, 200}, new int[] {100, 50, 100}, 3);
		canvas.drawRect(135, 125, 10, 25);
		canvas.drawRect(155, 125, 10, 10);
		canvas.drawPolygon(new int[] {155, 155, 160, 160}, new int[] {55, 45, 45, 60}, 4);
		
	}
	
	public class Listener implements ActionListener {
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent
		 * )
		 */
		@Override
		public void actionPerformed (ActionEvent e) {
			
			draw();
			
		}
		
	}
}
