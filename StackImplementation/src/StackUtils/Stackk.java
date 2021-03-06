package StackUtils;

public class Stackk<E> {
	
	Object[] elements;	
	private int size;
	//This is stack implementation using arrays
	
	public Stackk() {
		//creates an empty stack with initial size of 10
		
		elements = new Object[10];	
		size = elements.length;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public E push(E item) {														 //pushes an item on top of stack and returns the pushed item
		if(elements == null) {
			elements[0] = item;
			size++;
				} 
		
			else { 																//null degilse array , elemanlarin hepsini saga 1 kaydirip basa ekliycem .
				Object[] arrWithNewElement = newSizeArrayCreationAndCopy();
				arrWithNewElement[0] = item;
				elements = arrWithNewElement;
				size++;
		} 		return item;
		
	}
	
	private Object[] newSizeArrayCreationAndCopy() {
		
		Object[] newArray = new Object[elements.length+1];
			for(int i=0,j=1; i< elements.length && j<newArray.length; i++,j++) {
			newArray[j] = elements[i];	
		}return newArray;
	}
	
	
	
	private Object[] poppedElementTrim(Object[] element) {
		 
		/*
		 * gelen arrayin icindeki ilk elemana bak , null ise yeni bir array yarat boyutu 1 kucuk
		 * ve eski arrayi oraya aktar
		 */
		Object[] newArr = new Object[element.length-1];
		if(element[0] == null) {
			
			for(int i = 1, j=0; i<element.length && j < newArr.length; i++,j++) {
				newArr[j] = element[i];
			}
		} return newArr;
				
		
	}
	
	public E pop() {						
		E itemOnTop = (E) elements[0];
		
		if(elements == null) {
			System.out.println("there is no item to pop .");
		}
		
		else {
			itemOnTop = (E) elements[0];
			elements[0] = null;
			Object[] trimmed = poppedElementTrim(elements);
			elements = trimmed;
			size--;
	} return itemOnTop;
		}
	
	
	public E peek() {
		return (E) elements[0];// returns the item on top of the stack
		
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("STACK :\n\n");
		
		for(int i = 0; i< elements.length; i++) {
			str.append(elements[i]).append("\n");
		} return str.toString();
	}
	

}
