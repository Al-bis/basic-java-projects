package pl.coderstrust.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCompare {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1, 3, 5, 7, 4, 7, 4, 2, 11, 6, 34, 103, 43, 32, 3, 1, 5, 10, 11, 455, 2, 1};
        List<SortingMethod> sortTypes = new ArrayList<>();
        sortTypes.add(new BubbleSort());
        sortTypes.add(new SelectionSort());
        sortTypes.add(new CollectionsSort());
        sortTypes.add(new QuickSort());
        sortTypes.add(new MergeSort());
        for (SortingMethod sm : sortTypes) {
            System.out.println("Result for " + sm.getClass().getSimpleName() + " is " + Arrays.toString(sm.sort(array)));
        }
    }
}
