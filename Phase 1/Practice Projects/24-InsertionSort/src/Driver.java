/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 24 - Insertion Sort
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement insertion sort
 * *************************************************/
public class Driver {

	public static void main(String[] args) {
		
		int[] arr = {9,12,3,21,44};
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void insertionSort(int[] arr) {
		
		for (int j = 0; j < arr.length; j++) {
			int key = arr[j];
			int i = j-1;
			
			while(i > -1 && arr[i] > key) {
				
				arr[i+1] = arr[i];
				i--;
			}
			
			arr[i+1] = key;
		}
	}
}
