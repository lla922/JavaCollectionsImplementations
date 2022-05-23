package ba.yzl.main;

import ba.yzl.Exception.MyCustomException;
import ba.yzl.lib.libUtils;

public class DriverRethrowException {
	
	public static void f() {
		
		try {
			
			libUtils.doSomething();
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			throw new RuntimeException(e);
		//	return;
			
		
		}
	}
	
	
	public static void main(String[] a) {
		
		
		f();
		
		System.out.println("main thread is running");
	}

}
