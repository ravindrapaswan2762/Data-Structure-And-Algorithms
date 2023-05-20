package datastructureAndALGORITHM.CNCP.QueueCNCP.queueUsingLL;

import datastructureAndALGORITHM.CNCP.LinkedList_CNCP.Node;
import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueEmptyException;
import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueFullException;

public class QueueUsingLL<T> {
    Node<T> front; // poping area
    Node<T> rear; // adding area
    int size;

    QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    //---------------------------
    public boolean isEmpty(){
        return size==0;
    }
    //---------------------------
    public void doubleCapacity(){

    }
    public void enqueue(T ele){
        Node<T> newNode = new Node<>(ele);
        size++;
        if (rear == null){
            rear = newNode;
            front = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    //---------------------------
    public T dequeue() throws QueueEmptyException {
        if (front == null){
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if (front==null){
            rear = null;
        }
        size--;
        return temp;

    }
    //---------------------------
    public T front() throws QueueEmptyException {
        if (front == null){
            throw new QueueEmptyException();
        }
        return front.data;
    }
}
