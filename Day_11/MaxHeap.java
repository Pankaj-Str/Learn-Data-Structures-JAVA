package Day_11;
//@p4n.in
//www.codeswithpankaj.com
import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full. Cannot insert more elements.");
        }

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int removeMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty. Cannot remove element.");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);

        return max;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;

        if (leftChildIndex < size && heap[leftChildIndex] > heap[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex] > heap[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(heap, 0, size));
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(5);
        maxHeap.insert(8);
        maxHeap.insert(3);
        maxHeap.insert(12);
        maxHeap.insert(2);
        maxHeap.insert(10);

        System.out.println("Max Heap: " + maxHeap);

        int max = maxHeap.removeMax();
        System.out.println("Removed max element: " + max);
        System.out.println("Max Heap after removal: " + maxHeap);
    }
}
