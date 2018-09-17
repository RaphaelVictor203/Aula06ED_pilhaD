package controller;

public class Node {
	private char element;
	private Node next;
	
	public Node(char c, Node n){
		element = c;
		next = n;
	}
	
	public Node(char element){
		this(element, null);
	}
	
	public char getElement(){return element;}
	
	public Node getNext(){return next;}
	
	public void setElement(char newElem){element = newElem;}
	
	public void setNext(Node newNext){next = newNext;}
}
