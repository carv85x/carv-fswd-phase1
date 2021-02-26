package innerclass;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 5 - Inner Class
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement inner classes
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Inner Class Assisted 1
		InnerClassAssisted1 obj1 = new InnerClassAssisted1();
		InnerClassAssisted1.Inner in1 = obj1.new Inner();
		in1.hello();
		
		
		// Inner Class Assisted 2
		InnerClassAssisted2 obj2 = new InnerClassAssisted2();
		obj2.display();
		
		
		// Anonymous Inner Class
		InnerClassAssisted3 obj3 = new InnerClassAssisted3();
		obj3.display();
		
		
	}
}
