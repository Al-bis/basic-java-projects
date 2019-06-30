package pl.coderstrust.sortCompare;

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
            sortedArray[elementNumber] = sortedArray[i];
            sortedArray[i] = min;
        }
        return sortedArray;
    }
}
