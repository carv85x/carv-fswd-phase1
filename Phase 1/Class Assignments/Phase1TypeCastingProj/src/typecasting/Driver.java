package typecasting;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		String answer = "";
		
		Scanner input = new Scanner(System.in);
		
		//-------------------------------------------
		// String to Byte
		//-------------------------------------------
		// Change String into a Byte
		System.out.println("Enter a String value to convert to a Byte:");
		
		// Note -- Example only gets value in first byte
		answer = input.next();
		byte b = answer.getBytes()[0];
		
		// Print converted Byte
		System.out.println(b);
		
		
		//-------------------------------------------
		// String to Short
		//-------------------------------------------
		// Change String into a Short
		System.out.println("Enter a String value to convert to a Short:");
		
		answer = input.next();
		short s = Short.parseShort(answer);
		
		// Print converted Short
		System.out.println(s);
		
		
		//-------------------------------------------
		// String to Int
		//-------------------------------------------
		// Change String into a Int
		System.out.println("Enter a String value to convert to a Int:");
		
		answer = input.next();
		int i = Integer.parseInt(answer);
		
		// Print converted Int
		System.out.println(i);
		
		
		//-------------------------------------------
		// String to Long
		//-------------------------------------------
		// Change String into a Long
		System.out.println("Enter a String value to convert to a Long:");
		
		answer = input.next();
		long l = Long.parseLong(answer);
		
		// Print converted Long
		System.out.println(l);
		
		
		//-------------------------------------------
		// String to Float
		//-------------------------------------------
		// Change String into a Float
		System.out.println("Enter a String value to convert to a Float:");
		
		answer = input.next();
		float f = Float.parseFloat(answer);
		
		// Print converted Float
		System.out.println(f);
		
		
		//-------------------------------------------
		// String to Double
		//-------------------------------------------
		// Change String into a Double
		System.out.println("Enter a String value to convert to a Double:");
		
		answer = input.next();
		double d = Double.parseDouble(answer);
		
		// Print converted Float
		System.out.println(d);
		
		
		//-------------------------------------------
		// String to Char
		//-------------------------------------------
		// Change String into a Char
		System.out.println("Enter a String value to convert to a Char:");
		
		// Note -- Example only gets first character
		answer = input.next();
		char c = answer.charAt(0);
		
		// Print converted Char
		System.out.println(c);
		
		
		//-------------------------------------------
		// String to Boolean
		//-------------------------------------------
		// Change String into a Boolean
		System.out.println("Enter a String value to convert to a Boolean:");
		
		answer = input.next();
		boolean bl = Boolean.parseBoolean(answer);
		
		// Print converted Boolean
		System.out.println(bl);
		
		// Exit program
		System.out.println("Goodbye!");
		
		input.close();

	}

}
