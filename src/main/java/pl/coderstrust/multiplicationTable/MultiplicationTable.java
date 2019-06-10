package pl.coderstrust.multiplicationTable;

public class MultiplicationTable {

    public static void main(String[] args) {

        printMultiplicationTable(4);
    }

    private static void printMultiplicationTable(int size) {

        for(int i = 0; i <= size; i++) {

            if(size > 12) {
                System.out.println("Given size can't be more then 12");
                break;
            }

            for(int j = 0; j <= size; j++) {

                if(j == 0 && i == 0) {
                    System.out.print("  ");
                    continue;
                } else if(i == 0) {
                    System.out.printf("%6d", j);
                    continue;
                } else if(j == 0) {
                    System.out.printf("%2d", i);
                    continue;
                }
                System.out.printf("%6d", i*j);
            }

            System.out.println();
            System.out.println();
        }

    }
}
