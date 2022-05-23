package ba.yzl.lib;

import java.util.Scanner;

public class CircleConsole {
	
	private static final Scanner SCANNER;
	
	static {
		SCANNER = new Scanner(System.in);
	}
	
	

	
	public static int promptIntValue (String message) {
		
		
		System.out.println(message);
		return SCANNER.nextInt();		
		
	}
}
