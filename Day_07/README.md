## Implement a queue in Java for Data Structures and Algorithms (DSA) purposes.

In Java, a queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. It allows for inserting elements at one end, called the rear or tail, and removing elements from the other end, called the front or head.

Here's an example of creating and using a queue in Java:

```java
//@p4n.in
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        // Enqueuing elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Peeking the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);  // Output: 10

        // Dequeuing elements from the queue
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);  // Output: 10

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);  // Output: false

        // Getting the size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);  // Output: 2
    }
}
```

In the example above, we use the built-in `Queue` interface provided by Java's standard library (`java.util.Queue`). This interface provides an implementation of a queue data structure.

To create a queue, we instantiate an object of a class that implements the `Queue` interface. In the example, we use the `LinkedList` class as the implementation of the queue.

We can enqueue elements into the queue using the `offer` method. For example, `queue.offer(10)` enqueues the element 10 into the queue, followed by enqueuing 20 and 30.

To access the front element of the queue without removing it, we can use the `peek` method, as shown in `int frontElement = queue.peek();`. This retrieves the front element (which is 10 in this case) without modifying the queue.

To remove and retrieve the front element from the queue, we use the `poll` method, as shown in `int dequeuedElement = queue.poll();`. This removes the front element (which is 10) from the queue and returns it.

We can check if the queue is empty using the `isEmpty` method, which returns `true` if the queue is empty and `false` otherwise.

The `size` method gives the current size of the queue, indicating the number of elements present in it.

It's important to note that there are different implementations of queues in Java's standard library, such as `LinkedList`, `ArrayDeque`, and `PriorityQueue`. Each implementation has its own characteristics and is suitable for different scenarios, so you can choose the one that best fits your needs.
