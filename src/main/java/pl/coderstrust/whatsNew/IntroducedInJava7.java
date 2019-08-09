package pl.coderstrust.whatsNew;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IntroducedInJava7 {

    public static void main(String[] args) {
        java7Demo();
    }

    private static void java7Demo() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/Java7Demo.txt"))) {
            reader.lines().forEach((System.out::println));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
