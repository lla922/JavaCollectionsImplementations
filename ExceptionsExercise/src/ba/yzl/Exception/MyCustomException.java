package ba.yzl.Exception;

public class MyCustomException extends Exception{
	
	
	
	public MyCustomException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyCustomException(String Message) {
		super(Message);
	}
	
	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return "bu benim mesajim";
	}

}
