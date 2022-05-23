package ba.yzl.Exception;

public class NegativeRadiusException extends RuntimeException{
	
	private static final String message = "Radius cannot be negative";
	
	public NegativeRadiusException() {
		super(message);
	}
	
	public NegativeRadiusException (int radius){
		super(message + "( " + radius + ")");
	}
	

}
