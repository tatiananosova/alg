package lesson4;

import java.util.NoSuchElementException;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();

    public void insert(T item) {
        ll.insertFirst(item);
    }

    public T peek() {
        return ll.getLast();
    }

    public T remove() {
        return ll.removeLast();
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    public int size() {
        return ll.size();
    }

    @Override
    public String toString() {
        return ll.toString();
    }
}
