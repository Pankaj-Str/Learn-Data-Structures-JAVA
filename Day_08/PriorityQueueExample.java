package Day_08;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks should come first
        return Integer.compare(other.getPriority(), this.priority);
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Add tasks to the priority queue
        taskQueue.add(new Task("Task 1", 5));
        taskQueue.add(new Task("Task 2", 3));
        taskQueue.add(new Task("Task 3", 8));
        taskQueue.add(new Task("Task 4", 1));

        // Process tasks in order of priority
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing task: " + task.getName() + ", Priority: " + task.getPriority());
        }
    }
}
