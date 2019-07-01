package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int min;
        int elementNumber;
        for (int i = 0; i < array.length; i++) {
            min = sortedArray[i];
            elementNumber = 0 + i;
            for (int j = 0 + i; j < array.length; j++) {
                if (sortedArray[j] <= min) {
                    min = sortedArray[j];
                    elementNumber = j;
                }
            }
            swap(sortedArray, elementNumber, i, min);
        }
        return sortedArray;
    }

    private void swap(int[] array, int elementNumber, int i, int min) {
        array[elementNumber] = array[i];
        array[i] = min;
    }
}
