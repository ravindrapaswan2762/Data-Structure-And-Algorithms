package datastructureAndALGORITHM.linkedList;

import java.util.LinkedList;

public class LLstackAdapter extends  LinkedLIstDataStructure {
//  remove or add or get... anything else do at the first(top) position
    LinkedList<Integer> list;
    public LLstackAdapter(){
        list = new LinkedList<Integer>();
    }

//  -------------------------
    int size(){
        return list.size();
    }
//  -------------------------
    void push(int val){
        list.addFirst(val);
    }
//  -------------------------
    int pop() {
        if (size() == 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            list.removeFirst();
        }
        return 0;
    }
//  --------------------------
    int top(){
        if (size() == 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            list.getFirst();
        }
        return 0;
    }
//  ---------------------------

}
