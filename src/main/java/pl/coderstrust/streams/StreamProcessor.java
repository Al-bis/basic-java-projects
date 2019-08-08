package pl.coderstrust.streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class StreamProcessor {

    public static void main(String[] args) throws IOException {
        String input = "src/main/resources/1000.txt";
        String result = "src/main/resources/result.txt";
        StreamProcessor streamProcessor = new StreamProcessor();
        streamProcessor.process(input, result);
    }

    public void process(String inputFilePath, String resultFilePath) throws IOException {
        if (inputFilePath == null) {
            throw new IllegalArgumentException("Input file path cannot be null.");
        }
        if (resultFilePath == null) {
            throw new IllegalArgumentException("Result file path cannot be null.");
        }
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(resultFilePath)))) {
            Files.lines(Paths.get(inputFilePath))
                    .filter(line -> line.matches("^[\\s\\d]+$"))
                    .map(string -> string.split("\\s+"))
                    .map(StreamProcessor::convert)
                    .forEach(row -> pw.println(row));
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
