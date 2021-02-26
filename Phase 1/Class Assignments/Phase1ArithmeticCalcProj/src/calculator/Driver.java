package calculator;
import java.util.*; 

public class Driver {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		Scanner input = new Scanner(System.in);
		
		// Show instructions to use app first
		calc.showInstructions();		

		double number = 0.0;

		String answer = "0";		
		
		// Loop based on user input until {answer} equals 'exit'
		while(!answer.toLowerCase().equals("exit")) {		
			
			System.out.println(calc.getResult());			
			
			answer = input.next();			
			
			if(isNum(answer)) {				
				// If numeric, override number, request operator and continue next iteration of loop
				number = Double.parseDouble(answer);				
				System.out.println("Enter operator ('-','+','/','*')");
			} else {
				// If NOT numeric, set 1st number to current results and evaluate {answer} string				
				switch(answer.toLowerCase()) {
				case "-":
					// subtraction
					System.out.println("Enter second number:");					
					answer = input.next();
					calc.substract(number, Double.parseDouble(answer));				
					break;
				case "+":
					// addition
					System.out.println("Enter second number:");
					answer = input.next();
					calc.add(number, Double.parseDouble(answer));				
					break;
				case "/":
					// division
					System.out.println("Enter second number:");
					answer = input.next();
					calc.divide(number, Double.parseDouble(answer));
					break;
				case "*":
					// multiplication
					System.out.println("Enter second number:");
					answer = input.next();
					calc.multiply(number, Double.parseDouble(answer));
					break;
				case "c":
					// Clear result
					calc.resetResult();
					break;
				case "help":
					calc.showInstructions();
					break;
				case "exit":
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid input");
					break;	
				}
				
				// Save current value in calculator to use as first number
				number = calc.getResult();
				
			}			
		}
		
		input.close();
	}
	
	// Method used to check whether String contains a number
	private static boolean isNum(String s) {	
		
		try {
			Double.parseDouble(s);
			
			return true;
		} catch(NumberFormatException e) {
			return false;
		}	
	}
	
}
