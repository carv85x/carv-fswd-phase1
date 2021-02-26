package threads;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 10 - Programming Threads
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement Thread and Runnable
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		// Thread
		MyThread mt = new MyThread();
		mt.start();
		
		
		// Runnable
		System.out.println("Starting Main Thread...");
		
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		
		t.start();
		
		while(MyRunnableThread.myCount <= 10) {
			
			try {
				System.out.println("Main Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch(InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		
		System.out.println("End of Main Thread...");
	}

}
