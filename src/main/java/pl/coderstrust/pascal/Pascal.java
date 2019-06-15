package pl.coderstrust.pascal;

public class Pascal {

    public static void main(String[] args) {
        printPascalTriangle(5);
    }

    public static void printPascalTriangle(int rows) {
        long nodeValue;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.printf("%3s", " ");
            }
            for (int j = 0; j <= i; j++) {
                nodeValue = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.printf("%6d", nodeValue);
            }
            System.out.println();
        }
    }

    private static long factorial(int number) {
        long result = 1L;
        while (number >= 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
