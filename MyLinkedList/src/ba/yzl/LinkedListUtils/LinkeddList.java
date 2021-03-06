package ba.yzl.LinkedListUtils;
import java.util.List;
import java.util.LinkedList;

public class LinkeddList<E> {
	
		 public String toString(){
			 StringBuilder builder = new StringBuilder("[");
	       for(int i = 0; i<size; i++) {
	        	builder.append(rootNode.getData()).append(",");
	        	rootNode = rootNode.getNextNode();
	        }
	       builder.delete(builder.length()-1,builder.length()).append("]");
        return builder.toString();
        }
	
	private Node rootNode;
	private int size;

	
	
	public LinkeddList() {
		rootNode = new Node();
		size = 0;
	}
	
	public LinkeddList(E e) {
		rootNode = new Node(e,null);
		size++;
	}
	
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	
	
	public void addLast (E val) {
		
		Node newNode = new Node(val,null); 
		Node currentNode = rootNode;
		
		if(rootNode == null) {  		 //rootNode null ise , yeni node direk roota atandi .
			rootNode = newNode;
			size++;
			
		} else {  		//rootNode`un null olmadigi yani elimizde zaten ilk node un bulundugu durum
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;   // ustunde geziniyorum 
			} currentNode.setNextNode(newNode);
				size++;
				
		}
	
	}
	
	public void addFirst (E val) {
		
		Node currentNode = rootNode;
		
		Node newNode = new Node(val);
		
		if(rootNode == null) {
			rootNode = newNode;
			size++;
		}else {
		
				while(currentNode.prevNode != null) {
				currentNode = currentNode.prevNode;
				} newNode.setNextNode(currentNode);
				currentNode.setPrevNode(newNode);
				rootNode = newNode;
				size++;
			
		}
	}
	
	
		
	
	private class Node<E> {
		private E data;
		private Node nextNode;
		private Node prevNode;
		
		private Node () { //empty constructor
			
		}
		
		private Node(E data) {
			this.data = data;
		}
		
		private Node(E data, Node nextNode) {
			
			this.data = data;
			this.nextNode = nextNode;
		}
		
		public void setData(E data) {
			this.data = data;
		}
		
		public E getData() {
			return data;
		}
		
		public void setPrevNode(Node prevNode) {
			this.prevNode = prevNode;
		}
		
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		public Node getNextNode() {
			return nextNode;
		}
		
		public Node getPrevNode() {
			return prevNode;
		}
		
	
	}
	
	public static void main(String[] args) {
		
		LinkeddList<Integer> myList = new LinkeddList(3);
		
		myList.addLast(5);
		myList.addLast(56);
		myList.addLast(6);
		myList.addFirst(45);
		myList.addLast(9);
		myList.addLast(77);
		
		System.out.println(myList.toString());
		
	}
	

	 }
