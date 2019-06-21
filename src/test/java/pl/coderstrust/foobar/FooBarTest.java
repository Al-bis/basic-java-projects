package pl.coderstrust.foobar;

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
public class FooBarTest {

    @Test
    public void shouldThrownException() {
        //given
        Exception caughtException = null;
        //when
        try {
            FooBar.getFooBar(-1);
        } catch (Exception e) {
            caughtException = e;
        }
        //then
        assertEquals(IllegalArgumentException.class, caughtException.getClass());
    }

    @Test
    @Parameters(method = "inputData")
    public void shouldReturnCorrectFooBar(int amount, List<String> expected) {
        //given
        //when
        List<String> actual = FooBar.getFooBar(amount);
        //then
        assertThat(actual, is(expected));
    }

    public Object[] inputData() {
        return new Object[]{
                new Object[]{10, Arrays.asList("0 FooBar", "1 ", "2 ", "3 Foo", "4 ", "5 Bar", "6 Foo", "7 ", "8 ", "9 Foo")},
                new Object[]{5, Arrays.asList("0 FooBar", "1 ", "2 ", "3 Foo", "4 ")},
        };
    }
}
