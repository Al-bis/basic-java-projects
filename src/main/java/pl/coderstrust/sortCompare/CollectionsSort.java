package pl.coderstrust.sortCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        int[] sortedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }
        return sortedArray;
    }
}
