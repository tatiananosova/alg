package lesson3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //b
    //  e
    //8


    public MyQueue(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    /**
     * Метод добавления в очередь нового элемента
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insert(T item) throws IllegalStateException {
        if (isFull()) increaseCapacity();
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);

        return temp;
    }


    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private void increaseCapacity() {
        capacity = (int) (capacity + (capacity * 0.25));
        T[] newList = (T[]) new Comparable[capacity];
        System.arraycopy(list, 0, newList, 0, size);
        list = newList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        int i = begin;
        while (i != end) {
            sb.append(list[i]).append(", ");
            i = nextIndex(i);
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" ]");
        return sb.toString();
    }

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        // b...e
        if (begin < end) {
            System.arraycopy(list, begin, tempArr, 0, size);
            begin = 0;
            end = size;
        } else {
            System.arraycopy(list, begin, tempArr, 0, list.length - begin);
            System.arraycopy(list, 0, tempArr, list.length - begin, end);
            begin = 0;
            end = size;
        }
        //...e  b...
//        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }
}
