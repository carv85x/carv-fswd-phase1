package accmodifier;

public class Driver {
	
	public static void main(String[] args) {
		
		// Init. SomeClass object
		SomeClass sc = new SomeClass();
		
		// Public attribute (Value = 4)
		System.out.println("Get value of public integer directly: " + sc.somePublicInt);
		System.out.println("Get value of public integer through method: " + sc.getSomePublicInt());
		
		// Protected attribute (Value = 3)
		// Able to get it directly due to being on same package and/or part of subclass!
		System.out.println("Get value of protected integer directly: " + sc.someProtectedInt); 
		System.out.println("Get value of protected integer through method: " + sc.getSomeProtectedInt());
		
		// Non-Modifier attribute (Value = 2)
		// Able to get it directly due to being on same package!
		System.out.println("Get value of non-modifier integer directly: " + sc.someNonModInt); 
		System.out.println("Get value of non-modifier integer through method: " + sc.getSomeNonModInt());
		
		// Private attribute (Value = 1)
		// Only accessible through method -- commenting out line with direct access
		//System.out.println("Get value of private integer directly: " + sc.somePrivateInt); 
		System.out.println("Get value of private integer through method: " + sc.getSomePrivateInt());
		
		System.out.println("Goodbye!");
	}
}
