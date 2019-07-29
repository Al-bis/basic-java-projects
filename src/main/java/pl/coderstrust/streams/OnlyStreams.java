package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class OnlyStreams {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/1000.txt");
        Files.lines(path)
                .filter(line -> line.matches("^[ 0-9]+$"))
                //.map(string -> string.split(" +"))
                .flatMap(Pattern.compile(" +")::splitAsStream)
                .reduce("+", String::concat);
        //.collect(Collectors.joining("+"))
        //.forEach(System.out::println);
    }
}
