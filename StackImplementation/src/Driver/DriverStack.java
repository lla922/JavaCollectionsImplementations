package Driver;

import StackUtils.Stackk;

public class DriverStack {

	public static void main(String[] args) {
		
		Stackk stack = new Stackk();
		
		stack.push(15);
		stack.push(78);
		stack.push(34);
		
		//stack.pop();
		
		//stack.pop();
		
		System.out.println("first item in this stack is : " + stack.peek() + "\n");
		
		System.out.println("size of this stack is : " + stack.getSize() + "\n");
		
		System.out.println(stack.toString());

	}

}
