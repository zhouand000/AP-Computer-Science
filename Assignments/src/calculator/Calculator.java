package calculator;

import java.util.Scanner;

/**
 * @author andrew
 *
 */
public class Calculator {
	
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		System.out.print("Radius: ");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		scanner.close();
		Sphere sphere = new Sphere(radius);
		
		System.out.println("Radius: " + sphere.RADIUS);
		System.out.println("Diameter: " + sphere.DIAMETER);
		System.out.println("Circumference: " + sphere.CIRCUMFERENCE);
		System.out.println("Surface Area: " + sphere.SURFACEAREA);
		System.out.println("Volume: " + sphere.VOLUME);
	}
	
}