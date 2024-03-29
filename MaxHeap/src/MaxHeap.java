/**
 * @author kevinshi721
 * @date 8/21/19 11:05 PM
 */

public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap(E[] arr) {

        data = new Array<>(arr);
        for (int i = parent(arr.length - 1); i >= 0; i--)
            siftDown(i);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    public int size() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private int parent(int index) {
        if (index == 0)
            throw new IllegalArgumentException("index-0 doesn't have parent");
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    public E findMax() {
        if (data.getSize() == 0)
            throw new IllegalArgumentException("Can not findMax when heap is empty");
        return data.get(0);
    }

    public E extractMax() {
        E res = findMax();

        data.swap(0, data.getSize() - 1);
        data.removeLast();
        siftDown(0);

        return res;
    }

    private void siftDown(int k) {

        while (leftChild(k) < data.getSize()) {
            int i = leftChild(k);

            if (i + 1 < data.getSize() &&
                    data.get(i).compareTo(data.get(i + 1)) < 0)
                i = rightChild(k);

            if (data.get(k).compareTo(data.get(i)) >= 0)
                break;

            data.swap(k, i);
            k = i;
        }
    }

    public E replace(E e) {

        E res = findMax();
        data.set(0, e);
        siftDown((0));
        return res;
    }

}
