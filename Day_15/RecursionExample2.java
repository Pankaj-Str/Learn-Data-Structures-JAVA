package Day_15;

//@p4n.in
// codeswithpankaj.com

public class RecursionExample2 {
    public static void main(String[] args) {
        int n = 5;
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive case: factorial(n) = n * factorial(n-1)
    }
}
