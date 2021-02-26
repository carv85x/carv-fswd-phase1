package sleepnwait;


/*************************************************
 * Phase 1 - Java Fundamentals'
 * 
 * Practice Project 11 - Sleep and Wait
 * 
 * Author: Camilo Rodriguez
 * 
 * Created 'Driver' class to implement Sleep and Wait
 *************************************************/
public class Driver {
	
	private static Object LOCK = new Object();
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread.sleep(1000);
		
		System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
		
		synchronized(LOCK) {
			LOCK.wait(1000);
			
			System.out.println("Object '" + LOCK + "' is woken after " + "waiting for 1 second");
		}
	}

}
