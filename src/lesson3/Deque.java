package lesson3;

import java.util.NoSuchElementException;

public class Deque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final static int DEFAULT_CAPACITY = 10;
    private int begin;
    private int front;
    private int end;
    private int rear;

    public Deque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        end = capacity - 1;
        list = (T[]) new Object[capacity];
    }

    public Deque() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Метод добавления в очередь нового элемента
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertRight(T item) throws IllegalStateException {
        if (isFull()) increaseCapacity();
        size++;
        if (front == 0) {
            front = capacity - 1;
        }
        list[front] = item;
        front = previousIndex(front);
    }

    public void insertLeft(T item) throws IllegalStateException {
        if (isFull()) increaseCapacity();
        size++;
        list[rear] = item;
        rear = nextIndex(rear);
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[end];
    }

    public T removeRight() {
        T temp = peekRear();
        size--;
        list[end] = null;
        end = previousIndex(end);
        return temp;
    }

    public T removeLeft() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isFrontAtRearPosition() {
        return front == rear;
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

    private int previousIndex(int index) {
        return (index - 1) % list.length;
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
        while (i <= end) {
            T item = list[i];
            sb.append(item).append(", ");
            i++;
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" ]");
        return sb.toString();
    }
}

