## Stack in Java for Data Structures and Algorithms (DSA) purposes.

In Java, a stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. It allows for inserting and removing elements only at one end, which is called the top of the stack.

Here's an example of creating and using a stack in Java:

```java
//@p4n.in
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);  // Output: 30

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);  // Output: 30

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);  // Output: false

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Stack size: " + size);  // Output: 2
    }
}
```

In the example above, we use the built-in `Stack` class provided by Java's standard library (`java.util.Stack`). This class provides an implementation of a stack data structure.

To create a stack, we instantiate an object of the `Stack` class, as shown in `Stack<Integer> stack = new Stack<>();`. The `<Integer>` part specifies that the stack will store elements of type `Integer`. You can replace `Integer` with any other data type as needed.

We can push elements onto the stack using the `push` method. For example, `stack.push(10)` pushes the element 10 onto the stack, followed by pushing 20 and 30.

To access the top element of the stack without removing it, we can use the `peek` method, as shown in `int topElement = stack.peek();`. This retrieves the top element (which is 30 in this case) without modifying the stack.

To remove and retrieve the top element from the stack, we use the `pop` method, as shown in `int poppedElement = stack.pop();`. This removes the top element (which is 30) from the stack and returns it.

We can check if the stack is empty using the `isEmpty` method, which returns `true` if the stack is empty and `false` otherwise.

The `size` method gives the current size of the stack, indicating the number of elements present in it.

It's important to note that the `Stack` class is a legacy class in Java, and it's recommended to use the `Deque` interface from the `java.util` package to implement a stack-like behavior. `Deque` provides more modern and efficient stack operations.
