package lockedmeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Project Assignment - LockedMe
 * 
 * Author: Camilo Rodriguez
 * 
 * Created Directory class to manage directory operations
 *************************************************/
public class Directory {
	
	private ArrayList<String> files = new ArrayList<String>();
	private String path;
	 
	public Directory(String path) {
		// Set path
		this.path = path;
		
		// Populate file list
		popFiles(this.path);
	}
	
	// Creates file and return full path, including name
	public String createFile(String name) {		
		String filename = this.path + name;
		File file = new File(filename);
		
		try {
			if (file.createNewFile()) {
		        System.out.println("Created file '" + filename + "'.");
		        
		     // Add file to files list
				this.files.add(name);	
				
		      } else {
		    	// Null filename to report it was NOT created
				filename = null;
		        System.out.println("ERROR - File name already exists!");
		      }
		} catch(IOException e) {
			// Null filename to report it was NOT created
			filename = null;
		    e.printStackTrace();
		}		
		
		return filename;
	}
	
	// Return list of files
	public ArrayList<String> getFiles() {
		// Sort list
		Collections.sort(this.files);
		
		return this.files;
	}
	
	// Delete file
	public String deleteFile(String name) {
		String filename = this.path + name;
		File file = new File(filename);
		
		try {     			           
			
			if(file.delete()) {                     
				System.out.println("Deleted file '" + filename + "'.");
			} else  {
				// Null filename to report it was NOT created
				filename = null;
				System.out.println("ERROR - File not found!");  
			}  
		}catch(Exception e)  {
			// Null filename to report it was NOT created
			filename = null;
			e.printStackTrace();  
		}  
		
		// Remove element from list
		this.files.remove(name);		
		
		return filename;
	}
	
	// Read contents of file
	public void readFile(String name) {
		String filename = this.path + name;
		File file = new File(filename);
		
		
		try {		      
			Scanner reader = new Scanner(file);
			
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
		        System.out.println(data);
			}
		      reader.close();
		} catch (FileNotFoundException e) {
		      System.out.println("File not found!");
		} 
	}
	
	// Write to file
	public void writeToFile(String name, String text) {		
		String filename = this.path + name;

		try {
			FileWriter writer = new FileWriter(filename);
			
			writer.write(text);
			writer.close();
		      
			System.out.println("Updated file '" + filename + "'.");
		} catch (IOException e) {
		      e.printStackTrace();
		}
	}
	
	// Populate list of files
	private void popFiles(String path) {
		File dir = new File(path);
		File[] list = dir.listFiles();

		for (File file : list) {
		    if (file.isFile()) {
		        this.files.add(file.getName());
		    }
		}
	}
	
	
} 
