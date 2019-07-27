package pl.coderstrust.myArrayList;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyArrayList implements List<Long> {

    private int size;
    private int capacity;
    private Long[] array;

    ArrayList<Long> ar = new ArrayList<>();

    public MyArrayList() {
        size = 0;
        capacity = 10;
        array = new Long[capacity];
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
    public void forEach(Consumer<? super Long> action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    //@Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

    @Override
    public boolean add(Long aLong) {
        if (size == capacity) {
            capacity *= 2;
            Long[] tempArray = new Long[capacity];
            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = aLong;
        size++;
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
    public boolean removeIf(Predicate<? super Long> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<Long> operator) {

    }

    @Override
    public void sort(Comparator<? super Long> c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Long get(int index) {
        return null;
    }

    @Override
    public Long set(int index, Long element) {
        return null;
    }

    @Override
    public void add(int index, Long element) {

    }

    @Override
    public Long remove(int index) {
        return null;
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

    @Override
    public Spliterator<Long> spliterator() {
        return null;
    }

    @Override
    public Stream<Long> stream() {
        return null;
    }

    @Override
    public Stream<Long> parallelStream() {
        return null;
    }
}
