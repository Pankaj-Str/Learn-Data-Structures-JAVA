# Priority Queue using Java

implementing a priority queue using Java. In Java, you can use the `PriorityQueue` class from the `java.util` package to create a priority queue.

A priority queue is a data structure that stores elements in a certain order based on their priorities. The element with the highest priority is always at the front of the queue and is the first one to be dequeued.

Here's an example of how you can use the `PriorityQueue` class to implement a priority queue in Java:

```java
import java.util.PriorityQueue;
//@p4n.in
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);

        // Print the elements of the priority queue
        System.out.println("Priority Queue: " + pq);

        // Remove the element with the highest priority (minimum value)
        int highestPriority = pq.poll();
        System.out.println("Element with highest priority: " + highestPriority);

        // Print the elements of the priority queue after removing the highest priority element
        System.out.println("Priority Queue after poll(): " + pq);
    }
}
```

Output:
```
Priority Queue: [1, 3, 8, 5]
Element with highest priority: 1
Priority Queue after poll(): [3, 5, 8]
```

In the above example, we first create a `PriorityQueue` object called `pq`. We then add elements to the priority queue using the `add()` method. The elements are automatically ordered based on their natural ordering (in this case, the minimum value is given the highest priority).

We can retrieve and remove the element with the highest priority using the `poll()` method. The `poll()` method removes the head of the queue and returns it. In this example, we store the highest priority element in the `highestPriority` variable and print it.

Finally, we print the updated priority queue after removing the highest priority element.

You can use the `PriorityQueue` class in Java to implement various algorithms and data structures that require prioritization, such as Dijkstra's algorithm or Huffman coding.
