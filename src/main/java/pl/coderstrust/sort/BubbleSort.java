package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (j < array.length - 1) {
                    if (sortedArray[j] > sortedArray[j + 1]) {
                        temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = temp;
                    }
                }
            }
        }
        return sortedArray;
    }
}
