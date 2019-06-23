package pl.coderstrust.christmas;

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
public class ChristmasTreeTest {

    @Test
    @Parameters(method = "inputDataException")
    public void shouldThrownException(int size) {
        //given
        Exception caughtException = null;
        //when
        try {
            ChristmasTree.getChristmasTree(size);
        } catch (Exception e) {
            caughtException = e;
        }
        //then
        assertEquals(IllegalArgumentException.class, caughtException.getClass());
    }

    @Test
    @Parameters(method = "inputData")
    public void shouldReturnCorrectChristmasTree(int size, List<String> expected) {
        //given
        //when
        List<String> actual = ChristmasTree.getChristmasTree(size);
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
                new Object[]{5, Arrays.asList("     *",
                        "    ***",
                        "   *****",
                        "  *******",
                        " *********",
                        "    **")},
                new Object[]{3, Arrays.asList("   *",
                        "  ***",
                        " *****",
                        "  **")}
        };
    }
}
