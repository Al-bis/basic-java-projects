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
    @Parameters(method = "inputDataException")
    public void shouldThrownException(long number) {
        thrown.expect(IllegalArgumentException.class);
        FibonacciChecker.isFibonacciNumber(number);
    }

    @Test
    @Parameters(method = "inputData")
    public void shouldReturnIfNumberIsFibonacci(long number, boolean expected) {
        //given
        //when
        boolean actual = FibonacciChecker.isFibonacciNumber(number);
        //then
        assertEquals(actual, expected);
    }

    public Object[] inputDataException() {
        return new Object[]{
                new Object[]{-1}
        };
    }

    public Object[] inputData() {
        return new Object[]{
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