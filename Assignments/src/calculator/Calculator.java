package calculator;

import java.util.Scanner;

@SuppressWarnings("javadoc")
public class Calculator {
	
	public static void main (String[] args) {
		
		// Gets input
		System.out.print("Radius: ");
		Scanner reader = new Scanner(System.in);
		double radius = reader.nextDouble();
		reader.close();
		Sphere sphere = new Sphere(radius);
		
		// Prints properties
		System.out.println("Radius: " + sphere.RADIUS);
		System.out.println("Diameter: " + sphere.DIAMETER);
		System.out.println("Circumference: " + sphere.CIRCUMFERENCE);
		System.out.println("Surface Area: " + sphere.SURFACEAREA);
		System.out.println("Volume: " + sphere.VOLUME);
	}
	
}
