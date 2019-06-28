package pl.coderstrust.foobar;

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
public class FooBarTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"-1", "-2", "-3"})
    public void shouldThrowExceptionForInvalidArgument(int amount) {
        thrown.expect(IllegalArgumentException.class);
        FooBar.getFooBar(amount);
    }

    @Test
    @Parameters(method = "fooBarArguments")
    public void shouldReturnCorrectFooBar(int amount, List<String> expected) {
        //when
        List<String> actual = FooBar.getFooBar(amount);

        //then
        assertThat(actual, is(expected));
    }

    public Object[] fooBarArguments() {
        return new Object[]{
                new Object[]{10, Arrays.asList("0 FooBar", "1 ", "2 ", "3 Foo", "4 ", "5 Bar", "6 Foo", "7 ", "8 ", "9 Foo", "10 Bar")},
                new Object[]{5, Arrays.asList("0 FooBar", "1 ", "2 ", "3 Foo", "4 ", "5 Bar")},
                new Object[]{0, Arrays.asList("0 FooBar")}
        };
    }
}
