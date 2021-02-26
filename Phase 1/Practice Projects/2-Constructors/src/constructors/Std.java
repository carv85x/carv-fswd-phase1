package constructors;

// Parameterized Constructor
public class Std {
	
	int id;
	String name;
	
	Std(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display( ) {
		System.out.println(this.id + " " + this.name);
	}
}
