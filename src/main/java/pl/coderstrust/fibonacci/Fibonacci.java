package pl.coderstrust.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        long recursiveValue = FibonacciRecursive.fibonacci(5);
        long iterativeValue = FibonacciIterative.fibonacci(6);
        System.out.println("FibonacciRecursive: " + recursiveValue);
        System.out.println();
        System.out.println("FibonacciIterative: " + iterativeValue);
    }

}
