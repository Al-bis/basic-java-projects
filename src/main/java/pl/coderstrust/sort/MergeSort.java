package pl.coderstrust.sort;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        mergeSort(sortedArray, sortedArray.length);
        return sortedArray;
    }

    private static void mergeSort(int[] array, int lenght) {
        if (lenght < 2) {
            return;
        }
        int mid = lenght / 2;
        int[] left = new int[mid];
        int[] right = new int[lenght - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < lenght; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, lenght - mid);
        merge(array, left, right, mid, lenght - mid);
    }

    private static void merge(int[] array, int[] leftA, int[] rightA, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftA[i] <= rightA[j]) {
                array[k] = leftA[i];
                k++;
                i++;
            } else {
                array[k] = rightA[j];
                k++;
                j++;
            }
        }
        while (i < left) {
            array[k] = leftA[i];
            k++;
            i++;
        }
        while (j < right) {
            array[k] = rightA[j];
            k++;
            j++;
        }
    }
}
