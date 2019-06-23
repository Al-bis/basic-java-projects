package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

    public static void main(String[] args) {
        try {
            List<String> pascalTriangle = getPascalTriangle(7);
            for (String s : pascalTriangle) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> getPascalTriangle(int rows) {
        if (rows < 0) {
            throw new IllegalArgumentException("Given rows cannot have a negative value");
        }
        List<String> result = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        long nodeValue;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j <= rows; j++) {
                line.append(String.format("%3s", " "));
            }
            for (int j = 0; j <= i; j++) {
                nodeValue = factorial(i) / (factorial(j) * factorial(i - j));
                line.append(String.format("%6d", nodeValue));
            }
            result.add(line.toString());
            line.setLength(0);
        }
        return result;
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
