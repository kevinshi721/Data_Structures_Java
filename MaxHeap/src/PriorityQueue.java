/**
 * @author kevinshi721
 * @date 8/31/19 4:10 PM
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {

    private MaxHeap<E> maxHeap;

    public PriorityQueue(){
        maxHeap = new MaxHeap<>();
    }


    @Override
    public int getSize() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    @Override
    public E getFront() {
        return maxHeap.findMax() ;
    }

    @Override
    public void enqueue(E ele) {
        maxHeap.add(ele);
    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }
}
