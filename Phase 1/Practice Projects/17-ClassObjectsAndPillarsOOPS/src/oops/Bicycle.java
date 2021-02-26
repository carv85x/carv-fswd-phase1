package oops;

public class Bicycle {
	
	int gear;
	int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return "No of gears are " + gear + "\nspeed of bicycle is" + speed;
	}
	
	
}
