When a queue is made empty after dequeuing all elements, what happens if you try to enqueue  new element?

According to the enqueue algorithm, it will check if the queue is already full or not. As per the isFull() logic, a queue is said to be full if rear is one less than the maxSize.

Thus, an enqueue operation after removal of all the elements will result in a full queue condition, even though it's not.

This is a disadvantage of the logic which we have considered. Dequeue algorithm can be modified to resolve this issue.

===================================================================================================

Queue can be used when elements don’t have to be processed immediately, but on the first come first serve basis.

This property of Queue makes it useful in different kinds of scenarios like:

1. Network Printer

2. Shared resource usage (CPU, memory access, etc.)

3. Handling calls in call centers
