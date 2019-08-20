package pl.coderstrust.whatsnew;

import java.util.stream.Stream;

public class IntroducedInJava8 {

  public static void main(String[] args) {
    java8Demo();
  }

  private static void java8Demo() {
    Stream.of("A1", "B2", "A2", "C3", "D4", "E5", "A3")
        .filter(s -> s.startsWith("A"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);
  }

}
