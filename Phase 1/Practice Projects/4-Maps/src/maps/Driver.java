package maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 4 - Maps
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement map examples
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Tim");
		hm.put(2, "Mary");
		hm.put(3, "Catie");
		
		System.out.println("\nThe elements of HashMap are: ");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(4, "Alex");
		ht.put(5, "Rosy");
		ht.put(6, "Jack");
		ht.put(7, "John");
		
		System.out.println("\nThe elements of HashTable are: ");
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// TreeMap
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(8, "Annie");
		tm.put(9, "Carlotte");
		tm.put(10, "Catie");
		
		System.out.println("\nThe elements of TreeMap are: ");
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
				
	}
}
