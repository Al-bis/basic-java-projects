package pl.coderstrust.fChecker;

public class FibonacciChecker {

    public static void main(String[] args) {
        try {
            long number = 144;
            System.out.println("Is " + number + " a fibonacci number?: " + isFibonacciNumber(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isFibonacciNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Given number must be positive");
        }
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);
    }

    private static boolean isPerfectSquare(long number) {
        long squareResult = (long) Math.sqrt(number);
        return (squareResult * squareResult == number);
    }
}
