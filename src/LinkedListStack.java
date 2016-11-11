/**
 * A collection of objects that are inserted and removed according
 * to the last-in first-out principle. Although similar in purpose,
 * this interface differs from java.util.Stack.
 *
 * Created by Youmin Zheng on 11/2/2016.
 * CIS 2353
 * Fall 2016
 * Prof. John P. Baugh
 */
public interface LinkedListStack<E> {
    /**
     * Tests wherther the stack is empty.
     * @return true if the stack i s empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack.
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Removes and returns the top element from the stack.
     * @return element removed (or null if empty)
     */
    void pop();
}
