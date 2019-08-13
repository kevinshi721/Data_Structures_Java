/**
 * @author kevinshi721
 * @date 8/11/19 3:35 PM
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
