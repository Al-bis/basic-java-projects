package pl.coderstrust.sort;

public class CollectionsSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new CollectionsSort();
    }

}
