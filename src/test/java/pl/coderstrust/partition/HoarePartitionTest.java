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
    public void shouldThrowExceptionForInvalidPivotIndex(int[] array, int pivotIndex) {
        thrown.expect(IndexOutOfBoundsException.class);
        HoarePartition.partition(array, pivotIndex);
    }

    public Object[] ExceptionArguments() {
        return new Object[]{
                new Object[]{new int[]{1, 2, 3}, 3}
        };
    }

    @Test
    @Parameters(method = "HoarePartitionArguments")
    public void shouldReturnCorrectHoarePartition(int[] actual, int pivotIndex) {
        //when
        int index = HoarePartition.partition(actual, pivotIndex);
        boolean leftSide = isLeftSideElementsLowerOrEqualsIndexValue(actual, index);
        boolean rightSide = isRightSideElementsBiggerThanIndexValue(actual, index);

        //then
        Assert.assertTrue(leftSide);
        Assert.assertTrue(rightSide);
    }

    private boolean isLeftSideElementsLowerOrEqualsIndexValue(int[] actual, int index) {
        for (int i = 0; i < index; i++) {
            if (actual[i] > actual[index]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRightSideElementsBiggerThanIndexValue(int[] actual, int index) {
        for (int i = index + 1; i < actual.length; i++) {
            if (actual[i] <= actual[index]) {
                return false;
            }
        }
        return true;
    }

    public Object[] HoarePartitionArguments() {
        return new Object[]{
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 0},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 1},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 2},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 3},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 4},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 5},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 6},
                new Object[]{new int[]{1, 7, 9, 4, 3, 2, 8, 5}, 7},
                new Object[]{new int[]{3, 7, 9, 4, 1, 2, 8, 5}, 4},
                new Object[]{new int[]{2, 1, 2, 2, 1, 3, 3, 2}, 3},
                new Object[]{new int[]{2, 1, 2, 2, 1, 3, 3, 2}, 1}
        };
    }
}
