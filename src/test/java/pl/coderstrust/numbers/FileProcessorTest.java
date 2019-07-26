package pl.coderstrust.numbers;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FileProcessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"fileNotFound.txt"})
    public void shouldThrownExceptionWhenFileNotFound(String fileName) {
        thrown.expect(CustomException.class);
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.readLinesFromFile("src/test/resources/" + fileName);
    }

    @Test
    @Parameters(method = "shouldReadLinesFromFileArguments")
    public void shouldReadLinesFromFile(String fileName, List<String> expected) {
        // given
        FileProcessor fileProcessor = new FileProcessor();

        // when
        List<String> result = fileProcessor.readLinesFromFile("src/test/resources/" + fileName);

        // then
        assertEquals(expected, result);
    }

    public Object[] shouldReadLinesFromFileArguments() {
        return new Object[]{
                new Object[]{"testFile.txt", Arrays.asList(
                        "raz dwa 123 raz",
                        "dwa dwa 122 dwa")},
                new Object[]{"testFile2.txt", Arrays.asList(
                        "123 dwa dwa 432",
                        "dwa dwa raz dwa",
                        "123 432",
                        "dwa raz 123",
                        "432 1233 dwa dwa 1")},
                new Object[]{"emptyFile.txt", new ArrayList<>()},
        };
    }

    @Test
    @Parameters(method = "shouldWriteLinesToFileArguments")
    public void shouldWriteLinesToFile(String fileName, List<String> expected) {
        // given
        FileProcessor fileProcessor = new FileProcessor();

        // when
        fileProcessor.writeLinesToFile(expected, "src/test/resources/" + fileName);
        List<String> result = fileProcessor.readLinesFromFile("src/test/resources/" + fileName);

        // then
        assertEquals(expected, result);
    }

    public Object[] shouldWriteLinesToFileArguments() {
        return new Object[]{
                new Object[]{"writeFile.txt", Arrays.asList(
                        "raz dwa 123 raz",
                        "dwa dwa 122 dwa",
                        "dwa",
                        "12345 32123 aaa",
                        "raz 11")}
        };
    }
}
