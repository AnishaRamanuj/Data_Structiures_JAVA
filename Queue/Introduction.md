
# *QUEUE*                                                          

### A Queue is a linear structure which follows a particular order in which the operations are performed.<br/> 
### The order is First In First Out (FIFO). A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.<br/>
### The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.

<hr>



**Class Queue** {<br/>
	private int front, rear, maxSize;<br/>
	private String arr[];<br/>
	Queue(int maxSize) {<br/>
		this.front = 0;<br/>
		this.rear = -1;<br/>
		this.maxSize = maxSize;<br/>
		this.arr = new String[this.maxSize];<br/>
	}<br/>
}<br/>
Since we need to store the names of the people standing in a queue in front of ATM, a String array has been created in the class as shown above.

Let's now understand the various attributes of the Queue class in detail.

![Queue](https://user-images.githubusercontent.com/98104395/183824418-b4f9a57f-fb78-4c24-8fc5-ba2d8d2ca079.png)

**The main operations that are possible on a queue are:**

**1. En-queue:** adds an element to the end of the queue

**2. De-queue:** removes an element from the front of the queue. The items are removed in the same order as they were added unlike Stack.

In a queue, an element is enqueued at the rear position and dequeued from the front.

You will now have a look at all the operations in detail.
