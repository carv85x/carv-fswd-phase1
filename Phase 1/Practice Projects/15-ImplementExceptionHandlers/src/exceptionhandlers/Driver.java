package exceptionhandlers;


/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 15 - Implement Exception Handlers
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement exception handlers
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Starting off Try block");
			// Throw custom exception
			throw new MyException("This is my error message");
			
		} catch(MyException ex) {
			System.out.println("Catch Block");
			System.out.println(ex);
		}
		
	}

}
