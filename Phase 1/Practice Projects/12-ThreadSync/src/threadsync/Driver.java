package threadsync;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 12 - Thread Synchronization
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement thread synchronization
 *************************************************/
public class Driver {
	
	public static void main(String[] args) {
		
		Sender sender = new Sender();
		
		ThreadedSend s1 = new ThreadedSend(" Hi ", sender);
		ThreadedSend s2 = new ThreadedSend(" Bye ", sender);
		
		s1.start();
		s2.start();
		
		try {
			s1.join();
			s2.join();
		} catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
