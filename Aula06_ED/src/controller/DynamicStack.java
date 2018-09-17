package controller;

public class DynamicStack {
	protected Node topo;
	protected int size;
	
	public DynamicStack(){
		topo = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return topo == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public char showTop() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return topo.getElement();
	}
	
	public void push(char element){
		Node novo = new Node(element, topo);
		topo = novo;
		size++;
	}
	
	public char pop() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException();
		}
		char temp = topo.getElement();
		topo = topo.getNext();
		size--;
		return temp;
	}
}
