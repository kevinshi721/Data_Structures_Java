/**
 * @author kevinshi721
 * @date 8/2/19 12:31 AM
 */

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E ele);

    E pop();

    E peak();
}
