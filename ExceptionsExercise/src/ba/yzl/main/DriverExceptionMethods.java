package ba.yzl.main;

import ba.yzl.Exception.MyCustomException;

public class DriverExceptionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new MyCustomException("custom exception message");	
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
		} 
		
		try {
			throw new MyCustomException("custom exception msg");
		}catch(Exception e){
			
			for(StackTraceElement element : e.getStackTrace()) {
				System.out.println(element.getMethodName());
			}
			
		}
		

	}

}
