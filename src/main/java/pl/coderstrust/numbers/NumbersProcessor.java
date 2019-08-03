package pl.coderstrust.numbers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class NumbersProcessor {

    String processLine(String line) {
        String[] numbers = line.split(" +");

        String joined = Stream.of(numbers)
                .filter((String s) -> s.length() > 0)
                .collect(Collectors.joining("+"));

        Integer sum = Stream.of(numbers)
                .filter((String s) -> s.length() > 0)
                .map(Integer::parseInt)
                .collect(Collectors.summingInt(value -> value));

        return String.format("%s=%d", joined, sum);
    }

}
