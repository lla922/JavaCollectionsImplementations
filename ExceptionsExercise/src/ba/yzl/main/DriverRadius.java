package ba.yzl.main;

import java.util.Scanner;

import ba.yzl.Exception.NegativeRadiusException;
import ba.yzl.lib.CircleConsole;
import ba.yzl.model.Circle;

public class DriverRadius {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		
		System.out.println(circle);
		
		
		
		try {
		
		System.out.println(new Circle(CircleConsole.promptIntValue("pls enter a radius value : ")));
		}
		
		catch (NegativeRadiusException e){
			
			int radiusg = CircleConsole.promptIntValue("pls enter a positive value ::");
		
		}
	}

}
