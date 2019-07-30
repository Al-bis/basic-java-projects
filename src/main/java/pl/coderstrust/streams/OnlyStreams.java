package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyStreams {

    public static void main(String[] args) throws IOException {

        Path input = Paths.get("src/main/resources/1000.txt");
        Path result = Paths.get("src/main/resources/result.txt");
        List<String> list = Files.lines(input)
                .filter(line -> line.matches("^[ 0-9]+$"))
                .map(string -> string.split(" +"))
                .map(OnlyStreams::convert)
                .collect(Collectors.toList());
        Files.write(result, list);
    }

    private static String convert(String[] array) {
        String joined = Arrays.stream(array)
                .filter(s -> s.length() > 0)
                .reduce("", (partialString, element) -> partialString + "+" + element);

        int sum = Arrays.stream(array)
                .filter(s -> s.length() > 0)
                .mapToInt(num -> Integer.parseInt(num))
                .sum();

        return joined + "=" + sum;
    }
}
