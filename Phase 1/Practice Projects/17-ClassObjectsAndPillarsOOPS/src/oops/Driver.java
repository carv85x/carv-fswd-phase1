package oops;


/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 17 - Class Objects and Pillars of OOPS
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement class objects and OOPS
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Implement Dog class
		Dog scott = new Dog("Scott", "papillon", 5, "black");
		System.out.println(scott.toString());
		
		
		// Implement Sum class
		Sum s = new Sum();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10,20,30));
		System.out.println(s.sum(10.5,20.5));
		
		
		// Implement MountainBike class
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
		
		
		// Implement Encapsulate class
		Encapsulate obj = new Encapsulate();
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getRoll());
		
		
		// Implement Circle and Rectangle
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}
}
