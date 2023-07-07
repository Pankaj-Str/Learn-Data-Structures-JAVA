Package Day_13;
//@p4n.in
//codeswithpankaj.com

public class SearchExample {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 12;

        int linearSearchIndex = linearSearch(arr, target);
        if (linearSearchIndex != -1) {
            System.out.println("Linear search: Found at index " + linearSearchIndex);
        } else {
            System.out.println("Linear search: Not found");
        }

        int binarySearchIndex = binarySearch(arr, target);
        if (binarySearchIndex != -1) {
            System.out.println("Binary search: Found at index " + binarySearchIndex);
        } else {
            System.out.println("Binary search: Not found");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found the target
            }
        }
        return -1; // Target not found
    }

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
}
