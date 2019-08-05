package pl.coderstrust.myArrayList;

import java.util.*;

public class MyArrayList<Long> implements List<Long> {

    private int size;
    private int capacity;
    private Object[] array;

    public MyArrayList() {
        size = 0;
        capacity = 10;
        array = new Object[capacity];
    }

    public MyArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException("Illegal capacity:" + initCapacity);
        } else if (initCapacity < 10) {
            capacity = 10;
        } else {
            size = 0;
            capacity = initCapacity;
            array = new Object[capacity];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Long> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Long element) {
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity * 2);
        }
        array[size++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Long get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Given index is out of list size.");
        }
        return (Long) array[index];
    }

    @Override
    public Long set(int index, Long element) {
        if (index >= size) {
            throw new IllegalArgumentException("Given index is out of list size.");
        }
        Long oldElement = (Long) array[index];
        array[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, Long element) {

    }

    @Override
    public Long remove(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Given index is out of list size.");
        }
        Long oleElement = (Long) array[index];
        int numberMoved = size - index - 1;
        if (numberMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numberMoved);
        }
        array[--size] = null;
        return oleElement;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Long> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Long> listIterator(int index) {
        return null;
    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }

}
