package Day_07;
//www.codeswithpankaj.com
//www.p4n.in
import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

// Queue class
class QueueExample {
    private Queue<Integer> queue;

    public QueueExample() {
        queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.offer(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue element.");
        }
        return queue.poll();
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot peek element.");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

// Example usage
public class Queue_Example {
    public static void main(String[] args) {
        QueueExample queue = new QueueExample();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
        System.out.println(queue.size()); // Output: 2

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.isEmpty()); // Output: false
        System.out.println(queue.size()); // Output: 2

        System.out.println(queue.dequeue()); // Output: 4
        System.out.println(queue.dequeue()); // Output: 5
        System.out.println(queue.isEmpty()); // Output: true

        // Trying to dequeue from an empty queue
        try {
            System.out.println(queue.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage()); // Output: Error: Queue is empty. Cannot dequeue element.
        }
    }
}
//www.p4n.in
