Various algorithms following codeCademy tutorials
Binary Search

linear search
sorting


Queues First In First Out
Enqueue - adds data to the “back” or end of the queue
Dequeue - provides and removes data from the “front” or beginning of the queue
Peek - reveals data from the “front” of the queue without removing it
bounded queue = queue with a limit to the amount of data that can be added 

Underflow = trying to remove elements from an empty queue.
Overflow = trying to add an element to a queue that does not have room for more nodes because it is bounded

Stacks (can be linked list on array, can have a limited size)
Push - adds data to the top of the stack
Pop - removes and provides data from the top of the stack
Peek - reveals data on the top of the stack
StackOverflow - pushing data onto a full stack
Last In, First Out
A stack without a maximum size limit can experience underflow, but not overflow. 
A stack with a maximum size limit can experience both underflow and overflow.


If you need a data structure that provides O(1) access of the first element inserted then use a queue. 
If you need O(1) access of the last element then use a stack. A queue is often associated with a breadth 
first search while a stack is often utilized for depth first search.

Hash map
A key-value store that uses an array and a hashing function to save and retrieve values.
Key: The identifier given to a value for later retrieval.
Hash function: A function that takes some input and returns a number.
Compression function: A function that transforms its inputs into some smaller range of possible outputs.
The underlying data structure that hash maps use is an
Preview: Docs Stores elements of various data types in an ordered collection.
array.

Recursion
Recursion is a computational approach where a
Preview: Docs A method is a small piece of code, usually defined in a class, that can be used outside the class and in other parts of the program.
method
calls itself from within its body.