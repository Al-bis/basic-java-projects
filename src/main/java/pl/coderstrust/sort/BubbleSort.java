package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (j < array.length - 1) {
                    if (sortedArray[j] > sortedArray[j + 1]) {
                        sort(sortedArray, j);
                    }
                }
            }
        }
        return sortedArray;
    }

    private static void sort(int[] array, int a) {
        int temp = array[a];
        array[a] = array[a + 1];
        array[a + 1] = temp;
    }
}