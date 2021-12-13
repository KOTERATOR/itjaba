package ru.mirea.it;

import java.sql.Array;

public class MyArrayList<T> {
    private Object[] array;
    private int count;

    public MyArrayList() {
        array = new Object[10];
    }

    public MyArrayList(int capacity) {
        array = new Object[capacity];
    }

    private void ensureSize(int newSize) {
        if (newSize > array.length)
        {
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public void shrink() {
        if (count < array.length)
        {
            Object[] newArray = new Object[count];
            System.arraycopy(array, 0, newArray, 0, count);
            array = newArray;
        }
    }

    public void add(T item) {
        ensureSize(count+1);
        array[count] = item;
        count++;
    }

    public void add(T item, int index) {
        if (index >= 0 && index <= count) {
            ensureSize(count + 1);
            for (int i = count; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = item;
            count++;
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            count--;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public T get(int index) {
        if (index < 0 || index > count-1)
            throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    public int size() {
        return count;
    }

    public void clear() {
        for (int i = 0; i < count; i++)
        {
            array[i] = null;
        }
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
        {
            sb.append(array[i].toString());
            if (i < count - 1)
                sb.append(", ");
        }
        return sb.toString();
    }
}
