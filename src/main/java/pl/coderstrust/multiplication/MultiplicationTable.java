package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static void main(String[] args) {
        try {
            List<String> multiplicationTable = getMultiplicationTable(7);
            for (String s : multiplicationTable) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> getMultiplicationTable(int size) {
        List<String> result = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        if (size < 0) {
            throw new IllegalArgumentException("Given size cannot have a negative value");
        }
        if (size > 12) {
            throw new IllegalArgumentException("Given size cannot exceed 12");
        }
        line.append(String.format("%6s", ""));
        for (int i = 1; i <= size; i++) {
            line.append(String.format("%6d", i));
        }
        result.add(line.toString());
        line.setLength(0);
        for (int i = 1; i <= size; i++) {
            line.append(String.format("%6d", i));
            for (int j = 1; j <= size; j++) {
                line.append(String.format("%6d", i * j));
            }
            result.add(line.toString());
            line.setLength(0);
        }
        return result;
    }
}
