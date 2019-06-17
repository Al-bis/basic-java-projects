package pl.coderstrust.sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        //int[] array = {2, 8, 1, 6, 5, 7, 3, 9, 4};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] bubbleResult = BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("BubbleSort: " + Arrays.toString(bubbleResult));
        int[] selectionResult = SelectionSort.sort(array);
        System.out.println("SelectionSort: " + Arrays.toString(selectionResult));
    }
}
