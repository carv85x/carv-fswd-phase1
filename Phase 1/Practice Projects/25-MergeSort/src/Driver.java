/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 25 - Merge Sort
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement merge sort
 * *************************************************/
public class Driver {
		
	public static void main(String[] args) {
		
		MergeSort ob = new MergeSort();
		int arr[] = {12, 11, 13, 5, 6, 7};	
		System.out.println("Given Array");
		ob.printArray(arr);		
		
		ob.sort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted Array");
		ob.printArray(arr);
		
	}
}
