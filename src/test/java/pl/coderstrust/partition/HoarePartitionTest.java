package pl.coderstrust.partition;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class HoarePartitionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters(method = "ExceptionArguments")
    public void shouldThrowExceptionForInvalidArgument(int[] array, int pivotIndex) {
        thrown.expect(IndexOutOfBoundsException.class);
        HoarePartition.partition(array, pivotIndex);
    }

    @Test
    @Parameters(method = "HoarePartitionArguments")
    public void shouldReturnCorrectHoarePartition(int[] actual, int pivotIndex, int[] expected) {
        //when
        HoarePartition.partition(actual, pivotIndex);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    public Object[] ExceptionArguments() {
        return new Object[]{
                new Object[]{new int[]{1, 2, 3}, 3}
        };
    }

    public Object[] HoarePartitionArguments() {
        return new Object[]{
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 0, new int[]{1, 7, 9, 4, 3, 2, 8, 5}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 1, new int[]{2, 1, 5, 4, 3, 7, 8, 9}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 2, new int[]{5, 7, 1, 4, 3, 2, 8, 9}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 3, new int[]{1, 2, 3, 4, 9, 7, 8, 5}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 4, new int[]{1, 2, 3, 4, 9, 7, 8, 5}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 5, new int[]{1, 2, 9, 4, 3, 7, 8, 5}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 6, new int[]{1, 7, 5, 4, 3, 2, 8, 9}},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 7, new int[]{3, 1, 2, 4, 5, 9, 8, 7}},
                new Object[]{new int[]{3, 7, 9, 4, 1, 2, 8, 5}, 4, new int[]{1, 7, 9, 4, 3, 2, 8, 5}},
                new Object[]{new int[]{2, 1, 2, 2, 1, 3, 3, 2}, 3, new int[]{2, 1, 2, 2, 1, 2, 3, 3}},
                new Object[]{new int[]{2, 1, 2, 2, 1, 3, 3, 2}, 1, new int[]{1, 1, 2, 2, 2, 3, 3, 2}}
        };
    }
}
