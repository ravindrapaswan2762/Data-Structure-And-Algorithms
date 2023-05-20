package datastructureAndALGORITHM.linkedList;

import java.util.LinkedList;

public class LLtoQueuAdapter {
//  IN THE QUSUE, ADDING IN THE LAST AND REMOVING IN THE FIRST POSITION
//  FIFO - First In First Out(like rows front of the banks)

    LinkedList<Integer> list;
    public LLtoQueuAdapter(){
        list = new LinkedList<Integer>();
    }

//  -------------------------
    int size(){
        return list.size();
    }
//  -------------------------
    void add(int val){
        list.addLast(val);
    }
//  -------------------------
    int remove() {
        if (size() == 0) {
            System.out.println("Queu Underflow");
            return -1;
        } else {
            list.removeFirst();
        }
        return 0;
    }
//  --------------------------
    int peek(){
        if (size() == 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            list.getFirst();
        }
        return 0;
    }
// ---------------------------
}
