package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        try {
            printMultiplicationTable(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printMultiplicationTable(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Given size cannot have a negative value");
        }
        if (size > 12) {
            throw new IllegalArgumentException("Given size cannot exceed 12");
        }
        System.out.printf("%6s", "");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%6d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}
