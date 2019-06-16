package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("fibonacciNumberInOrder must be positive");
        }
        if (fibonacciNumberInOrder == 0) {
            return 0;
        }
        if (fibonacciNumberInOrder == 1) {
            return 1;
        }
        long[] fib = {0, 1, 1};
        for (int i = 0; i < fibonacciNumberInOrder - 1; i++) {
            fib[2] = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = fib[2];
        }
        return fib[2];
    }
}
