Implement a basic implementation of the Data Structures and Algorithms (DSA) concept of an array in Java.

In Java, an array is a fixed-size collection of elements of the same type. It allows you to store multiple values of the same data type in contiguous memory locations. Each element in the array is accessed using an index, starting from 0.

Here's an example of creating and using an array in Java:

```java
public class p4n_ArrayExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = new int[5];

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and printing array elements
        System.out.println(numbers[0]);  // Output: 10
        System.out.println(numbers[2]);  // Output: 30

        // Array length
        int length = numbers.length;
        System.out.println("Array length: " + length);  // Output: 5
    }
}
```

In the example above, we first declare an array called `numbers` of type `int` with a size of 5 using the syntax `int[] numbers = new int[5]`. This creates an array with five elements, indexed from 0 to 4.

We then assign values to each element of the array using the index notation. For example, `numbers[0] = 10` assigns the value 10 to the first element of the array.

To access and print the values of specific elements, we use the index notation as well. For instance, `System.out.println(numbers[0])` outputs the value 10.

The length of an array can be obtained using the `length` property of the array, as shown in the example. In this case, `numbers.length` returns 5, which represents the number of elements in the array.

It's important to note that arrays in Java have a fixed size, meaning once you define the size of an array, you cannot change it. If you need a dynamic collection that can grow or shrink, you might consider using other data structures like ArrayList or LinkedList.

I hope this explanation helps you understand the basics of implementing an array in Java for DSA purposes. Let me know if you have any further questions!
