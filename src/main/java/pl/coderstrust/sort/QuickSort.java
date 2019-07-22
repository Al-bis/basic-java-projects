package pl.coderstrust.sort;

import java.util.Arrays;

public class QuickSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        quickSort(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    private static void quickSort(int[] array, int start, int end) {
        if (array.length < 2) {
            return;
        }
        int indexS = start;
        int indexE = end;
        int pivot = array[(start + end) / 2];
        do {
            while (array[indexS] < pivot) {
                indexS++;
            }
            while (array[indexE] > pivot) {
                indexE--;
            }
            if (indexS <= indexE) {
                swap(array, indexS, indexE);
                indexS++;
                indexE--;
            }
        } while (indexS <= indexE);
        if (start < indexE) {
            quickSort(array, start, indexE);
        }
        if (end > indexS) {
            quickSort(array, indexS, end);
        }
    }

    private static void swap(int[] array, int s, int e) {
        int temp = array[s];
        array[s] = array[e];
        array[e] = temp;
    }
}
