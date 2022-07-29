//The algorithm for displaying all the elements of a stack is given below:

/*
Iterate over the stack from top to bottom
Print the element in each iteration
===================================================================================================================================================================
Displaying only the top element of the stack is known as the peek operation.
peek() returns the top element of the stack. Observe the below example. First, we are checking if the top is less than 0, i.e., stack is empty. If it is not empty, then we are retrieving the top element of the stack.
===================================================================================================================================================================
Check whether the stack is empty. 
If the stack is empty, return appropriate error message
If the stack is not empty,
     Retrieve the top most element and return it
===================================================================================================================================================================
Here, Integer.MIN_VALUE gives the minimum possible value for an integer variable which is used for indicating that the stack is empty.
*/
int peek() {
		if (top < 0)
			return Integer.MIN_VALUE;
        else
			return arr[top];
	}
