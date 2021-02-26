package strings;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 6 - Strings
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement String examples
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Methods of Strings
		System.out.println("Methods of Strings");
		
		String sl = new String("Hello World");
		System.out.println(sl.length());
		
		
		// Substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		
		// String Comparison
		String s1 = "Hello";
		String s2 = "Heldo";
		System.out.println(s1.compareTo(s2));
		
		
		// isEmpty
		String s4 = "";
		System.out.println(s4.isEmpty());
		
		
		// toLowerCase
		String s5 = "Hello";
		System.out.println(s1.toLowerCase());
		
		
		// replace
		String s6 = "Heldo";
		String replace = s2.replace('d', 'l');
		System.out.println(replace);
		
		
		// equals
		String x = "Welcome to Java";
		String y = "WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
		
		
		// Creating StringBuffer and append method
		System.out.println("\nCreating StringBuffer");
		
		StringBuffer s = new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);
		
		
		// insert method
		s.insert(0, 'W');
		System.out.println(s);
		
		
		// replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		
		
		// StringBuilder
		System.out.println("\nCreating StringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0,1));
		
		System.out.println(sb1.insert(1, "Welcome"));
		
		System.out.println(sb1.reverse());
		
		
		// Conversion
		System.out.println("\nConversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello";
		
		
		// Conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		// Conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("world");
		
		System.out.println("String to StringBuilder");
		System.out.println(sbl);		
		
		
	}

}
