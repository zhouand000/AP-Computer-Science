/**
 * 
 */
package examples.graphics;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author Andrew
 * 
 */
@SuppressWarnings("serial")
public class ShapeDisplay extends JFrame implements ActionListener {
	
	private JButton button;
	
	private JPanel panel;
	
	private Graphics canvas;
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		ShapeDisplay diplay = new ShapeDisplay();
		diplay.setSize(400, 300);
		diplay.createGUI();
		
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
		button.addActionListener(this);
		
		setVisible(true);
		
		canvas = panel.getGraphics();
		
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed (ActionEvent e) {
		
		draw();
		
	}
	
	private void draw () {
		
		canvas.setColor(Color.blue);
		canvas.fillRect(0, 0, 50, 50);
		
	}
	
}
