import java.util.Scanner;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 9 - Email ID Validation
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to search Email ID in String array
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Array of Email IDs		
		String[] emails = {
				
				"anna@email.com"
			,	"bob@email.com"
			,	"carlos@email.com"
			,	"diane@email.com"
			,	"eric@email.com"
			
		};
		
		// Scanner object
		Scanner input = new Scanner(System.in);
		
		String answer = input.next();
		boolean dne = true;
		
		// Search email based on ID
		for (String s: emails) {
			
			if(s.equals(answer + "@email.com")) {
				System.out.println("Email ID: " + s);
				dne = false;
				break; 
			} 
		}
		
		if(dne) {
			System.out.println("Email ID does not exist");		
		}
		
		// Close scanner object
		input.close();
	
	}

}
