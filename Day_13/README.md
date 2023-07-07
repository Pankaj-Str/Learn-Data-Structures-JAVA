# DSA Java - Search techniques

When it comes to implementing search techniques in Java for Data Structures and Algorithms (DSA), there are several commonly used algorithms. Here are a few popular search techniques:

1. Linear Search:
   - Linear search is the simplest search algorithm that sequentially checks each element of the data structure until a match is found.
   - It is commonly used for unsorted arrays or lists.
   - Java implementation:

   ```java
   public static int linearSearch(int[] arr, int target) {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
               return i; // Found the target
           }
       }
       return -1; // Target not found
   }
   ```

2. Binary Search:
   - Binary search is a fast search algorithm used on sorted arrays or lists by repeatedly dividing the search interval in half.
   - It is based on the principle of "divide and conquer."
   - Java implementation:

   ```java
   public static int binarySearch(int[] arr, int target) {
       int low = 0;
       int high = arr.length - 1;

       while (low <= high) {
           int mid = (low + high) / 2;
           if (arr[mid] == target) {
               return mid; // Found the target
           } else if (arr[mid] < target) {
               low = mid + 1; // Target is in the upper half
           } else {
               high = mid - 1; // Target is in the lower half
           }
       }
       return -1; // Target not found
   }
   ```

3. Hashing:
   - Hashing is a technique that uses a hash function to map keys to array indices, allowing for efficient retrieval of data.
   - It is commonly used for dictionary-like data structures such as hash tables.
   - Java implementation using `HashMap`:

   ```java
   import java.util.HashMap;

   public class HashMapSearch {
       public static void main(String[] args) {
           HashMap<String, Integer> map = new HashMap<>();
           map.put("apple", 1);
           map.put("banana", 2);
           map.put("orange", 3);

           int value = map.getOrDefault("banana", -1);
           System.out.println(value); // Output: 2
       }
   }
   ```

These are just a few search techniques commonly used in DSA with Java. Depending on the problem and the data structure being used, other search algorithms like depth-first search (DFS) or breadth-first search (BFS) may also be applicable.
