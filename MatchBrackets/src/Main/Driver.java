package Main;

import java.util.Iterator;

import Model.Brackets;

public class Driver {

	public static void main(String[] args) {
		
		
		Brackets br = new Brackets("([{}])");
		
		System.out.println(br.isComplete());
		
	

	}

}
