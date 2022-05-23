package ba.yzl.main;

import ba.yzl.Exception.LogException;

public class DriverLogging {

	public static void main(String[] args) {
		
		
		try {
			
		throw new LogException();
		
		} catch (Exception e ) {
			
			System.err.println("catched " + e);
			
		}
	}

}
