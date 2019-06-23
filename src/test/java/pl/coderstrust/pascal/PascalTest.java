package pl.coderstrust.pascal;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PascalTest {

    @Test
    @Parameters(method = "inputDataException")
    public void shouldThrownException(int rows) {
        //given
        Exception caughtException = null;
        //when
        try {
            Pascal.getPascalTriangle(rows);
        } catch (Exception e) {
            caughtException = e;
        }
        //then
        assertEquals(IllegalArgumentException.class, caughtException.getClass());
    }

    @Test
    @Parameters(method = "inputData")
    public void shouldReturnCorrectPascalTriangle(int rows, List<String> expected) {
        //given
        //when
        List<String> actual = Pascal.getPascalTriangle(rows);
        //then
        assertThat(actual, is(expected));
    }

    public Object[] inputDataException() {
        return new Object[]{
                new Object[]{-1}
        };
    }

    public Object[] inputData() {
        return new Object[]{
                new Object[]{5, Arrays.asList("                       1",
                        "                    1     1",
                        "                 1     2     1",
                        "              1     3     3     1",
                        "           1     4     6     4     1")},
                new Object[]{3, Arrays.asList("                 1",
                        "              1     1",
                        "           1     2     1")}
        };
    }
}
