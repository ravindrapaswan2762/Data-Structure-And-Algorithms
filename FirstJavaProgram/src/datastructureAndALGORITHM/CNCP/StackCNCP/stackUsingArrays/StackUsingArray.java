package datastructureAndALGORITHM.CNCP.StackCNCP.stackUsingArrays;

import datastructureAndALGORITHM.CNCP.StackCNCP.StackEmptyException;

public class StackUsingArray {
    private int[] data;
    private int topIndex;
    //-----------------------------------------------------------------------constructors
    public StackUsingArray(){
        data = new int[10];
        topIndex = -1; // index of the top most element of the stack.
    }
    StackUsingArray(int size){
        data = new int[size];
        topIndex = -1;
    }

    //---------------------------------------------------------------------------
    public boolean isEmpty(){
        return topIndex == -1;
    }
    //-----------------------
    public int size(){
        return topIndex+1;
    }
    //------------------------
    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2* temp.length];
        for (int i=0; i<temp.length; i++){
            data[i] = temp[i];
        }
    }
    public void push(int ele){
        if (topIndex == data.length-1){
            doubleCapacity();
        }

        topIndex++;
        data[topIndex] = ele;
    }
    //------------------------
    public int pop() throws StackEmptyException {
        if (topIndex==-1){
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;

    }
    //------------------------
    public int top() throws StackEmptyException{
        if (topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }


//   TIME COMPLEXITY: O(1) of all functions due to managing topIndex.
//                    But for doubleCapacity function will be O(n);

}
