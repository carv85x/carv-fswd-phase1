package customexceptions;


/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 14 - Custom Exceptions
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement custom exceptions
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Throws Demo
		ThrowsDemo t = new ThrowsDemo();
		
		try {
			t.division();
		} catch(ArithmeticException ex) {
			System.out.println("\n\tError : " + ex.getMessage());
		}
		
		System.out.println("\n\tEnd of program");
		
		
		// Finally Block Demo
		FinallyBlockDemo f = new FinallyBlockDemo();
		int rs = 0;
		try {
			rs = f.division();
		} catch(ArithmeticException ex) {
			System.out.println("\n\tError : " + ex.getMessage());
		} finally {
			System.out.println("\n\tThe result is : " + rs);
		}
		
		
		// Custom Exception
		try {
			throw new CustomException("temp");
		} catch(CustomException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
		
	}

}
