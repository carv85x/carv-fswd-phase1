package diamondproblem;


/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 18 - Diamond Problem
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement solution to the diamond problem
 *************************************************/
public class Driver implements First, Second {
	
	public void show() {
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		Driver ob = new Driver();
		ob.show();
	}

}
