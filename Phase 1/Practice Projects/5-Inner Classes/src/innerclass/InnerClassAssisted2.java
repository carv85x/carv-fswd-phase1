package innerclass;

import innerclass.InnerClassAssisted1.Inner;

public class InnerClassAssisted2 {
	
	private String msg = "Inner Classes";
	
	void display( ) {
			
		class Inner {
			
			void msg() { System.out.println(msg); }
		}		
		
		Inner I = new Inner();
		I.msg();
	}
}
