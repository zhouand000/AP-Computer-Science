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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Andrew
 * 
 */
@SuppressWarnings({ "javadoc", "serial" })
public class ArcheryDisplay extends JFrame {
	
	private JButton button;
	
	private JPanel panel;
	
	private Graphics canvas;
	
	/**
	 * 
	 */
	public ArcheryDisplay () {
		
	}
	
	public static void main (String[] args) {
		
		new ArcheryDisplay().run();
		
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
		
		this.panel = new JPanel();
		this.panel.setPreferredSize(new Dimension(300, 200));
		this.panel.setBackground(Color.white);
		window.add(this.panel);
		
		this.button = new JButton("Display");
		window.add(this.button);
		this.button.addActionListener(new Listener());
		
		setVisible(true);
		
		this.canvas = this.panel.getGraphics();
		this.canvas.setColor(Color.BLACK);
		
	}
	
	public void draw () {
		
		this.canvas.setColor(Color.RED);
		fillCircle(50);
		this.canvas.setColor(Color.WHITE);
		fillCircle(40);
		this.canvas.setColor(Color.RED);
		fillCircle(30);
		this.canvas.setColor(Color.WHITE);
		fillCircle(20);
		this.canvas.setColor(Color.RED);
		fillCircle(10);
		
	}
	
	public void fillCircle (int diameter) {
		
		this.canvas.fillOval(150 - diameter / 2, 100 - diameter / 2, diameter, diameter);
		
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
