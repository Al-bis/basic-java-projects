package pl.coderstrust.numbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> readLinesFromFile(String fileName) throws CustomException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            reader.lines().forEach((line) -> lines.add(line));
        } catch (IOException e) {
            throw new CustomException("File not found", e);
        }
        return lines;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) throws CustomException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(resultFileName))) {
            for (String line : resultLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new CustomException("Couldn't write to file", e);
        }
    }
}
