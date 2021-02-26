package accmodifier;

public class SomeClass {		
	
	public int somePublicInt;
	protected int someProtectedInt;
	int someNonModInt;
	private int somePrivateInt;
	
	public SomeClass() {
		this.somePublicInt 		= 4;
		this.someProtectedInt 	= 3;
		this.someNonModInt 		= 2;
		this.somePrivateInt 	= 1;
	}
	
	public int getSomePublicInt() {
		return somePublicInt;
	}
	
	public int getSomeProtectedInt() {
		return someProtectedInt;
	}
	
	public int getSomeNonModInt() {
		return someNonModInt;
	}
	
	public int getSomePrivateInt() {
		return somePrivateInt;
	}
}
