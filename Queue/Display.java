/*
The algorithm for displaying all the elements of a queue is given below:

Iterate over the queue from front to rear
Print the element in each iteration
==================================================================================================================================================
The code given below has the isFull, enqueue and display methods implemented.

Tester class is provided to enqueue the elements. Play around with it and observe the output.
===================================================================================================================================================  
*/
class Queue {
	
	private int front; // front represents the index position of the first element in the queue
	private int rear; // rear represents the index position of the last element in the queue
	private int maxSize; // maxSize represent the maximum number of elements that can be stored in the queue
	private String arr[];
	
	Queue(int maxSize) {
		this.front = 0; // front is 0 when the queue is created
		this.rear = -1; // rear is -1 when the queue is created
		this.maxSize = maxSize;
		this.arr = new String[maxSize];
	}
	
	//Checking if the queue is full or not
	public boolean isFull() {
		if (rear == maxSize - 1) {
			return true;
		}
		return false;
	}
	
	//Adding a new element to the rear of queue
	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	//Displaying all the elements in the queue
	public void display() {
		System.out.println("Displaying queue elements");
		for (int i = front; i <= rear; i++) {
			System.out.println(arr[i]);
		}
	}

}

class Tester {

	public static void main(String[] args) {

	    Queue queue = new Queue(5);
		System.out.println("Queue created.\n");
		
        if (queue.enqueue("Joe"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
            
        if (queue.enqueue("Jack"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
            
        if (queue.enqueue("Eva"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
            
        if (queue.enqueue("Mia"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
            
        if (queue.enqueue("Luke"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
	
		queue.display();
		
		if (queue.enqueue("Emma"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

	}
}
