package examples.basicio.spheres;

/**
 * @author Andrew
 *
 */
public class Sphere {
	
	// Not including constructor with no parameters because I'd just throw an
	// exception anyways.
	
	final double RADIUS, DIAMETER, CIRCUMFERENCE, SURFACEAREA, VOLUME;
	
	Sphere (int radius) {
		
		this((double) radius); // Calls other constructor
		
	}
	
	// r is the radius
	
	Sphere (double radius) {
		
		RADIUS = radius;
		DIAMETER = 2 * radius;
		CIRCUMFERENCE = 2 * radius * Math.PI;
		SURFACEAREA = 4 / 3 * Math.PI * Math.pow(radius, 2);
		VOLUME = 4 / 3 * Math.PI * Math.pow(radius, 3);
		
	}
	
}
