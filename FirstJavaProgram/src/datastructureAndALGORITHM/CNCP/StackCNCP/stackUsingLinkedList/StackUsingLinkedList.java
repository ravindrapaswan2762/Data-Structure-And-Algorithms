package datastructureAndALGORITHM.CNCP.StackCNCP.stackUsingLinkedList;
import datastructureAndALGORITHM.CNCP.LinkedList_CNCP.Node;

import java.util.EmptyStackException;

public class StackUsingLinkedList<T> {
    private Node<T> head;
    private int size;

    //-------------------------------------------Constructors
    StackUsingLinkedList(){

    }
    //-------------------------------------------

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(T ele){
        Node<T> newNode = new Node<T>(ele);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public T pop() throws EmptyStackException{
        if (head==null){
            throw new EmptyStackException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public T top() throws EmptyStackException{
        if (head==null){
            throw new EmptyStackException();
        }
        return head.data;
    }

    //Time Complexity of all func: O(1) if nodes inserted in front of the linked list
    //                             Other-wise top() func takes O(n) due to pop(), if nodes inserted in last.
}
