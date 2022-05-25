package Model;

import java.util.Iterator;
import java.util.Stack;

public class Brackets {
	
	
	
	String str = null;
	Stack<Character> OpeningBrackets = new Stack<Character>();
	
	
	public Brackets(String str) {
		this.str = str;
	}
	
	
	//acik kapali parantezleri ayristirip stacklere koyan method
	public boolean isComplete () { //creating a stack from opening brackets in string  // ( ( ) ) }
		
		
		for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='(') {
			OpeningBrackets.push(str.charAt(i));
		}else if(str.charAt(i)=='[') {
			OpeningBrackets.push(str.charAt(i));
		}else if(str.charAt(i)=='{') {
			OpeningBrackets.push(str.charAt(i));
			
		}else if (!OpeningBrackets.isEmpty() && isLegal(OpeningBrackets.peek(),str.charAt(i))) {
			OpeningBrackets.pop();
		}else if(OpeningBrackets.isEmpty()) {
			return false;
		}
			}
		return (OpeningBrackets.isEmpty());
		}
	
	
	// parantez eslestirmesi yapan method
	public boolean isLegal(char a, char b) {
		if((char) a == '(' && (char) b == ')') {
			return true;
		}else if((char) a == '[' && (char) b == ']') {
			return true;
		}else if((char)a=='{' && (char)b=='}') {
			return true;
		} return false;
	}
	
	
	
	public class BracketsIterator implements Iterator<Character>{
		
		private int currentIndex;
		private char[] chars = str.toCharArray();

		@Override
		public boolean hasNext() {
			return currentIndex < chars.length;
		}

		@Override
		public Character next() {
			
			return chars[currentIndex++];
		}
		
	}
		
		
	public Iterator<Character> getiterator() {
		return new BracketsIterator();
	}
	
	

}
