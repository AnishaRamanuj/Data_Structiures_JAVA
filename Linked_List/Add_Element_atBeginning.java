/*
Implement the method addAtBeginning(String data) to add a new element at the beginning of a linked list.

You can make use of the below steps to implement the method.

Create a new node with the data passed to the method

If the linked list is empty, make the new node as the head and the tail node.

If the linked list is not empty, add the new node at the beginning, i.e., before the current head node and make the new node as the head.
 ========================================================================================================================================= 
*/
  class Node {
	private String data;
	private Node next;
	
	public Node(String data){
		this.data=data;
	}
	public void setData(String data){
		this.data = data;
	}
	public void setNext(Node node){
		this.next = node;
	}
	public String getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
}

class LinkedList {
	
	private Node head;
	private Node tail;
	
	public Node getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}
	public void addAtEnd(String data){
		//Create a new node
		Node node = new Node(data);
		
		//Check if the list is empty, 
		//if yes, make the node as the head and the tail
		if(this.head == null)
			this.head=this.tail=node;
		else{
    		//If the list is not empty, add the element at the end
    		this.tail.setNext(node);
    		//Make the new node as the tail
    		this.tail=node;
		}

	}
	
	
	public void addAtBeginning(String data){
        //Implement your code here
	}
	
}

class Tester{
	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtBeginning("Nice");
	}
}
  
