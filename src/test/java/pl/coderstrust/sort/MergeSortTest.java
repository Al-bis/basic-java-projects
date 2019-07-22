package pl.coderstrust.sort;

public class MergeSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new MergeSort();
    }

}
