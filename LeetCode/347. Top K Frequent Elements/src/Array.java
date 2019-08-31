/**
 * @author kevinshi721
 * @date 7/28/19 4:02 PM
 */

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * no param, default 10;
     */
    public Array() {
        this(10);
    }

    public Array(E[] arr) {
        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++)
            data[i] = arr[i];
        size = arr.length;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(E ele) {
        add(size, ele);
    }

    public void addFirst(E ele) {
        add(0, ele);
    }

    public void add(int index, E ele) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("AddLast failed. Require index >=0 and index <= size");

        if (size == data.length)
            resize(2 * data.length); // ArrayList = 1.5 * data.length

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = ele;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }

    public void set(int index, E ele) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = ele;
    }

    public boolean contains(E ele) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(ele))
                return true;
        }
        return false;
    }

    public int find(E ele) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(ele))
                return i;
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = data[index];

        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        size--;
        data[size] = null; // Loitering objects != memory leak; not necessary, user cannot see data[size]

        if (size == data.length / 4 && data.length / 2 != 0) // Amortized time complexity and to avoid complexity concussion, Array cannot be 0 capacity
            resize(data.length / 2);
        return ret;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E ele) {
        int index = find(ele);
        if (index != -1)
            remove(index);
    }

    public void swap(int i, int j) {

        if (i < 0 || i >= size || j < 0 || j >= size)
            throw new IllegalArgumentException("Index is illegal.");

        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }
}
