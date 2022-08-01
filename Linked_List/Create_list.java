/*
A linked list can be represented as a set of nodes connected together.

The node referred by head marks the beginning of the list and the node referred by tail, marks the end of the list.

public class LinkedList {	
	Node head;
	Node tail;
}
The complete implementation of LinkedList class is given below:
*/
public class LinkedList {
	private Node head;
	private Node tail;
	
	public Node getHead(){
		return this.head;
	}
	
	public Node getTail(){
		return this.tail;
	}
}
