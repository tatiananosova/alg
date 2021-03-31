package lesson3;

import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //b
    //    e
    //1 5


    public MyDeque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    /**
     * Метод добавления в очередь нового элемента
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertLast(T item) throws IllegalStateException {
        if (isFull()) {
            //реализовать расширение массива
            throw new IllegalStateException("Очередь заполнена");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    /**
     * Метод добавления в очередь нового элемента в начало списка
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertFirst(T item) throws IllegalStateException {
        if (isFull()) {
            //реализовать расширение массива
            throw new IllegalStateException("Очередь заполнена");
        }
        begin = prevIndex(begin);
        list[begin] = item;
        size++;
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T removeFirst() {
        T temp = peekFirst();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[prevIndex(end)];
    }

    public T removeLast() {
        T temp = peekLast();
        size--;
        end = prevIndex(end);
        list[end] = null;
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
    private int prevIndex(int index) {
        return (list.length + index - 1) % list.length;
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
}
