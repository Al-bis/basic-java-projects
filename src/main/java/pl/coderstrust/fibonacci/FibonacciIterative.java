package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static long fibonacci(int fibonacciNumberInOrder) {
        long result = 0;
        long firstNumber = 0;
        long secondNumber = 1;

        if (fibonacciNumberInOrder <= 0) {
            return 0;
        } else if (fibonacciNumberInOrder == 1) {
            return 1;
        }

        for (int i = 0; i < fibonacciNumberInOrder - 1; i++) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return result;
    }
}
