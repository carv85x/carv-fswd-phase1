package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 3 - Collections
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement collection
 * examples
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// ArrayList
		System.out.println("ArrayList");
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Bangalore");
		cities.add("Delhi");
		
		System.out.println(cities);
		
		
		// Vector
		System.out.println("\nVector");
		Vector <Integer> vecs = new Vector<Integer>();
		
		vecs.add(15);
		vecs.add(30);
		
		System.out.println(vecs);
		
		
		// LinkedList
		System.out.println("\nLinkedList");
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Alex");
		names.add("John");
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// HashSet
		System.out.println("\nHashSet");
		HashSet<Integer> sets = new HashSet<Integer>();
		
		sets.add(101);
		sets.add(103);
		sets.add(102);
		sets.add(104);
		
		System.out.println(sets);
		
		// LinkedHashSet
		System.out.println("\nLinkedHashSet");
		LinkedHashSet<Integer> sets2 = new LinkedHashSet<Integer>();
		
		sets2.add(11);
		sets2.add(13);
		sets2.add(12);
		sets2.add(14);
		
		System.out.println(sets2);
		
	}
}