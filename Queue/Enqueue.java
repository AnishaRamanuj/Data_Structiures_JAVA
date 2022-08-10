/*
Check whether the queue is full. 
If the queue is full, return false
If the queue is not full,
     Increment rear by 1
     Add the element at rear position in the elements array
     Return true
==========================================================================================
Let us now try to implement the code based on the algorithm mentioned in the previous page.

The code given below represents a Queue class with enqueue(data) and isFull() methods for implementing the enqueue operation based on the algorithm discussed. 
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
		if (this.rear == this.maxSize - 1) {
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
	
	}
}
