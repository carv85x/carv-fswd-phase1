package regex;

import java.util.regex.*;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 8 - Regular Expressions
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement Array examples
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while(c.find()) {
			System.out.println(check.substring(c.start(), c.end()));
		}
		
	}

}
