package pl.coderstrust.christmas;

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
public class ChristmasTreeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"-1", "-2", "-3"})
    public void shouldThrowExceptionForInvalidArgument(int size) {
        thrown.expect(IllegalArgumentException.class);
        ChristmasTree.getChristmasTree(size);
    }

    @Test
    @Parameters(method = "christmasTreeArguments")
    public void shouldReturnCorrectChristmasTree(int size, List<String> expected) {
        //when
        List<String> actual = ChristmasTree.getChristmasTree(size);

        //then
        assertThat(actual, is(expected));
    }

    public Object[] christmasTreeArguments() {
        return new Object[]{
                new Object[]{5, Arrays.asList(
                        "     *",
                        "    ***",
                        "   *****",
                        "  *******",
                        " *********",
                        "    **")},
                new Object[]{3, Arrays.asList(
                        "   *",
                        "  ***",
                        " *****",
                        "  **")}
        };
    }
}
