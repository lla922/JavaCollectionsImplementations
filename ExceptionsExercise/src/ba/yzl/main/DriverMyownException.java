package ba.yzl.main;

import ba.yzl.Exception.MyownException;

public class DriverMyownException {

	public static void main(String[] args) {
		
		
		try {
			
			MyownException.m();
		//throw new MyownException();
		
		} catch(Exception e) {
			
			
			throw new RuntimeException(e);
		}
		
		
		
		
	}

}
