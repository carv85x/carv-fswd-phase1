import java.util.Scanner;

/*************************************************
 * Phase 1 - Java Fundamentals
 * 
 * Practice Project 19 - Linear Search
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' to implement linear search
 * *************************************************/

public class Driver {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to be searched");
		
		int searchValue = sc.nextInt();
		int result = (int)linearSearch(arr,searchValue);
		
		if(result == -1) {
			System.out.println("Element not in the array");
		} else {
			System.out.println("Element found at " + result + "and the search key is " + arr[result]);
		}
	}
	
	public static int linearSearch(int arr[], int x) {
		
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength - 1; i++) {
			
			if(arr[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
}
