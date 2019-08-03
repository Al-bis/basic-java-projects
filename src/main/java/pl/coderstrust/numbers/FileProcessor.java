package pl.coderstrust.numbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileProcessor {

    List<String> readLinesFromFile(String fileName) throws FileProcessorException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            reader.lines().forEach((lines::add));
        } catch (IOException e) {
            throw new FileProcessorException("Unable to read file. ", e);
        }
        return lines;
    }

    void writeLinesToFile(List<String> resultLines, String resultFilePath) throws FileProcessorException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(resultFilePath))) {
            for (String line : resultLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileProcessorException("Unable to write file. ", e);
        }
    }
}
