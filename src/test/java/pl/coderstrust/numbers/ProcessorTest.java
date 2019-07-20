package pl.coderstrust.numbers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    NumbersProcessor numbersProcessor;
    @Mock
    FileProcessor fileProcessor;

    @InjectMocks
    Processor processor;

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() {
        // given
        when(fileProcessor.readLinesFromFile("fileName.txt")).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");
        when(numbersProcessor.processLine("4 5 6")).thenReturn("4+5+6=15");

        // when
        processor.process("fileName.txt", "output.txt");

        // then
        verify(fileProcessor, times(1)).readLinesFromFile("fileName.txt");
        //verify(numbersProcessor, times(2)).processLine();
        //verify(fileProcessor).writeLinesToFile(...
    }
}
