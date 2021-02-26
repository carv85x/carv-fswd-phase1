package constructors;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 2 - Constructors
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement provided
 * constructors
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Default constructor
		EmpInfo emp1 = new EmpInfo();
		EmpInfo emp2 = new EmpInfo();
		
		emp1.display();
		emp2.display();
		
		
		// Parameterized constructor
		Std std1 = new Std(2,"Alex");
		Std std2 = new Std(10,"Annie");
		
		std1.display();
		std2.display();
	}

}
