package pl.coderstrust.sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {2, 8, 1, 6, 5, 7, 3, 9, 4, 7, 2, 15, 124, 2, 3};
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        int[] bubbleResult = bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("BubbleSort: " + Arrays.toString(bubbleResult));
        int[] selectionResult = selectionSort.sort(array);
        System.out.println("SelectionSort: " + Arrays.toString(selectionResult));
    }
}
