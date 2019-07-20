package pl.coderstrust.numbers;

public class Main {

    public static void main(String[] args) {
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        processor.process("src/main/resources/1000.txt", "src/main/resources/result.txt");
    }
}
