package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (sortedArray[j] < sortedArray[min]) {
                    min = j;
                }
            }
            swap(sortedArray, min, i);
        }
        return sortedArray;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
