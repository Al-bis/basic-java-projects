package pl.coderstrust.christmas;

public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(6);
    }

    public static void printChristmasTree(int size) {
        int star = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }
        System.out.printf("%" + (size + 1) + "s", "**");
    }
}
