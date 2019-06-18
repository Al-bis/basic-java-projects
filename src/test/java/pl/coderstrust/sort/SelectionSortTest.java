package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class SelectionSortTest {

    @Test
    @Parameters(method = "inputData")
    public void selectionSortVerification(int[] expectedArray, int[] notSortedArray) {
        assertArrayEquals(expectedArray, SelectionSort.sort(notSortedArray));
    }

    public Object[] inputData() {
        return new Object[]{
                new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}},
                new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 8, 5, 4, 1, 9, 3, 6, 7}},
                new Object[]{new int[]{1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 15, 124}, new int[]{2, 8, 1, 6, 5, 7, 3, 9, 4, 7, 2, 15, 124, 2, 3}},
                new Object[]{new int[]{1, 1, 2, 2, 3, 3}, new int[]{2, 1, 3, 3, 1, 2}},
                new Object[]{new int[]{1, 2, 2, 2, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}},
                new Object[]{new int[]{1, 1, 1}, new int[]{1, 1, 1}},
                new Object[]{new int[]{-3, -2, -2, 1, 1, 2, 4, 5}, new int[]{2, 4, 1, -2, -3, 1, 5, -2}}
        };
    }
}