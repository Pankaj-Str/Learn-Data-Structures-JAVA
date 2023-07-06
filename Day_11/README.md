# Heap data structure

How you can use the Heap data structure in Java to solve a specific problem. Let's consider the problem of finding the k largest elements in an array.

```java
import java.util.Arrays;
import java.util.PriorityQueue;
//@p4n.in
//www.codeswithpankaj.com
public class KLargestElements {
    public static int[] findKLargest(int[] nums, int k) {
        // Create a min heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert the first k elements into the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        // Iterate over the remaining elements
        for (int i = k; i < nums.length; i++) {
            int currentNum = nums[i];

            // If the current number is greater than the root of the min heap
            // remove the root and insert the current number into the min heap
            if (currentNum > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(currentNum);
            }
        }

        // Extract the k largest elements from the min heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 2, 9, 1};
        int k = 3;

        int[] kLargest = findKLargest(nums, k);
        System.out.println("The " + k + " largest elements are: " + Arrays.toString(kLargest));
    }
}
```

In this example, we use a `PriorityQueue` (which is implemented as a min heap in Java) to solve the problem efficiently. The `findKLargest` method takes an array `nums` and an integer `k` as input and returns an array containing the `k` largest elements from the input array.

Here's how the algorithm works:

1. We create a `PriorityQueue` named `minHeap`, which will serve as our min heap to store the `k` largest elements.

2. We iterate over the first `k` elements of the input array and insert them into the `minHeap` using the `offer` method.

3. Next, we iterate over the remaining elements of the input array starting from index `k`. For each element, we compare it with the root of the `minHeap`. If the element is larger than the root, we remove the root from the `minHeap` using `poll` and insert the current element into the `minHeap` using `offer`.

4. After processing all the elements, the `minHeap` will contain the `k` largest elements from the input array.

5. Finally, we extract the `k` largest elements from the `minHeap` and store them in an array named `result`.

6. We return the `result` array, which contains the `k` largest elements.

In the `main` method, we test the `findKLargest` method with a sample input array `nums` and `k` value. We print the `k` largest elements using `Arrays.toString` for demonstration purposes.

By using the Heap data structure, we can efficiently find the `k` largest elements in the array in `O(n log k)` time complexity, where `n` is the size of the input array.
