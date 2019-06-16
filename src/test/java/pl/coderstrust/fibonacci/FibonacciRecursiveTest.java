package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FibonacciRecursiveTest {

    @Test
    @Parameters(method = "inputData")
    public void fibonacciRecursiveResultCheck(long expectedValue, int fibonacciElement) {
        assertEquals(expectedValue, FibonacciRecursive.fibonacci(fibonacciElement));
    }

    public Object[] inputData() {
        return new Object[]{
                new Object[]{0, 0},
                new Object[]{1, 1},
                new Object[]{1, 2},
                new Object[]{2, 3},
                new Object[]{3, 4},
                new Object[]{5, 5},
                new Object[]{8, 6},
                new Object[]{13, 7},
        };
    }
}
