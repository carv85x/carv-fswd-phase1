package calculator;

public class Calculator {	
	
	private double result;
	
	public Calculator() {		
		result = 0.0;
	}
	
	public void showInstructions() {
		
		System.out.println("Welcome to the Arithmetic Calculator");
		System.out.println("\nFollow these steps to use the calculator:");
		System.out.println("1) Enter the first number or use previous result (default is '0')");
		System.out.println("2) Enter arithmetic operator ('-','+','/','*')");
		System.out.println("3) Enter the second number");
		System.out.println("4) Enter 'c' to clear result");
		System.out.println("5) Enter 'help' to show instructions");
		System.out.println("6) Enter 'exit' to exit the program");		
	}
	
	public double getResult() {
		return result;
	}
	
	public void resetResult() {
		result = 0.0;
	}
	
	public void substract(double numOne, double numTwo) {
		result = numOne - numTwo;
	}
	
	public void add(double numOne, double numTwo) {
		result = numOne + numTwo;
	}
	
	public void divide(double numOne, double numTwo) {
		result = numOne / numTwo;
	}
	
	public void multiply(double numOne, double numTwo) {
		result = numOne * numTwo;
	}

}	
