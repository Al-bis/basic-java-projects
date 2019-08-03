package pl.coderstrust.streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class OnlyStreams {

    public static void main(String[] args) throws IOException {
        Path input = Paths.get("src/main/resources/1000.txt");
        Path result = Paths.get("src/main/resources/result.txt");
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(result))) {
            Files.lines(input)
                    .filter(line -> line.matches("^[ 0-9]+$"))
                    .map(string -> string.split(" +"))
                    .map(OnlyStreams::convert)
                    .forEach(row -> pw.write(row + "\n"));
        }
    }

    private static String convert(String[] array) {
        String joined = Arrays.stream(array)
                .filter(s -> s.length() > 0)
                .reduce("", (partialString, element) -> partialString + "+" + element);

        int sum = Arrays.stream(array)
                .filter(s -> s.length() > 0)
                .mapToInt(Integer::parseInt)
                .sum();

        return String.format("%s=%d", joined, sum);
    }
}
