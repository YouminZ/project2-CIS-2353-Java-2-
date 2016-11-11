/**
 * LeakStack interface adapter for Leaky Singly Linked List
 * Stack implementation
 *
 * Created by Youmin Zheng on 11/2/2016.
 * CIS 2353
 * Fall 2016
 * Prof. John P. Baugh
 */
public class LLInterfaceAdapter<E> implements LinkedListStack<E>{

    //declare and create a empty Singly Linked-List Stack
    public SinglyLLStack list = new SinglyLLStack();

    //adapter for isEmpty interface
    public boolean isEmpty(){
        return list.isEmpty();
    }//end isEmpty

    //adapter for push interface
    public void push(E element){
        list.addFirst(element);
    }//end push

    //adapter for pop interface
    public void pop(){
        list.removeFirst();
    }//end pop
}

