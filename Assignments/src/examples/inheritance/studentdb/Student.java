package examples.inheritance.studentdb;

/**
 * @author Andrew
 *
 */
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private int id;
	
	private int grade;
	
	private int age;
	
	/**
	 * Default Constructor
	 */
	public Student () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public Student (int id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param grade 
	 * @param age
	 */
	public Student (int id, String firstName, String lastName, int grade, int age) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.age = age;
		
	}
	
	@Override
	public String toString () {
		
		return id + " : " + firstName + " " + lastName;
		
	}
	
	/**
	 * Sets name
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public void setName (String firstName, String lastName) {
		
		firstName = sanitize(firstName);
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	/**
	 * @param str
	 * @return a string that has been sanitized
	 */
	public String sanitize (String str) {
		
		return str.replaceAll("[ ]", "");
		
	}
	
	/**
	 * @return the name of the student
	 */
	public String getName () {
		
		return firstName + " " + lastName;
		
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName () {
		return firstName;
	}
	
	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName () {
		return lastName;
	}
	
	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the ID
	 */
	public int getID () {
		return id;
	}
	
	/**
	 * @param ID
	 *            the iD to set
	 */
	public void setID (int ID) {
		this.id = ID;
	}
	
	/**
	 * @return the grade
	 */
	public int getGrade () {
		return grade;
	}
	
	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade (int grade) {
		this.grade = grade;
	}
	
	/**
	 * @return the age
	 */
	public int getAge () {
		return age;
	}
	
	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge (int age) {
		this.age = age;
	}
	
}
