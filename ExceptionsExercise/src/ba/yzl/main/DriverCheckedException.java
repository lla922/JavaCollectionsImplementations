package ba.yzl.main;

import ba.yzl.Exception.MyCustomException;
import ba.yzl.lib.libUtils;

//runtime exceptionlarin hepsi unchecked exceptiondir. 

public class DriverCheckedException {

	public static void main(String[] args) {
		
		try {
		libUtils.doSomething();
		}
		catch(MyCustomException e){
			e.printStackTrace(System.out);
		}
		
		try {
			libUtils.f();
		}catch(MyCustomException e){
			e.printStackTrace();
		}
		
		
		
	}

}
