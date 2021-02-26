package customexceptions;

public class ThrowsDemo {
	
	void division() throws ArithmeticException {
		
		int a = 45, b = 0, rs;
		
		rs = a / b;
		
		System.out.println("\n\tThe result is : " + rs);
	}
}
