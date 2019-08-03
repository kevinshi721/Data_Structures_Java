/**
 * @author kevinshi721
 * @date 8/3/19 11:11 AM
 */

public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E ele);

    E dequeue();

    E getFront();

}
