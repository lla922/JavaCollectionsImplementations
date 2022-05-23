package ba.yzl.Exception;

public class MyownException extends Exception {
	
	public MyownException() {
		
	}
	
	public MyownException(String message) {
		super(message);
	}
	
	public static void m() throws MyownException {
		System.out.println("m method");
		throw new MyownException("m methodunun throwundan mesaj");
	}
	

}
