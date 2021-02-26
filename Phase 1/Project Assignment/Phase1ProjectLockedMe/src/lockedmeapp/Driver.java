package lockedmeapp;

import java.util.Scanner;

/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Project Assignment - LockedMe
 * 
 * Author: Camilo Rodriguez
 * 
 * Created Driver class to manage menu operations
 * and main flow of program
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {	
		
		// Set current project path
		final String FILE_PATH = System.getProperty("user.dir") + "\\files\\";
		
		Directory dir = new Directory(FILE_PATH);
		
		Scanner input = new Scanner(System.in);
		
		// Set menu constants
		final String FILES	= "1";
		final String CRUD	= "2";
		final String MENU	= "3";
		final String EXIT 	= "4";			
		
		// Set ans to menu to show it once at the beginning
		String ans = MENU;		
		
		// Main menu loop
		while(!ans.equals(EXIT)) {			
			
			switch(ans) {
				case FILES:
					printFiles(dir);
					showMainMenu();	
					break;
				case CRUD:	
					processCRUDMenu(FILE_PATH, dir, input);
					// Show main menu
					showMainMenu();					
					break;
				case MENU:
					showMainMenu();					
					break;
				case EXIT:
					// Pass, as goodbye is printed at the end of loop
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			
			ans = input.nextLine();
			
			if(ans.equals(EXIT)) {
				System.out.println("Goodbye!");
			}
			
		}
		
		input.close();
		
	}		

	
	public static void processCRUDMenu(String path, Directory dir, Scanner input) {
		
		// Set submenu constants
		final String MENU	= "M";
		final String CREATE = "C";
		final String READ	= "R";
		final String UPDATE	= "U";
		final String DELETE = "D";
		final String SEARCH = "S";
		final String EXIT	= "E";
		
		// Default first answer to 'MENU' to show CRUD Menu
		String ans = MENU;
		
		// CRUD Menu loop
		while(!ans.equals(EXIT)) {			
			
			switch(ans) {
				case MENU:
					showCRUDMenu();
					break;
				case CREATE:
					createFile(dir, input);
					showCRUDMenu();
					break;
				case READ:
					readFile(dir, input);
					showCRUDMenu();
					break;
				case UPDATE:
					updateFile(dir, input);
					showCRUDMenu();
					break;
				case DELETE:
					deleteFile(dir, input);
					showCRUDMenu();
					break;
				case SEARCH:
					searchFile(dir, input);
					showCRUDMenu();
					break;
				case EXIT:
					// Pass, as exit msg is printed at the end of the loop
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			
			ans = input.nextLine().toUpperCase();
			
			if(ans.equals(EXIT)) {
				System.out.println("Returning to main menu");
			}			
		}		
	}
	
	
	public static void searchFile(Directory dir, Scanner input) {
		String name;
		
		showEnterFileName();
		// Get name and force 'txt' extension
		name = input.nextLine() + ".txt";
		
		if(dir.getFiles().contains(name.toLowerCase())) {
			System.out.println("Found file [" + name + "]");
		} else {
			System.out.println("File not found!");
		}
	}
		
	
	public static void createFile(Directory dir, Scanner input) {
		String name;
		String text;
		String filename;
		
		showEnterFileName();
		// Get name and force 'txt' extension
		name = input.nextLine() + ".txt";
		
		filename = dir.createFile(name.toLowerCase());
		
		if(filename != null) {
			showEnterFileText();
			text = input.nextLine();
			
			dir.writeToFile(name, text);
		}
	}
	
	
	public static void readFile(Directory dir, Scanner input) {
		String name;
		
		showEnterFileName();
		// Get name and force 'txt' extension
		name = input.nextLine() + ".txt";
		
		dir.readFile(name);
	}
	
	
	public static void updateFile(Directory dir, Scanner input) {
		String name;
		String text;
		
		showEnterFileName();
		// Get name and force 'txt' extension
		name = input.nextLine() + ".txt";
		
		if(dir.getFiles().contains(name.toLowerCase())) {
			showEnterFileText();
			text = input.nextLine();
				
			dir.writeToFile(name, text);
		} else {
			System.out.println("ERROR - File not found!");
		}

	}
	
	public static void deleteFile(Directory dir, Scanner input) {
		String name;
		
		showEnterFileName();
		// Get name and force 'txt' extension
		name = input.nextLine() + ".txt";
		
		dir.deleteFile(name);
	}
	
	
	public static void printFiles(Directory dir) {
		System.out.println(dir.getFiles());
	}
	
	
	public static void showMainMenu() {
		System.out.println("\n");
		System.out.println("------------------------------------------------");
		System.out.println("               Welcome to LockedMe              ");
		System.out.println("------------------------------------------------");
		System.out.println("Enter (1) to retrieve all files in ascending order");
		System.out.println("Enter (2) to enter CRUD file operations");
		System.out.println("Enter (3) to show main menu");
		System.out.println("Enter (4) to exit the application");	
		System.out.println("\n");
	}
	
	public static void showCRUDMenu() {
		System.out.println("\n");
		System.out.println("------------------------------------------------");
		System.out.println("                     CRUD Menu                  ");
		System.out.println("------------------------------------------------");
		System.out.println("Enter (C) to create a new file");
		System.out.println("Enter (R) to read an existing file");
		System.out.println("Enter (U) to update an existing file");
		System.out.println("Enter (D) to delete an existing file");
		System.out.println("Enter (S) to search an existing file");
		System.out.println("Enter (E) to exit CRUD menu");
		System.out.println("\n");
	}
	
	
	public static void showEnterFileName() {
		System.out.println("Enter the name of the file: ");
	}
	
	public static void showEnterFileText() {
		System.out.println("Enter the new content of the file: ");
	}
	
	public static void showConfirm() {
		System.out.println("Confirm operation? (Y/N)");
	}
	
	
}
