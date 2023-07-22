package Day_11;


import java.util.*;

public class MaxHeap_01 {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap_01(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private void heapifyUp(int index) {
        int parentIndex = getParentIndex(index);
        if (parentIndex >= 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        int largestIndex = index;

        if (leftChildIndex < size && heap[leftChildIndex] > heap[largestIndex])
            largestIndex = leftChildIndex;

        if (rightChildIndex < size && heap[rightChildIndex] > heap[largestIndex])
            largestIndex = rightChildIndex;

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    public void insert(int value) {
        if (size >= capacity)
            throw new IllegalStateException("Heap is full");

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int extractMax() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return maxValue;
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(heap, 0, size)));
    }

    public static void main(String[] args) {
        MaxHeap_01 maxHeap = new MaxHeap_01(10);
        maxHeap.insert(4);
        maxHeap.insert(9);
        maxHeap.insert(2);
        maxHeap.insert(7);
        maxHeap.insert(5);

        System.out.print("Max Heap: ");
        maxHeap.printHeap();

        int maxVal = maxHeap.extractMax();
        System.out.println("Extracted Max Value: " + maxVal);

        System.out.print("Updated Max Heap: ");
        maxHeap.printHeap();
    }
}
