package pl.coderstrust.myarraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

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
    }
    size = 0;
    capacity = initCapacity;
    array = new Object[capacity];
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
    if (o == null) {
      throw new NullPointerException("Given element cannot be null");
    }
    for (int i = 0; i < size; i++) {
      if (o.equals(array[i])) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return new MyArrayListIterator();
  }

  @Override
  public Object[] toArray() {
    Object[] actualArray = new Object[size];
    System.arraycopy(array, 0, actualArray, 0, size);
    return actualArray;
  }

  @Override
  public <T> T[] toArray(T[] a) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean add(T element) {
    resize();
    array[size++] = element;
    return true;
  }

  private void resize() {
    if (size == capacity) {
      array = Arrays.copyOf(array, capacity * 2);
    }
  }

  @Override
  public boolean remove(Object o) {
    int i = indexOf(o);
    if (i >= 0) {
      remove(i);
      return true;
    }
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(Collection<? extends T> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(int index, Collection<? extends T> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void clear() {
    size = 0;
    capacity = 10;
    array = new Object[capacity];
  }

  @Override
  public T get(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException("Given index is out of list size.");
    }
    if (index < 0) {
      throw new IndexOutOfBoundsException("Given index cannot have negative value.");
    }
    return (T) array[index];
  }

  @Override
  public T set(int index, T element) {
    if (index >= size) {
      throw new IllegalArgumentException("Given index is out of list size.");
    }
    if (index < 0) {
      throw new IllegalArgumentException("Given index cannot have negative value.");
    }
    T oldElement = (T) array[index];
    array[index] = element;
    return oldElement;
  }

  @Override
  public void add(int index, T element) {
    throw new UnsupportedOperationException();
  }

  @Override
  public T remove(int index) {
    if (index >= size) {
      throw new IllegalArgumentException("Given index is out of list size.");
    }
    if (index < 0) {
      throw new IllegalArgumentException("Given index cannot have negative value.");
    }
    T oleElement = (T) array[index];
    resize(index);
    array[--size] = null;
    return oleElement;
  }

  private void resize(int index) {
    int numberMoved = size - index - 1;
    if (numberMoved > 0) {
      System.arraycopy(array, index + 1, array, index, numberMoved);
    }
  }

  @Override
  public int indexOf(Object o) {
    if (o == null) {
      for (int i = 0; i < size; i++) {
        if (array[i] == null) {
          return i;
        }
      }
    } else {
      for (int i = 0; i < size; i++) {
        if (o.equals(array[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<T> listIterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<T> subList(int fromIndex, int toIndex) {
    throw new UnsupportedOperationException();
  }

  private class MyArrayListIterator implements Iterator<T> {

    private int cursor;

    @Override
    public boolean hasNext() {
      return cursor != size;
    }

    @Override
    public T next() {
      return (T) array[cursor++];
    }

    @Override
    public void remove() {
      MyArrayList.this.remove(cursor);
    }
  }

}
