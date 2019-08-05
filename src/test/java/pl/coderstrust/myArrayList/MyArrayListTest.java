package pl.coderstrust.myArrayList;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.*;

@RunWith(JUnitParamsRunner.class)
public class MyArrayListTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"-1"})
    public void shouldThrownExceptionWhenGivenCapacityIsInvalid(int initCapacity) {
        thrown.expect(IllegalArgumentException.class);
        new MyArrayList<>(initCapacity);
    }

    @Test
    @Parameters({"3"})
    public void shouldThrownExceptionWhenTryingToGetElementByInvalidIndex(int index) {
        thrown.expect(IllegalArgumentException.class);
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.get(index);
    }

    @Test
    @Parameters({"3"})
    public void shouldThrownExceptionWhenTryingToSetElementByInvalidIndex(int index) {
        thrown.expect(IllegalArgumentException.class);
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.set(index, 2L);
    }

    @Test
    @Parameters({"3"})
    public void shouldThrownExceptionWhenTryingToRemoveElementByInvalidIndex(int index) {
        thrown.expect(IllegalArgumentException.class);
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.remove(index);
    }

    @Test
    public void shouldReturnTrueIfMyArrayListIsEmpty() {
        List<Object> myArrayList = new MyArrayList<>();
        List<Object> arrayList = new ArrayList<>();

        assertTrue(myArrayList.isEmpty());
        assertEquals(myArrayList.isEmpty(), arrayList.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfMyArrayListHasElement() {
        List<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(null);
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(null);

        assertFalse(myArrayList.isEmpty());
        assertEquals(myArrayList.isEmpty(), arrayList.isEmpty());
    }

    @Test
    @Parameters(method = "myArrayListSizeArguments")
    public void shouldReturnGivenSizeAfterAddingGivenAmountOfElements(int expectedSize, ArrayList arrayList) {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);

        assertEquals(myArrayList.size(), expectedSize);
        assertEquals(myArrayList.size(), arrayList.size());
    }

    public Object[] myArrayListSizeArguments() {
        return new Object[]{
                new Object[]{5, new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L))}
        };
    }

    @Test
    public void shouldReturnSearchElementBaseOnGivenIndex() {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);
        Long element = myArrayList.get(3);

        assertEquals((Long) 4L, element);
    }

    @Test
    @Parameters({"9"})
    public void shouldSetElementBaseOnGivenIndex(Long givenElement) {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);
        myArrayList.set(2, givenElement);
        Long element = myArrayList.get(2);

        assertEquals(givenElement, element);
    }

    @Test
    public void shouldRemovedElementBaseOnGivenIndex() {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);
        myArrayList.remove(2);

        assertEquals(4, myArrayList.size());
        assertEquals((Long) 4L, myArrayList.get(2));
    }

}
