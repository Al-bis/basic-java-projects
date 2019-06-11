package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {

        printMultiplicationTable(4);
    }

    public static void printMultiplicationTable(int size) {

        if(size > 12) {
            System.out.println("Given size can't be more then 12");
            return;
        }

        System.out.print("      ");

        for(int i = 1; i <= size; i++) {

            System.out.printf("%6d", i);

        }

        System.out.println();

        for(int i = 1; i <= size; i++) {

            System.out.printf("%6d", i);

            for(int j = 1; j <= size; j++) {

                System.out.printf("%6d", i*j);
            }

            System.out.println();
        }

    }
}
