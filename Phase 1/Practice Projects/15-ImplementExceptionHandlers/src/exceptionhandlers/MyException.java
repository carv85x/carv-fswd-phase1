package exceptionhandlers;

public class MyException extends Exception{
	String msg;
	
	MyException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return "MyException Ocurred: " + msg;
	}
}
