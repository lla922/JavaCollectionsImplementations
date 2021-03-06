package beg.java.collections;
import java.util.Arrays;

public class ArrayList<E> {
	
	
	
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;
	private int size; //num of elements inside the arrayList.
	private static final Object[] EMPTY_ELEMENTS = {}; // empty array objects pointing to this array
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTS = {}; // default sized empty array
	
	
	public ArrayList(){
		elements = new Object[DEFAULT_CAPACITY];
		
	}
	
	public ArrayList(int initialCapacity) {
		if(initialCapacity > 0) {
			this.elements = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.elements = EMPTY_ELEMENTS;
		} else {
			System.out.println("wrong initialization of the list.");
		}
		
	}
	
	public boolean isEmpty() {
		return (elements.length == 0);
	}
	

	public int getSize() {
		this.size = elements.length;
		return size;
	}
	
	public void ensureCapacity (int minCapacity) {   //verilen kapasiteyi tutabilecek mi tutamayacak mi , tutamiyorsa arttirma methoduna yolla
		
		if((minCapacity > elements.length) && 
				(elements != DEFAULTCAPACITY_EMPTY_ELEMENTS) && 
					!(minCapacity <= DEFAULT_CAPACITY) ) { //kapasite 10 ise bos yere arttirmak istemiyoruz
			increaseCapacity(minCapacity);
		}
		
	}
	/*
	 * arrayi mincapacity kadar element tutabilecek sekilde ayarlamamiz gerekli
	 * 0 ELEMANLI YADA ARRAY ELEMANLARI NULL OLAN BIR ARRAY OLMADIGINDAN EMIN OLUYOR
	 */
	public Object[] increaseCapacity(int minCapacity) { //arttirma methodu
		
		int newCapacity = elements.length+(elements.length >> 1);
		//Object[] newArray;
		if(elements.length > 0 || elements != DEFAULTCAPACITY_EMPTY_ELEMENTS ) { //bos array veya null ifadelerle dolu bir array degil ise
//			newArray = new Object[newCapacity];
//			for(int i = 0 , j = 0 ; i < elements.length; i++) {		
//				newArray[j] = elements[i];
//				j++;
//				} 
			return elements = Arrays.copyOf(elements, newCapacity);
		}else{
			return elements = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
				}  
		}
	
	
	
	public Object[] increaseCapacity() {
		return increaseCapacity(size+1);
	}
	
	
	private void add(Object o, Object[] a, int s) {
		
		if(s == elements.length)
			a = increaseCapacity(a.length+1);
			System.out.println(a.length);
		a[s] = o;
		size = s + 1;
		
		
	}
	
	public void add(Object o) {
		add(o, elements, size);
	}
	
	
	/*
	 * ilk once index var mi rangede mi valid mi ona bakmaliyiz
	 * valid ise size`i 1 arttirip mevzubahis indexteki mevcut element dahil , tumunu saga kaydirmaliyiz .
	 */
	public void add(E e,int index) {  
		
		checkIndex(index);
			
			Object items[] = new Object[elements.length];
			items = increaseCapacity();
			for(int i=0; i < elements.length; i++) {
				items[i] = elements[i];
				
				}
			
			for(int i = items.length-1; i > index ; i--) {
				items[i] = items[i-1];
			} 
			items[index] = e;
			size = items.length+1;
				}
					
				
			
	
	public void remove(int index) {
		if(!checkIndex(index) && index != elements.length-1 ) {
			elements[index] = null;
			
			for(int i = index+1; i < elements.length; i++) {
				elements[i-1] = elements[i];
			}
		}
		
		
	}
	
	public Object[] clear() {
		return elements = EMPTY_ELEMENTS;
	}
			
		
 boolean checkIndex(int index) {
		if (index < 0 || index > size ) {
			return true;
		}
		return false;
	}
	
	public int indexOf(Object o) {
		Object[] data = elements;
		
		if (o == null) {
			for(int i = 0; i < elements.length ; i++) {
				if(data[i] == null) {
					return i;
				}
			}
		} else {
			for(int i = 0; i< elements.length; i++) {
				if(o.equals(data[i])) {
					return i;
				}
			}
		} return -1;
	}
	
	
	public int lastIndexOf(Object o) {
		Object[] e = elements;
		
		
		for(int i = elements.length -1 ; i >= 0 ; i--) {
			if(o.equals(e[i])) {
				return i;
			}
		} return -1;
	} 
	
	public boolean contains(Object o) {
		if(indexOf(o) != -1) {
			return true;
		} return false;
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(elements);
		}
	
	
	
	
	
	
	}

	
	
	
	


