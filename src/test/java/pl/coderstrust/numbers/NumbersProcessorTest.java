package pl.coderstrust.numbers;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters(method = "shouldConvertLineArguments")
    public void shouldConvertLine(String line, String expected) {
        // given
        NumbersProcessor numbersProcessor = new NumbersProcessor();

        // when
        String result = numbersProcessor.processLine(line);

        // then
        assertEquals(expected, result);
    }

    public Object[] shouldConvertLineArguments() {
        return new Object[]{
                new Object[]{" 10 20 30", "10+20+30=60"},
                new Object[]{"2 5 10", "2+5+10=17"},
                new Object[]{"1    2 3  4   5", "1+2+3+4+5=15"},
        };
    }
}
