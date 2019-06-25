package pl.coderstrust.multiplication;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationTableTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters(method = "inputDataException")
    public void shouldThrownException(int size) {
        thrown.expect(IllegalArgumentException.class);
        MultiplicationTable.getMultiplicationTable(size);
    }

    @Test
    @Parameters(method = "inputData")
    public void shouldReturnCorrectMultiplicationTable(int size, List<String> expected) {
        //given
        //when
        List<String> actual = MultiplicationTable.getMultiplicationTable(size);
        //then
        assertThat(actual, is(expected));
    }

    public Object[] inputDataException() {
        return new Object[]{
                new Object[]{-1},
                new Object[]{13}
        };
    }

    public Object[] inputData() {
        return new Object[]{
                new Object[]{4, Arrays.asList(
                        "           1     2     3     4",
                        "     1     1     2     3     4",
                        "     2     2     4     6     8",
                        "     3     3     6     9    12",
                        "     4     4     8    12    16")},
                new Object[]{2, Arrays.asList(
                        "           1     2",
                        "     1     1     2",
                        "     2     2     4")}
        };
    }
}
