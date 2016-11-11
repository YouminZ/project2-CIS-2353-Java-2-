/**
 * Created by Youmin Zheng on 11/2/2016.
 * CIS 2353
 * Fall 2016
 * Prof. John P. Baugh
 */
public class SinglyLLStack<E> {
    //------------------- nested Node class -------------------
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }//end node

        public E getElement(){
            return element;
        }//end getElement

        public Node<E> getNext(){
            return next;
        }//end getNext

        public void setNext(Node<E> n){
            next = n;
        }//end setNext
    }//---------- end of nested Node class ----------

    //instance variable of the LeakySinglyLLStack
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLLStack(){}//end constructor

    //check to see if the Linked List is empty
    public boolean isEmpty(){
        return size == 0;
    }//end isEmpty

    //adds a element to the top of the stack
    public void addFirst(E e){
        head = new Node<>(e, head);
        if(size == 0){
            tail = head;
        }
        size++;
    }//end addFirst

    //pops the top element of the stack and return it
    public void removeFirst() throws NullPointerException{
        try {
            E answer = head.getElement();
            head = head.getNext();
            size--;
            if(size == 0){
                tail = null;
            }
        } catch (Exception e) {
            System.out.println("Sorry, input is NOT well-formed");
        }
    }//end removeFirst
}
