package pl.coderstrust.sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {2, 8, 1, 6, 5, 7, 3, 9, 4, 7, 2, 15, 124, 2, 3};
        int[] bubbleResult = BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("BubbleSort: " + Arrays.toString(bubbleResult));
        int[] selectionResult = SelectionSort.sort(array);
        System.out.println("SelectionSort: " + Arrays.toString(selectionResult));
    }
}
