package pl.coderstrust.partition;

import java.util.Arrays;

public class HoarePartition {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        int[] array = {1, 7, 9, 4, 3, 2, 8, 5, 4, 10, 5, 9, 11, 34, 2, 1, 9, 44, 4};
        int index = partition(array, 10);
        System.out.println("Partition result is: " + Arrays.toString(array));
        System.out.println("Index: " + index);
    }

    public static int partition(int[] array, int pivotIndex) {
        if (array.length == 1) {
            return 0;
        }
        int start = 0;
        int end = array.length - 1;
        int pivot = array[pivotIndex];
        if (pivotIndex != 0) {
            swap(array, start, pivotIndex);
        }
        start++;
        int lastLowerIndex = start;
        do {
            while (start != array.length && array[start] <= pivot) {
                lastLowerIndex = start;
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(array, start, end);
                lastLowerIndex = start;
                start++;
                end--;
            }
        } while (start <= end);
        if (array[lastLowerIndex] <= array[0]) {
            swap(array, 0, lastLowerIndex);
            return lastLowerIndex;
        }
        return 0;
    }

    private static void swap(int[] array, int s, int e) {
        int temp = array[s];
        array[s] = array[e];
        array[e] = temp;
    }
}
