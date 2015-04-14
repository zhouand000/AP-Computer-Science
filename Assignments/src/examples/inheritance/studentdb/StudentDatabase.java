package examples.inheritance.studentdb;

import java.util.*;

/**
 * StudentDB
 * 
 * @author Andrew
 *
 */
public class StudentDatabase {
	
	private HashMap<Integer, Student> map = new HashMap<Integer, Student>(16);
	
	/**
	 * The values
	 */
	public Collection<Student> values = map.values();
	
	/**
	 * Adds a new student
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public void add (int id, String firstName, String lastName) {
		
		if (!map.containsKey(id)) {
			
			map.put(id, new Student(id, firstName, lastName));
			
		}
		
	}
	
	/**
	 * Adds a student
	 * 
	 * @param s
	 */
	public void add (Student s) {
		
		map.put(s.getID(), s);
		
	}
	
	/**
	 * @param id
	 * @return null if there is no student with that id. Otherwise, returns the
	 *         student's full name.
	 */
	public String getName (int id) {
		
		Student s = map.get(id);
		if (s != null) {
			
			return s.getName();
			
		}
		
		else return null;
		
	}
	
	/**
	 * @param id the id
	 * @return the student with that id, or null if there is no match
	 */
	public Student findID (int id) {
		
		return map.get(id);
		
	}
	
	/**
	 * Gets all students with the same age
	 * 
	 * @param age
	 *            the age to query
	 * @return a HashMap containing all with the same age
	 */
	public HashMap<Integer, Student> findAge (int age) {
		
		HashMap<Integer, Student> output = new HashMap<Integer, Student>();
		
		Collection<Student> studentList = map.values();
		
		for (Student s : studentList) {
			
			if (s.getAge() == age) {
				
				output.put(s.getID(), s);
				
			}
			
		}
		
		return output;
		
	}
	
	/**
	 * Gets all students with the same grade
	 * 
	 * @param grade
	 *            the grade to query
	 * @return a HashMap containing all with the same grade
	 */
	public HashMap<Integer, Student> findGrade (int grade) {
		
		HashMap<Integer, Student> output = new HashMap<Integer, Student>();
		Collection<Student> studentList = map.values();
		
		for (Student s : studentList) {
			
			if (s.getGrade() == grade) {
				
				output.put(s.getID(), s);
				
			}
			
		}
		
		return output;
		
	}
	
	@Override
	public String toString () {
		
		return values.toString();
		
	}
	
}
