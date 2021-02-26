package customexceptions;

public class FinallyBlockDemo {
	
	int division() throws ArithmeticException {
		
		int a = 45, b = 0, rs;
		
		rs = a / b;
		
		System.out.println("\n\tThe result is : " + rs);
		
		return rs;
	}

}
