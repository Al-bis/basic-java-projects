package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @Test
    @Parameters(method = "sortingMethodsArguments")
    public void shouldSortSimpleArray(int[] given, int[] expected) {
        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected, result);
    }

    public Object[] sortingMethodsArguments() {
        return new Object[]{
                new Object[]{new int[]{5, 4, 3, 2, 1, 6, 8, 7, 9, 21, 2, 10}, new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21}},
                new Object[]{new int[]{}, new int[]{}},
                new Object[]{new int[]{1}, new int[]{1}},
                new Object[]{new int[]{1, 1}, new int[]{1, 1}},
                new Object[]{new int[]{3, 1}, new int[]{1, 3}},
                new Object[]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}},
                new Object[]{new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}},
                new Object[]{new int[]{2, 8, 5, 4, 1, 9, 3, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}},
                new Object[]{new int[]{2, 8, 1, 6, 5, 7, 3, 9, 4, 7, 2, 15, 124, 2, 3}, new int[]{1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 15, 124}},
                new Object[]{new int[]{2, 1, 3, 3, 1, 2}, new int[]{1, 1, 2, 2, 3, 3}},
                new Object[]{new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 2, 2, 2, 2}},
                new Object[]{new int[]{1, 1, 1}, new int[]{1, 1, 1}},
                new Object[]{new int[]{2, 4, 1, -2, -3, 1, 5, -2}, new int[]{-3, -2, -2, 1, 1, 2, 4, 5}}
        };
    }
}
