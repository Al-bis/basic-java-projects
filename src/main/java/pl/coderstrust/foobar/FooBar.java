package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {

    public static void main(String[] args) {
        try {
            List<String> fooBar = getFooBar(10);
            for (String s : fooBar) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> getFooBar(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Given amount cannot have a negative value");
        }
        List<String> result = new ArrayList<>();
        StringBuilder fooBar = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            fooBar.append(i).append(" ");
            if (i % 3 == 0) {
                fooBar.append("Foo");
            }
            if (i % 5 == 0) {
                fooBar.append("Bar");
            }
            result.add(fooBar.toString());
            fooBar.setLength(0);
        }
        return result;
    }
}
