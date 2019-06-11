package pl.coderstrust.pascal;

public class Pascal {

    public static void main(String[] args) {

        printPascalTriangle(5);
    }

    public static void printPascalTriangle(int rows) {

        long term;
        for (int i = 0; i < rows; i++) {

            for (int j = i; j <= rows; j++) {

                System.out.printf("%3s", " ");
            }

            for (int k = 0; k <= i; k++) {

                term = fact(i) / (fact(k) * fact(i - k));
                System.out.printf("%6d", term);
            }

            System.out.println();
        }
    }

    private static long fact(int input) {

        long factorial = 1L;
        while (input >= 1) {

            factorial *= input;
            input--;
        }

        return factorial;
    }
}
