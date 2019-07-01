package pl.coderstrust.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int[] sortedArray = list.stream().mapToInt(Integer::intValue).toArray();
        return sortedArray;
    }
}
