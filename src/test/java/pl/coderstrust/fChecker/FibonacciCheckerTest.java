package pl.coderstrust.fChecker;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FibonacciCheckerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"-1", "-2", "-3"})
    public void shouldThrownExceptionForInvalidArgument(long number) {
        thrown.expect(IllegalArgumentException.class);
        FibonacciChecker.isFibonacciNumber(number);
    }

    @Test
    @Parameters(method = "fibonacciArguments")
    public void shouldCheckIsThatFibonacciNumber(long number, boolean expected) {
        //when
        boolean actual = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertEquals(expected, actual);
    }

    public Object[] fibonacciArguments() {
        return new Object[]{
                new Object[]{0, true},
                new Object[]{1, true},
                new Object[]{2, true},
                new Object[]{4, false},
                new Object[]{5, true},
                new Object[]{10, false},
                new Object[]{13, true},
                new Object[]{15, false}
        };
    }
}
