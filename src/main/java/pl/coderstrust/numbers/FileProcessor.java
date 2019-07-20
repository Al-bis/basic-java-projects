package pl.coderstrust.numbers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    public List<String> readLinesFromFile(String fileName) throws CustomException {
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("File not found", e);
        }
        return lines;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) throws CustomException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(resultFileName))) {
            for (String line : resultLines) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new CustomException("Couldn't write to file", e);
        }
    }
}
