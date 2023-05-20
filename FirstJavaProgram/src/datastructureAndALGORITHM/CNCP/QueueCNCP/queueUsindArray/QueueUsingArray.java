package datastructureAndALGORITHM.CNCP.QueueCNCP.queueUsindArray;

import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueEmptyException;
import datastructureAndALGORITHM.CNCP.QueueCNCP.QueueFullException;

public class QueueUsingArray {
    private int[] data;
    private int front;// index of element at the front of the queue
    private int rear;// index of element at the rear/last of the queue
    int size;
    //------------------------------------------------------Constructors
    QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }
    QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }
    //-----------------------------------------------------
    public int size(){
        return size;
    }
    //---------------------------
    public boolean isEmpty(){
        return size==0;
    }
    //---------------------------
    public void doubleCapacity(){
        int[] temp = data;
        int idx = 0;
        data = new int[2*temp.length];
        for (int i=front; i<temp.length; i++){ //copying all data from front to end
            data[idx] = temp[front];
            idx++;
        }
        for (int i=0; i<front-1; i++){ //copying all data of behind the front
            data[idx] = temp[i];
            idx++;
        }
        front = 0;
        rear = temp.length-1;
    }
    public void enqueue(int ele) throws QueueFullException{
        if (size == data.length){
            doubleCapacity();
        }
        if (size==0){
            front = 0;
        }
//        rear++;
//        if (rear==data.length){
//        }
        rear = (rear+1)%data.length;  // it means some space is available behind the front side.
                                      // then we can use that space as a cercular queue.

        data[rear] = ele;
        size++;
    }
    //---------------------------
    public int dequeue() throws QueueEmptyException {
        if (size==0){
            throw new QueueEmptyException();
        }
        int temp = data[front];

//        front++;
//        if (front==data.length){
//            front = 0;
//        }
        front = (front+1)% data.length; // it means some value is available in the begining.
                                      // then we can access that value using cercular queue.
        size--;
        if (size==0){
            front = -1;
            rear = -1;
        }
        return temp;

    }
    //---------------------------
    public int front() throws QueueEmptyException {
        if (size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }


    //TIME COMPLEXITY : O(1) of all functions
}
