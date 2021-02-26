/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 26 - Quick Sort
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement quick sort
 * *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		int arr[] = {10,7,8,9,1,5};
		int n = arr.length;
		
		QuickSort ob = new QuickSort();
		ob.sort(arr, 1, n-1);
		
		System.out.println("Sorted Array");
		ob.printArray(arr);
	}	


}
