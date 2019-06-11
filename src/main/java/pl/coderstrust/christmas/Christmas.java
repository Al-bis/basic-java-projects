package pl.coderstrust.christmas;

public class Christmas {

    public static void main(String[] args) {

        printChristmasTree(6);
    }

    public static void printChristmasTree(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 1; j < size * 2; j++) {

                if (j >= (size - i) && j <= (size + i)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.printf("%" + size + "s", "**");
    }
}
