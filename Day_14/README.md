# Implementing sorting techniques in Java

Implementing sorting techniques in Java for Data Structures and Algorithms (DSA), there are several commonly used algorithms. Here are a few popular sorting techniques:

1. Bubble Sort:
   - Bubble sort is a simple comparison-based sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order.
   - It has a time complexity of O(n^2) in the worst case.
   - Java implementation:


   ```java
   
   public static void bubbleSort(int[] arr) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   // Swap arr[j] and arr[j + 1]
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
   }
   ```

2. Selection Sort:
   - Selection sort is an in-place comparison-based sorting algorithm that divides the array into a sorted and an unsorted region.
   - It repeatedly selects the minimum (or maximum) element from the unsorted region and swaps it with the leftmost unsorted element.
   - It has a time complexity of O(n^2) in the worst case.
   - Java implementation:


   ```java
   public static void selectionSort(int[] arr) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           // Swap arr[i] and arr[minIndex]
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
       }
   }
   ```

3. Merge Sort:
   - Merge sort is a divide-and-conquer algorithm that recursively divides the array into two halves, sorts them independently, and then merges them.
   - It has a time complexity of O(n log n) in all cases.
   - Java implementation:


   ```java
   public static void mergeSort(int[] arr) {
       if (arr.length <= 1) {
           return;
       }

       int mid = arr.length / 2;
       int[] left = Arrays.copyOfRange(arr, 0, mid);
       int[] right = Arrays.copyOfRange(arr, mid, arr.length);

       mergeSort(left);
       mergeSort(right);

       merge(left, right, arr);
   }

   private static void merge(int[] left, int[] right, int[] arr) {
       int i = 0, j = 0, k = 0;

       while (i < left.length && j < right.length) {
           if (left[i] <= right[j]) {
               arr[k++] = left[i++];
           } else {
               arr[k++] = right[j++];
           }
       }

       while (i < left.length) {
           arr[k++] = left[i++];
       }

       while (j < right.length) {
           arr[k++] = right[j++];
       }
   }
   ```

These are just a few sorting techniques commonly used in DSA with Java. Depending on the requirements and the characteristics of the data, other sorting algorithms like insertion sort, quicksort, or heapsort may also be applicable.
