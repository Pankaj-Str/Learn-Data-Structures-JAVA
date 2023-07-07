package Day_14;

//@p4n.in
//codeswithpankaj.com

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };

        // Bubble Sort
        int[] bubbleSorted = bubbleSort(Arrays.copyOf(arr, arr.length));
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSorted));

        // Selection Sort
        int[] selectionSorted = selectionSort(Arrays.copyOf(arr, arr.length));
        System.out.println("Selection Sort: " + Arrays.toString(selectionSorted));

        // Merge Sort
        int[] mergeSorted = mergeSort(Arrays.copyOf(arr, arr.length));
        System.out.println("Merge Sort: " + Arrays.toString(mergeSorted));
    }

    public static int[] bubbleSort(int[] arr) {
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
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
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
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}
