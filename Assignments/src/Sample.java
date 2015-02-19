import java.util.Scanner;

@SuppressWarnings("javadoc")
public class Sample {
	
	public static void main (String[] args) {
		
		int inum;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		inum = reader.nextInt();
		reader.close();
		if (inum > 0) {
			System.out.println(inum + "is positive.");
		}
		else if (inum < 0) {
			System.out.println(inum + "is negative.");
		}
		else {
			System.out.println(inum + "is zero.");
		}
		
	}
	
}
