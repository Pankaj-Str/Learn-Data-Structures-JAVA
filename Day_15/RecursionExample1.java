package Day_15;
// @p4n.in
// codeswithpankaj.com

public class RecursionExample1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = calculateSum(array, array.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] arr, int index) {
        if (index < 0) {
            return 0; // Base case: Reached the end of the array, return 0
        }
        return arr[index] + calculateSum(arr, index - 1); // Recursive case: Add current element with the sum of remaining elements
    }
}
