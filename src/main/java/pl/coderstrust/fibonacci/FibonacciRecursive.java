package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder <= 0) {
            return 0;
        } else if (fibonacciNumberInOrder <= 2) {
            return 1;
        }

        long result = fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
        return result;
    }
}
