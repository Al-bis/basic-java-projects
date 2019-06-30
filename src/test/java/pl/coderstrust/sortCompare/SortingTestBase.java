package pl.coderstrust.sortCompare;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() {
        // given
        int[] given = new int[]{5, 4, 3, 2, 1, 6, 8, 7, 9, 21, 2, 10};
        int[] expected = new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21};

        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptyArray() {
        // given
        int[] given = new int[]{};
        int[] expected = new int[]{};

        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnOneElementArray() {
        // given
        int[] given = new int[]{1};
        int[] expected = new int[]{1};

        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected, result);
    }
}
