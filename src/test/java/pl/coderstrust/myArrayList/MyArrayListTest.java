package pl.coderstrust.myArrayList;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

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

        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfMyArrayListHasElement() {
        List<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(null);

        assertFalse(myArrayList.isEmpty());
    }

    @Test
    @Parameters(method = "myArrayListSizeArguments")
    public void shouldReturnGivenSizeAfterAddingGivenAmountOfElements(int expectedSize) {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);

        assertEquals(myArrayList.size(), expectedSize);
    }

    public Object[] myArrayListSizeArguments() {
        return new Object[]{
                new Object[]{5}
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

    @Test
    @Parameters(method = "myArrayListToArrayArguments")
    public void shouldReturnArray(Object[] expectedArray) {
        List<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        Object[] array = myArrayList.toArray();

        assertArrayEquals(expectedArray, array);
    }

    public Object[] myArrayListToArrayArguments() {
        return new Object[]{
                new Object[]{new Object[]{1L, 2L, 3L}}
        };
    }

    @Test
    public void shouldRemovedElementBaseOnGivenObject() {
        List<Long> myArrayList = new MyArrayList<>();
        Long object = 3L;
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(4L);
        myArrayList.add(5L);
        myArrayList.remove(object);

        assertEquals(4, myArrayList.size());
        assertEquals((Long) 4L, myArrayList.get(2));
    }

    @Test
    public void shouldClearMyArrayList() {
        List<Long> myArrayList = new MyArrayList<>();
        List<Long> emptyMyArrayList = new MyArrayList<>();
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.clear();
        Object[] myArray = myArrayList.toArray();
        Object[] myEmptyArray = myArrayList.toArray();

        assertEquals(emptyMyArrayList.size(), myArrayList.size());
        assertArrayEquals(myEmptyArray, myArray);
    }

}
