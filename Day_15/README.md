# DSA Java - Recursion

Recursion is a programming technique where a function calls itself repeatedly to solve a problem by breaking it down into smaller, simpler subproblems. In the context of Data Structures and Algorithms (DSA), recursion is often used to solve problems that can be divided into smaller instances of the same problem.

Recursion involves two key components:

1. Base Case: It is the condition or scenario for which the function does not make a recursive call and returns a specific value. It acts as a stopping criterion for the recursion and prevents infinite recursion. Without a base case, the recursive function would keep calling itself indefinitely.

2. Recursive Case: It is the scenario where the function makes one or more recursive calls to itself, solving a smaller instance of the problem. The function breaks down the original problem into smaller subproblems until it reaches the base case(s).

The general flow of a recursive function can be summarized as follows:

1. Check if the base case is met. If so, return the base case value.
2. If the base case is not met, divide the original problem into smaller subproblems.
3. Solve each subproblem by making recursive calls to the function itself.
4. Combine the solutions of the subproblems to obtain the final result.
5. Return the result.

Recursion is especially useful in solving problems that exhibit a recursive structure, such as tree traversals, graph traversal algorithms (e.g., depth-first search), and problems that involve repetitive computations.

When using recursion, it's important to consider the efficiency of the recursive algorithm. In some cases, recursion may result in redundant computations and inefficient memory usage. Techniques such as memoization (caching previously computed results) or tail recursion optimization can be employed to improve the efficiency of recursive algorithms.

## Recursion is a powerful concept in programming and is widely used in Data Structures and Algorithms (DSA) to solve problems by breaking them down into smaller, more manageable subproblems. Here's an example that demonstrates the use of recursion in Java:

```java
public class RecursionExample {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial of " + n + " is: " + factorial(n));

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array elements: " + sumArray(array, array.length - 1));

        int x = 5;
        System.out.println("Fibonacci number at position " + x + " is: " + fibonacci(x));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumArray(arr, index - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```

In this example, we have three recursive methods: `factorial`, `sumArray`, and `fibonacci`.

- The `factorial` method calculates the factorial of a number `n` by recursively multiplying `n` with the factorial of `n-1`, until the base case (`n = 0` or `n = 1`) is reached.

- The `sumArray` method calculates the sum of an array of integers by recursively adding the element at the current index with the sum of the remaining elements in the array, until the base case (`index < 0`) is reached.

- The `fibonacci` method calculates the Fibonacci number at position `n` by recursively summing the two previous Fibonacci numbers, until the base case (`n <= 1`) is reached.

The `main` method demonstrates the usage of these recursive methods. It calls each method with appropriate arguments and displays the results using `System.out.println`.

The output of the example will be:

```
Factorial of 5 is: 120
Sum of array elements: 15
Fibonacci number at position 5 is: 5
```

The recursive methods successfully solve their respective problems using recursion. It's important to define the base case(s) to ensure that the recursion terminates and to handle the base case(s) separately to avoid infinite recursion.
