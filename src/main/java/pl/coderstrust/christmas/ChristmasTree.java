package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    public static void main(String[] args) {
        try {
            List<String> christmasTree = getChristmasTree(7);
            for (String s : christmasTree) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> getChristmasTree(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Given size cannot have a negative value");
        }
        List<String> result = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        int star = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                line.append(" ");
            }
            for (int j = 0; j < star; j++) {
                line.append("*");
            }
            star += 2;
            result.add(line.toString());
            line.setLength(0);
        }
        line.append(String.format("%" + (size + 1) + "s", "**"));
        result.add(line.toString());
        line.setLength(0);
        return result;
    }
}
