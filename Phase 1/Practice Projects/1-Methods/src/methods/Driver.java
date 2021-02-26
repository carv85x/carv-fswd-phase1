package methods;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 1 - Methods
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement methods
 * in provided classes.
 *************************************************/
public class Driver {

	
	public static void main(String[] args) {
		
		// Call methods in class "OverloadMethod"
		OverloadMethod ob=new OverloadMethod();
		System.out.println("Triangle with base = 5 and height = 5:");
		ob.area(5,5);
		
		System.out.println("Triangle with base = 4 and height = 6:");
		ob.area(4,6);
		
		System.out.println("Circle with radius = 7:");
		ob.area(7);  
		
		
		// Call methods in class "MethodExecution"
		MethodExecution b=new MethodExecution();		
		
		int ans= b.multipyNumbers(7,4);
		System.out.println("Multipilcation of 7 and 4 is :"+ans);
		
		ans= b.multipyNumbers(13,8);
		System.out.println("Multipilcation of 13 and 8 is :"+ans);
		
		ans= b.multipyNumbers(9,9);
		System.out.println("Multipilcation of 9 and 9 is :"+ans);
		
				
		// Call methods in class "CallMethod"
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(500);
		System.out.println("After operation value of data is "+d.val);
	}

}
